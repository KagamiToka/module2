package baitap.buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng 1: ");
        int n1 = Integer.parseInt(sc.nextLine());
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng 1: ");
            arr1[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println();

        System.out.print("Nhập số phần tử của mảng 2: ");
        int n2 = Integer.parseInt(sc.nextLine());
        int[] arr2 = new int[n2];
        for (int j = 0; j < n2; j++) {
            System.out.print("Nhập phần tử thứ " + (j + 1) + " của mảng 2: ");
            arr2[j] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Mảng 1: " + Arrays.toString(arr1));
        System.out.println("Mảng 2: " + Arrays.toString(arr2));

        int[] newArr = new int[n1 + n2];
        for (int k = 0; k < n1; k++) {
            newArr[k] = arr1[k];
        }
        for (int m = 0; m < n2; m++) {
            newArr[n1 + m] = arr2[m];
        }
        System.out.println("Mảng kết hợp: " + Arrays.toString(newArr));
    }
}
