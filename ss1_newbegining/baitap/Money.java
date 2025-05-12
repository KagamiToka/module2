package baitap;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Hãy nhập số USD muốn quy đổi: ");
        usd = sc.nextDouble();
        System.out.println("Tỷ giá so với VNĐ là " + vnd + " VNĐ");
        System.out.println("Giá VNĐ là: " + usd * vnd + "VNĐ");
    }
}
