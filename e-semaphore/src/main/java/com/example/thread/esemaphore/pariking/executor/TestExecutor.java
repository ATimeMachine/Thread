package com.example.thread.esemaphore.pariking.executor;

import com.example.thread.esemaphore.parking.semaphore.ParkingCar;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * FileName: TestExecutor
 * Author:   SunEee
 * Date:     2018/8/1 13:40
 * Description:
 */
public class TestExecutor {
    public static void main(String[] args) {
        testExecutor();//没有结果
    }

    public static void testExecutor() {
        int numberOfCar = 30;//车辆

        ExecutorService executorService = Executors.newFixedThreadPool(ParkingCar.NUMBER_OF_PARKING_SLOT, new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setDaemon(true); //设置为守护线程
                return thread;
            }
        });

        ParkingCar parkingCar = new ParkingCar();
        for (int i = 0; i < numberOfCar; i++) {
            ExecutorParkingThread executorParkingThread = new ExecutorParkingThread(parkingCar, i);
            executorService.execute(executorParkingThread);
        }
    }
}
