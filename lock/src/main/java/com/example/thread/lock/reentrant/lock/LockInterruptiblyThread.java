package com.example.thread.lock.reentrant.lock;

/**
 * FileName: TestLockInterruptibly
 * Author:   SunEee
 * Date:     2018/7/30 16:39
 * Description:
 */
public class LockInterruptiblyThread extends Thread {
    private MyReentrant myReentrant;

    public LockInterruptiblyThread(String name, MyReentrant myReentrant) {
        super(name);
        this.myReentrant = myReentrant;
    }

    @Override
    public void run() {
        super.run();
        try {
            myReentrant.testLockInterruptibly();
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "被中断！！！！！！！！！");
        }
    }
}
