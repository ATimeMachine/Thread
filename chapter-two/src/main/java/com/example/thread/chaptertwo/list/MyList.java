package com.example.thread.chaptertwo.list;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: MyList
 * Author:   SunEee
 * Date:     2018/7/18 15:40
 * Description: 线程调用方法是无序的
 */
public class MyList {
    private List<String> list = new ArrayList<>();

    synchronized public void add(String value) {
        System.out.println("线程：" + Thread.currentThread().getName()+ "进入了");
        list.add(value);
        System.out.println(Thread.currentThread().getName()+ "-end");

    }

}
