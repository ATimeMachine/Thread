package com.example.thread.lock.reentrant.lock;

/**
 * FileName: TryLockThread
 * Author:   SunEee
 * Date:     2018/7/30 16:26
 * Description:
 */
public class TryLockThread implements Runnable {
    private MyReentrant myReentrant;

    public TryLockThread(MyReentrant myReentrant) {
        this.myReentrant = myReentrant;
    }

    @Override
    public void run() {
        myReentrant.testTryLock();
    }
}
