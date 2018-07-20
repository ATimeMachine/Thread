package com.example.thread.chapterthree.waitandnotify;

/**
 * FileName: ThreadA
 * Author:   SunEee
 * Date:     2018/7/20 13:48
 * Description:
 */
public class ThreadWait extends Thread {
    private Object object;

    public ThreadWait(String name, Object object) {
        super(name);
        this.object = object;
    }

    @Override
    public void run() {
        try {
            super.run();
            synchronized (object) {
                System.out.println("wait开始" + System.currentTimeMillis());
                object.wait();
                System.out.println("wait结束" + System.currentTimeMillis());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
