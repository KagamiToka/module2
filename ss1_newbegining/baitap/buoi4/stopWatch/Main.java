package baitap.buoi4.stopWatch;

import java.util.Date;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        StopWatch sw = new StopWatch();
        Date sDate = new Date(sw.start());
        Date eDate = new Date(sw.stop());
        Date between = new Date(sw.getElapsedTime());
        System.out.println("Thoi gian bat dau: " + sDate);

        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
        }

        System.out.println("Thoi gian ket thuc: " + eDate);
        System.out.println("Thoi gian thuc hien: " + between + "\t" + sw.getElapsedTime() + " (ms)");
    }
}
