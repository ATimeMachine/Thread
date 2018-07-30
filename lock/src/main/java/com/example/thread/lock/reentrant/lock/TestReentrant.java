package com.example.thread.lock.reentrant.lock;

/**
 * FileName: TestReentrant
 * Author:   SunEee
 * Date:     2018/7/30 15:56
 * Description:
 */
public class TestReentrant {
    public static void main(String[] args) throws InterruptedException {
       MyReentrant myReentrant = new MyReentrant();
       /*
        LockThread a = new LockThread("A", myReentrant);
        LockThread b = new LockThread("b", myReentrant);
        a.start();
        b.start();*/

       //-------------------------------------------

        /*TryLockThread runable = new TryLockThread(myReentrant);
        Thread a = new Thread(runable,"a");
        Thread b = new Thread(runable, "b");
        a.start();
        b.start();*/

        //--------------------------------------------
        Thread a = new LockInterruptiblyThread("a", myReentrant);
        Thread b = new LockInterruptiblyThread("b", myReentrant);
        a.start();
        b.start();
        //中断
        b.interrupt();



    }

}
