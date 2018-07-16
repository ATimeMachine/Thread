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
                //是用抛异常停止线程
                // （推荐，不过还是建议使用“抛异常”的方法来实现线程的停止,
                // 因为在 catch块中还可以将异常向上抛,使线程停止的事件得以传播。）
                throw new IllegalArgumentException();
                //return; //使用返回挺停止线程
            }
        }
    }
}
