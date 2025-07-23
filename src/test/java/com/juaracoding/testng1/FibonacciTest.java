package com.juaracoding.testng1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FibonacciTest {

    @Test(invocationCount= 500,threadPoolSize = 3) 
    public void testFibonacci() {
        int input = 40;
        long result = fibonacci(input);
        long expected=102334155;
        Assert.assertEquals(expected,result);
    }
    public long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
