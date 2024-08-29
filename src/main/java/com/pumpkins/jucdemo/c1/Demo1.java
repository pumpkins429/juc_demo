package com.pumpkins.jucdemo.c1;

import lombok.extern.slf4j.Slf4j;

/*
 * @author      : pumpkins
 * @date        : 2024/7/15 0:07
 * @description : ...
 * @Copyright   : ...
 */
@Slf4j(topic = "c1")
public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        /* Thread.sleep(1000);
        System.out.println("wake up");

        log.info("run..."); */

        new Thread(()-> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("wake up");
        }).start();
        log.info("run...");
    }
}
