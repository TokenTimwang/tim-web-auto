package com.tim.web.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @ Author  : Tim Wang
 * @ FileName: CaseRunTest.java
 * @ Time    : 2020/7/31 15:03
 */
public class CaseRunTest {

    @Test
    public void testCase1() {
        System.out.println("CaseRunTestCase1");
        assertEquals(2 + 2, 4);
    }

    @Test
    public void testCase2() {
        assertEquals(2 + 2, 4);
    }

    @Test
    public void testCase3() {
        assertEquals(2 + 2, 4);
    }
}
