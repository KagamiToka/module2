package baitap.buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class AddInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + " của mảng: ");
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));

        System.out.print("Nhập phần tử cần thêm: ");
        int x = Integer.parseInt(sc.nextLine());

        System.out.print("Nhập vị trí thêm: ");
        int pos = Integer.parseInt(sc.nextLine());

        int[] newArr = new int[n + 1];
        if (pos > n || pos < 0) {
            System.out.println("Vị trí không hợp lệ");
        } else {
            for (int i = 0; i < n + 1; i++) {
                if (i < pos) {
                    newArr[i] = arr[i];
                } else if (i == pos) {
                    newArr[i] = x;
                } else {
                    newArr[i] = arr[i - 1];
                }
            }
            n++;
        }
        System.out.println("Mảng sau khi thêm: " + Arrays.toString(newArr));

    }
}
