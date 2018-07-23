package com.example.thread.chapterthree.database;

/**
 * FileName: DBThreadB
 * Author:   SunEee
 * Date:     2018/7/23 16:08
 * Description:
 */
public class DBThreadB extends Thread{
    private DBTools dbTools;

    public DBThreadB(String name, DBTools dbTools) {
        super(name);
        this.dbTools = dbTools;
    }

    @Override
    public void run() {
        super.run();
        dbTools.backupB();
    }
}
