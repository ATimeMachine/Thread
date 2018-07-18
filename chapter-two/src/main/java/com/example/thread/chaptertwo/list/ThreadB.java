package com.example.thread.chaptertwo.list;

/**
 * FileName: ThreadB
 * Author:   SunEee
 * Date:     2018/7/18 15:47
 * Description: 线程B
 */
public class ThreadB extends Thread {

    private MyList list;

    public ThreadB(String name, MyList list) {
        super(name);
        this.list = list;
    }

    @Override
    public void run() {
        super.run();
        /*//证明线程调用方法是无序的
        for (int i = 0; i < 10000; i++) {
            list.add("ThreadA"+ i);
        }*/

        ListServer listServer = new ListServer();
        listServer.listServer(list,"B");
    }
}
