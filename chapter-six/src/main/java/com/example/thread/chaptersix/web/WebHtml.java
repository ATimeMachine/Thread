package com.example.thread.chaptersix.web;

/**
 * FileName: WebHtml
 * Author:   SunEee
 * Date:     2018/7/26 17:23
 * Description: 页面
 */
public class WebHtml {
    private String writtenWords;

    private String images;

    public WebHtml(String writtenWords, String images) {
        this.writtenWords = writtenWords;
        this.images = images;
    }

    public String getWrittenWords() {
        return writtenWords;
    }

    public void setWrittenWords(String writtenWords) {
        this.writtenWords = writtenWords;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    @Override
    public String toString() {
        return "WebHtml{" +
                "writtenWords='" + writtenWords + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
