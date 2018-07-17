package com.example.thread.chaptertwo.synchronization;

/**
 * FileName: MyThead1
 * Author:   SunEee
 * Date:     2018/7/17 16:43
 * Description: 线程1
 */
public class MyTheadA extends Thread {
    private PublicParameter parameter;

    public MyTheadA(PublicParameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run() {
        super.run();
        parameter.setValue("A","AAAAA");
    }
}
