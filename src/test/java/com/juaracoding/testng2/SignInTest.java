package com.juaracoding.testng2;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.juaracoding.testng.SignIn;

public class SignInTest {
    private SignIn signIn;

  @BeforeClass
  public void setup() {
    signIn = new SignIn();
  }

 @Test(invocationCount = 2000, threadPoolSize = 3)
@Parameters({"username", "password"})
public void testSignIn(String username, String password) {
    signIn.setUsername(username);
    signIn.setPassword(password);

    Assert.assertEquals(signIn.getUsername(), username);
    Assert.assertEquals(signIn.getPassword(), password);

    boolean actual = signIn.clickButtonSignIn();
    Assert.assertTrue(actual);
}


}

