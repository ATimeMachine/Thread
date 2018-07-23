package com.example.thread.chapterthree.database;

/**
 * FileName: TestDB
 * Author:   SunEee
 * Date:     2018/7/23 16:09
 * Description:
 */
public class TestDB {
    public static void main(String[] args) {
        DBTools dbTools = new DBTools();
        for (int i = 0; i < 10; i++) {
            DBThreadA a = new DBThreadA("A" + i, dbTools);
            a.start();
            DBThreadB b = new DBThreadB("b" + i, dbTools);
            b.start();
        }
    }
}
