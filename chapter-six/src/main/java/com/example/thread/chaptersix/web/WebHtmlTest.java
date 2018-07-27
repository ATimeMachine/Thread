package com.example.thread.chaptersix.web;

import java.util.Arrays;
import java.util.List;

/**
 * FileName: WebHtmlTest
 * Author:   SunEee
 * Date:     2018/7/26 17:44
 * Description:
 */
public class WebHtmlTest {

    public static void main(String[] args){
        List<String> strings = Arrays.asList("a", "b", "c", "d","e","f","g");

        WebHtmlController webHtmlController = new WebHtmlController(strings);
        webHtmlController.getWebHtml();
    }
}
