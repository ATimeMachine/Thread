package com.example.thread.esemaphore.parking.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * FileName: TestSemaphore
 * Author:   SunEee
 * Date:     2018/8/1 11:44
 * Description:
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
