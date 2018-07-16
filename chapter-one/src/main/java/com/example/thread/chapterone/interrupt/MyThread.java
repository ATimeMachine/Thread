package com.example.thread.chapterone.interrupt;

/**
 * FileName: MyThread
 * Author:   SunEee
 * Date:     2018/7/16 16:56
 * Description: 我的线程
 */
public class MyThread extends Thread {


    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 5000000; i++) {
            System.out.println("i=" + i);
            if (this.isInterrupted()) {
                throw new RuntimeException();
            }
        }
    }
}
