package com.example.thread.chapterone.interrupt;

/**
 * FileName: Run1
 * Author:   SunEee
 * Date:     2018/7/16 17:08
 * Description: 测试类
 */
public class Run1 {
    public static void main(String[] args) {
        try {
            MyThread t = new MyThread();
            t.start();
            Thread.sleep(2000);
            t.interrupt(); //打上线程停止的状态

            System.out.println("线程是否停止？" + t.isInterrupted());

        } catch (InterruptedException e) {
            System.out.println("线程睡眠异常" + e.getMessage());
        }
        System.out.println("end");
    }
}
