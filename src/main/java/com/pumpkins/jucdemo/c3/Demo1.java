package com.pumpkins.jucdemo.c3;

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
        // 方法一
        Runnable r = () -> log.info("create by runnable");
        Thread t1 = new Thread(r, "t1");
        t1.start();
        t1.join();

        // 方法二：
        Thread thread = new Thread() {
            @Override
            public void run() {
                log.info("create by thread");
            }
        };
        thread.start();
        thread.join();

        /*
        总结：方法一最终还是使用Thread类的run方法，方法二则是使用Thread子类重写后的run方法。
        更推荐使用runnable的方法，做到任务与线程分离，更加灵活
        */

        // 方法三：

    }
}
