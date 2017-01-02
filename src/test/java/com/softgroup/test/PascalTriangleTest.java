package com.softgroup.test;

import org.junit.Assert;
import org.junit.Test;

public class PascalTriangleTest{
    @Test
    public void testGetPascalTriangleElement() throws Exception {
        int n = 5;
        int k = 3;
        int expectedResult = 10;
        Assert.assertEquals(expectedResult, PascalTriangle.getPascalTriangleElement(5, 3));
    }
}
