package baitap.buoi12;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SetUpInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        System.out.println("Mảng sau khi sắp xếp là: " + Arrays.toString(insertionSort(arr)));
    }

    public static int [] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }


}
