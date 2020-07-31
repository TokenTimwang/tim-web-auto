package com.tim.web.test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @ Author  : Tim Wang
 * @ FileName: DataProviderTest.java
 * @ Time    : 2020/7/31 15:14
 */
public class DataProviderTest {

    @Test
    @Parameters({"add1", "add2", "result"})
    public void testAdd1(int add1, int add2, int result) {
        assertEquals(add1 + add2, result);
    }

    // 定义对象数组
    @DataProvider(name = "add")
    public Object[][] Users() {
        return new Object[][]{
                {3, 2, 5},
                {2, 2, 4},
                {3, 3, 7},
        };
    }

    @Test(dataProvider = "add")
    public void testAdd2(int add1, int add2, int result) {
        assertEquals(add1 + add2, result);
    }
}
