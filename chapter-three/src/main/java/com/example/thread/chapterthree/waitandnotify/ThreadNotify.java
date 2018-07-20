package com.example.thread.chapterthree.waitandnotify;

/**
 * FileName: ThreadNotify
 * Author:   SunEee
 * Date:     2018/7/20 13:52
 * Description:
 */
public class ThreadNotify extends Thread {
    private Object object;

    public ThreadNotify(String name, Object object) {
        super(name);
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        synchronized (object) {
            System.out.println("notify通知开始");
            object.notify();
            System.out.println("notify通知结束");
        }
    }
}
