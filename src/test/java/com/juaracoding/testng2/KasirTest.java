package com.juaracoding.testng2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class KasirTest {
   @Test(invocationCount=4000,threadPoolSize = 3)
public void testCheckout() {
    int itemPrice = 10000;
    int quantity = 3;

    for (int i = 1; i <= 4000; i++) {
        int total = itemPrice * quantity;
        Assert.assertEquals(total, 30000);
    }
}
}
