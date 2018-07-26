package com.example.thread.chaptersix.web;

import java.time.LocalTime;

/**
 * FileName: WrittenWordsService
 * Author:   SunEee
 * Date:     2018/7/26 17:27
 * Description: 获取文字的服务
 */
public class WrittenWordsService {

    /**
     * 获取地区新闻
     * @param area 地区
     * @return
     */
    public static String getNews(String area) {
        delay(); //延迟1秒
        LocalTime now = LocalTime.now();
        return area +":"+ now.toString();
    }

    private static void delay() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
