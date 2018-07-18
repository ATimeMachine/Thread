package com.example.thread.chaptertwo.list;

/**
 * FileName: TheadA
 * Author:   SunEee
 * Date:     2018/7/18 15:44
 * Description: A线程
 */
public class ThreadA extends Thread {
    private MyList list;

    public ThreadA(String name, MyList list) {
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
        listServer.listServer(list,"A");
    }
}
