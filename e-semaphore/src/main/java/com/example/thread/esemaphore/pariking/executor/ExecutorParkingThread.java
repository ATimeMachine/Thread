package com.example.thread.esemaphore.pariking.executor;

import com.example.thread.esemaphore.parking.semaphore.ParkingCar;

/**
 * FileName: ExecutorParkingThread
 * Author:   SunEee
 * Date:     2018/8/1 13:38
 * Description:
 */
public class ExecutorParkingThread extends Thread{

    private ParkingCar parkingCar;

    private int carNo;

    public ExecutorParkingThread(ParkingCar parkingCar, int carNo) {
        this.parkingCar = parkingCar;
        this.carNo = carNo;
    }

    @Override
    public void run() {
        try {
            super.run();
            parkingCar.parking(carNo);
            Thread.sleep(1000);
            parkingCar.leaving(carNo);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
