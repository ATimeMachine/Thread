package com.example.thread.chaptersix.web;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;

/**
 * FileName: WebHtmlTest
 * Author:   SunEee
 * Date:     2018/7/26 17:44
 * Description:
 */
public class WebHtmlTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<String> strings = Arrays.asList("a", "b", "c", "d");

        WebHtmlController webHtmlController = new WebHtmlController(strings);
        webHtmlController.getWebHtml();
    }
}
