package com.tim.web.test;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * @ Author  : Tim Wang
 * @ FileName: DependentMethodsTest.java
 * @ Time    : 2020/7/31 15:08
 */
public class DependentMethodsTest {

    @Test
    public void testAdd1() {
        assertEquals(3 + 1, 5);
    }

//  dependsOnMethods 来设置用例的依赖，当 testAdd1() 运行失败时，则 testAdd2() 不再被执行。

    @Test(dependsOnMethods = {"testAdd1"})
    public void testAdd2() {
        assertEquals(3 + 2, 5);
    }
}
