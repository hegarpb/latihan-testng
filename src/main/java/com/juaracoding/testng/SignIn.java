package com.juaracoding.testng;

public class SignIn {
  private String username;
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean clickButtonSignIn() {
    String usernameDB = "johansebastian";
    String passwordDB = "123qwe";

    if (usernameDB.equals(username)) {
      if (passwordDB.equals(password)) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }
}
