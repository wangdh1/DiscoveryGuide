package com.nepxion.discovery.gray.test.base;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

public abstract class AbstractTestCase implements TestCase {
    @Override
    public void run() {
        beforeTest();
        runTest();
        afterTest();
    }

    @Override
    public void beforeTest() {
        System.out.println("---------- Run " + getTestMethod() + " ----------");
    }

    @Override
    public void afterTest() {
        System.out.println("* Passed");
    }
}