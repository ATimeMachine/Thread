package com.example.thread.esemaphore.parking.semaphore;

/**
 * FileName: ParkingCar
 * Author:   SunEee
 * Date:     2018/8/1 11:22
 * Description: 停车
 */
public class ParkingCar {

    public static final int NUMBER_OF_PARKING_SLOT = 10;

    public void parking(int carNo) {
        System.out.println(String.format("%d号车停车",carNo));
    }

    public void leaving(int carNo) {
        System.out.println(String.format("%d号车————离开",carNo));
    }


}
