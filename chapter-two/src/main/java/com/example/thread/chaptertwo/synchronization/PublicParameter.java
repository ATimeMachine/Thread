package com.example.thread.chaptertwo.synchronization;

/**
 * FileName: PublicParameter
 * Author:   SunEee
 * Date:     2018/7/17 16:37
 * Description: 公共参数
 */
public class PublicParameter {

    private String username ;
    private String password ;


    public synchronized void setValue(String username, String password) {
        try {
            this.username = username;
            this.password = password;
            System.out.println("当前线程名字为：" + Thread.currentThread().getName() +  ",username='" + username + '\'' +
                    ", password='" + password + '\'' );
            Thread.sleep(2000);
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void getValue() {
        System.out.println("当前线程名字为：" + Thread.currentThread().getName() +  ",username='" + username + '\'' +
                ", password='" + password + '\'' );
    }
}
