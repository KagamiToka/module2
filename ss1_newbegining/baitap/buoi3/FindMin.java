package baitap.buoi3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(100);
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Phần tử nhỏ nhất trong mảng là: " + min);
    }
}
