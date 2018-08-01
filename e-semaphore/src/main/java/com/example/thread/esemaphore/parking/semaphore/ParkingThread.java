package com.example.thread.esemaphore.parking.semaphore;

import java.util.concurrent.Semaphore;

/**
 * FileName: ParkingThread
 * Author:   SunEee
 * Date:     2018/8/1 11:20
 * Description:
 */
public class ParkingThread implements Runnable {
    //在Java并发编程中，信号量控制的是线程并发的数量。
    // private Semaphore semaphore = new Semaphore(1); 控制线程的数目为1，也就是单线程
    private Semaphore semaphore;

    private ParkingCar parkingCar;

    private int carNo;

    public ParkingThread(Semaphore semaphore,ParkingCar parkingCar,int carNo) {
        this.semaphore = semaphore;
        this.parkingCar = parkingCar;
        this.carNo = carNo;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();//从信号量中获取一个允许机会

            parkingCar.parking(carNo);
            Thread.sleep(1000);
            parkingCar.leaving(carNo);

            semaphore.release();// 释放允许，将占有的信号量归还

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
