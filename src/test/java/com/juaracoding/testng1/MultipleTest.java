package com.juaracoding.testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MultipleTest {

    @Test(invocationCount = 4000, threadPoolSize = 3)
    public void testLoopMultiplication() {
        for (int i = 1; i <= 4000; i++) {
            int result = i * 2;
            Assert.assertEquals(result % 2, 0, "Hasil harus genap");
        }
    }
}