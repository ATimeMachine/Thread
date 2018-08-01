package com.example.thread.esemaphore.pariking.executor;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * FileName: WebTest
 * Author:   SunEee
 * Date:     2018/8/1 13:59
 * Description:
 */
@RestController
public class WebTest {

    @GetMapping("test")
    public void test() {
        TestExecutor.testExecutor();
    }
}
