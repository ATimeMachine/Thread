package com.example.thread.chapterthree.database;

/**
 * FileName: DBTools
 * Author:   SunEee
 * Date:     2018/7/23 15:37
 * Description:
 */
public class DBTools {
    volatile private Boolean prevA = false;

    synchronized public void backupA() {
        //多个线程组不要用if来判断使用wait(),因为多个线程唤醒后，
        // if会直接执行wait()后面的代码，而while还会再次判断条件是否符合
        while (prevA) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("☆☆☆☆☆☆☆☆");
        }

        prevA = true;
        notifyAll();
    }

    synchronized public void backupB() {
        while (!prevA) { //与上面的while条件相反
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("★★★★★★★★★★★★★★★★★★★");
        }
        prevA = false;
        notifyAll();
    }
}
