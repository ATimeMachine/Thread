package com.example.thread.chaptertwo.synchronization;

/**
 * FileName: TestThead
 * Author:   SunEee
 * Date:     2018/7/17 16:46
 * Description: 测试
 */
public class TestThead {
    public static void main(String[] args) throws InterruptedException {
        PublicParameter publicParameter = new PublicParameter();
        MyTheadA a = new MyTheadA(publicParameter);
        a.setName("A");
        MyTheadB b = new MyTheadB(publicParameter);
        b.setName("B");
        a.start();   //开启异步执行
        publicParameter.getValue(); //虽然A线程已经开始，即使取值加了synchronized，但是获取值执行快，所以值为空
        Thread.sleep(50);//确定A线程先执行赋值
        b.start(); //B线程获取值，但是由于加了synchronized，所以不是空
        publicParameter.getValue();//由于有synchronized，但是A线程已经执行赋值，获取值要等到A线程释放锁才行

    }
}
