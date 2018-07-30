package com.example.thread.lock.reentrant.lock;

/**
 * FileName: MyThread
 * Author:   SunEee
 * Date:     2018/7/30 15:48
 * Description:
 */
public class LockThread extends Thread {
    private MyReentrant myReentrant;

    public LockThread(String name, MyReentrant myReentrant) {
        super(name);
        this.myReentrant = myReentrant;
    }

    @Override
    public void run() {
        super.run();
        myReentrant.testLock();
        myReentrant.testTryLock();
    }
}
