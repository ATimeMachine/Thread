package com.example.thread.chapterone.interrupt;

/**
 * FileName: TestInterrupt
 * Author:   SunEee
 * Date:     2018/7/30 13:56
 * Description:
 */
public class TestInterrupt {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        myThread.interrupt();

    }
}
