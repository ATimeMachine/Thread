package com.example.thread.chapterthree.database;

/**
 * FileName: DBThreadA
 * Author:   SunEee
 * Date:     2018/7/23 16:07
 * Description:
 */
public class DBThreadA extends Thread{
    private DBTools dbTools;

    public DBThreadA(String name, DBTools dbTools) {
        super(name);
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupA();
    }
}
