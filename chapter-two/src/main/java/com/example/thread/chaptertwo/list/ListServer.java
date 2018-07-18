package com.example.thread.chaptertwo.list;


/**
 * FileName: ListServer
 * Author:   SunEee
 * Date:     2018/7/18 16:26
 * Description:
 */
public class ListServer {

    private final Object o = new Object(); //错误的，有两个对象了
    public void listServer(MyList list, String data) {
        //synchronized (o) {
        synchronized (list) {
            try {
                if (list.getSize() < 1) {
                    Thread.sleep(1000); //模拟从远程花费1秒取回数据
                    list.addData(data);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
