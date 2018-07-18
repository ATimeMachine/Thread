package com.example.thread.chaptertwo.list;

/**
 * FileName: ThreadB
 * Author:   SunEee
 * Date:     2018/7/18 15:47
 * Description: 线程B
 */
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            list.add("ThreadA" + i);
        }
    }
}
