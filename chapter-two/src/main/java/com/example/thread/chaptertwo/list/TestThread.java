package com.example.thread.chaptertwo.list;

/**
 * FileName: TestThread
 * Author:   SunEee
 * Date:     2018/7/18 15:47
 * Description: 测试线程
 */
public class TestThread {
    public static void main(String[] args) {
        MyList myList = new MyList();
        ThreadA a = new ThreadA(myList);
        a.setName("A");
        ThreadB b = new ThreadB(myList);
        b.setName("b");

        a.start();
        b.start();
    }
}
