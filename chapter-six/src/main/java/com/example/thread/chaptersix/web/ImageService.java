package com.example.thread.chaptersix.web;

import java.util.Random;

/**
 * FileName: ImageService
 * Author:   SunEee
 * Date:     2018/7/26 17:34
 * Description: 获取照片的服务
 */
public class ImageService {

    public String getImage(String area) {
        delay(area);
        return area + ":" + Thread.currentThread().getContextClassLoader().getResource("application.properties");
    }

    private void delay(String area) {
        try {
            Random random = new Random();
            int i = random.nextInt(2000) + 500;
            System.out.println(area + "--" + i);
            Thread.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
