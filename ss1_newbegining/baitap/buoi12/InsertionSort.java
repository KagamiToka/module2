package baitap.buoi12;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        Integer n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
//            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
//            arr[i] = Integer.parseInt(sc.nextLine());
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Mảng ban đầu: ");
        printArray(arr);

        insertSort(arr);
    }

    public static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Sau bước " + i + ":");
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
