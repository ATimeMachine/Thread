package com.example.thread.chaptertwo.synchronization;

/**
 * FileName: MyThead2
 * Author:   SunEee
 * Date:     2018/7/17 16:45
 * Description:
 */
public class MyTheadB extends Thread {

    private PublicParameter parameter;

    public MyTheadB(PublicParameter parameter) {
        this.parameter = parameter;
    }

    @Override
    public void run() {
        super.run();
        //parameter.setValue("B","123456");
        parameter.getValue();
    }
}
