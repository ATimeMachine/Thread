package com.example.thread.chaptersix.web;

import java.util.List;
import java.util.concurrent.*;

/**
 * FileName: WebHtmlController
 * Author:   SunEee
 * Date:     2018/7/26 17:45
 * Description:
 */
public class WebHtmlController {
    private List<String> areas;

    private final Executor executor;

    public WebHtmlController(List<String> areas) {
        this.areas = areas;
        //创建线程守护线程的线程池
        executor = Executors.newFixedThreadPool(Math.min(areas.size(), 100), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true);
                return thread;
            }
        });
    }

    public void getWebHtml() throws ExecutionException, InterruptedException {
        ImageService imageService = new ImageService();
        long start = System.currentTimeMillis();
        CompletableFuture[] futures = areas.stream().map(area -> CompletableFuture.supplyAsync(() -> WrittenWordsService.getNews(area))
                .thenCombine(CompletableFuture.supplyAsync(() -> imageService.getImage(area)), WebHtml::new))
                .map(f -> f.thenAccept(webHtml -> printTime(webHtml,start)))
                .toArray(CompletableFuture[]::new);

        CompletableFuture.allOf(futures).join();

    }

    private void printTime(WebHtml webHtml,long start) {
        System.out.println(webHtml.toString() +"消耗时间：" + (System.currentTimeMillis() - start));
    }

}
