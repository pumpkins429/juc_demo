package com.pumpkins.jucdemo.c2_create;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/*
 * @author      : pumpkins
 * @date        : 2024/7/15 0:28
 * @description : ...
 * @Copyright   : ...
 */
@Slf4j
public class Demo1 {
    @Test
    public void test_runnable() throws InterruptedException {
        Runnable r = () -> log.info("hello");
        Thread t1 = new Thread(r, "t1");
        t1.start();
        t1.join();
    }
}
