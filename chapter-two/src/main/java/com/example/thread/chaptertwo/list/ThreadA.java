package com.example.thread.chaptertwo.list;

/**
 * FileName: TheadA
 * Author:   SunEee
 * Date:     2018/7/18 15:44
 * Description: A线程
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(MyList list) {
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10000; i++) {
            list.add("ThreadA"+ i);
        }
    }
}
