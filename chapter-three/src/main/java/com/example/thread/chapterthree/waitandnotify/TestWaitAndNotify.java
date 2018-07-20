package com.example.thread.chapterthree.waitandnotify;

/**
 * FileName: TestWaitAndNotify
 * Author:   SunEee
 * Date:     2018/7/20 13:54
 * Description:
 */
public class TestWaitAndNotify {
    public static void main(String[] args) throws InterruptedException {
        Object object = new Object();
        ThreadWait wait = new ThreadWait("wait", object);
        wait.start();

        Thread.sleep(3000);

        ThreadNotify notify = new ThreadNotify("notify", object);
        notify.start();

    }
}
