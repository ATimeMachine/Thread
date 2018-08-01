package com.example.thread.esemaphore.parking.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * FileName: TestSemaphore
 * Author:   SunEee
 * Date:     2018/8/1 11:44
 * Description:
 * 在java中，使用了synchronized关键字和Lock锁实现了资源的并发访问控制，在同一时间只允许唯一了线程进入临界区访问资源(读锁除外)，
 * 这样子控制的主要目的是为了解决多个线程并发同一资源造成的数据不一致的问题。在另外一种场景下，一个资源有多个副本可供同
 * 时使用，比如打印机房有多个打印机、厕所有多个坑可供同时使用，这种情况下，Java提供了另外的并发访问控制--资源的多副本的
 * 并发访问控制，今天学习的信号量Semaphore即是其中的一种。
 */
public class TestSemaphore {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();//配合线程池使用
        int numberOfCar = 30;//车辆
        Semaphore semaphore = new Semaphore(ParkingCar.NUMBER_OF_PARKING_SLOT, true);
        try {


            ParkingCar parkingCar = new ParkingCar();
            for (int i = 0; i < numberOfCar; i++) {
                ParkingThread parkingThread = new ParkingThread(semaphore, parkingCar, i);
                executorService.execute(parkingThread);
            }
        } finally {
            executorService.shutdown();
            //输出还有几个可以用的资源数
            Thread.sleep(3000);
            System.out.println(String.format("还有%d个车位(多少个空余线程)",semaphore.availablePermits()));
        }
    }
}
