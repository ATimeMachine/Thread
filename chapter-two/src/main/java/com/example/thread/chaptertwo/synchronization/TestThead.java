package com.example.thread.chaptertwo.synchronization;

/**
 * FileName: TestThead
 * Author:   SunEee
 * Date:     2018/7/17 16:46
 * Description: 测试
 */
public class TestThead {
    public static void main(String[] args) {
        PublicParameter publicParameter = new PublicParameter();
        MyTheadA a = new MyTheadA(publicParameter);
        a.setName("A");
        MyTheadB b = new MyTheadB(publicParameter);
        b.setName("B");
        a.start();
        b.start();

    }
}
