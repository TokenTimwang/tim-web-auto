package com.tim.web.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @ Author  : Tim Wang
 * @ FileName: FirstTest.java
 * @ Time    : 2020/7/31 14:38
 */
public class FirstTest {

    @Test
    public void testCaseFirst() {
        System.out.println("testCaseFirst");
        assertEquals(2 + 2, 4);
    }
}
