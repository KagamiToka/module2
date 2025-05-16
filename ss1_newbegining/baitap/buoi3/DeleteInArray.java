package baitap.buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteInArray {
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

        System.out.print("Nhập phần tử cần xóa: ");
        int x = Integer.parseInt(sc.nextLine());
        int count = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                count = i;
                break;
            }
        }

        if (count == -1) {
            System.out.println("Không có phần tử này trong mảng");
        } else {
            System.out.println("Xóa phần tử nằm ở vị trí " + count+ " của mảng");
            for (int i = count; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            arr[n] = 0;
        }
        System.out.println("Mảng sau khi xóa: " + Arrays.toString(arr));

    }
}
