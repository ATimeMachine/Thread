package com.example.thread.lock.reentrant.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * FileName: MyReentrant
 * Author:   SunEee
 * Date:     2018/7/30 15:51
 * Description:
 */
public class MyReentrant {
    private Lock lock = new ReentrantLock();

    public void testLock() {
        lock.lock();
        try {
            Thread thread = Thread.currentThread();
            Thread.sleep(1000);

            for (int i = 0; i < 10; i++) {
                System.out.println(thread.getName() + ": 获得了锁");
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock(); // 代码执行到这里手动释放锁
        }
    }

    public void testTryLock() {
        Thread thread = Thread.currentThread();
        if (lock.tryLock()) {
            try {
                System.out.println(thread.getName() + "：获取锁成功");
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                //lock.unlock();
                System.out.println(thread.getName() + "-----不释放锁");
            }

        } else {
            System.out.println(thread.getName() + "获取锁失败！！！！！！！！");
        }
    }

    public void testLockInterruptibly() throws InterruptedException {
        //注意，如果需要正确中断等待锁的线程，必须将获取锁放在try外面，然后将InterruptedException抛出
        lock.lockInterruptibly();
        Thread thread = Thread.currentThread();
        try {
            System.out.println(thread.getName() + "：获取锁成功");
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println(thread.getName() + "-----释放锁");
        }

    }
}
