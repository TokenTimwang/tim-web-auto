package com.tim.web.test;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * @ Author  : Tim Wang
 * @ FileName: SecondTest.java
 * @ Time    : 2020/7/31 14:49
 */
public class SecondTest {

    @Test
    public void testCaseSecond() {
        System.out.println("testCaseSecond");
        assertEquals(2 + 2, 4);
    }
}
