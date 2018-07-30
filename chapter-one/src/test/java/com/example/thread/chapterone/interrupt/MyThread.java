package com.example.thread.chapterone.interrupt;

/**
 * FileName: MyThread
 * Author:   SunEee
 * Date:     2018/7/30 13:53
 * Description:
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        try {
            while (!Thread.interrupted()) {
                Thread.sleep(5000);

            }
            System.out.println("Exit normal");
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }
    }
}
