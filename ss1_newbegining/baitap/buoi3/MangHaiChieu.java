package baitap.buoi3;

import java.util.Arrays;
import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số hàng của ma trận: ");
        int i = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập số cột của ma trận: ");
        int j = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[i][j];
        for (int k = 0; k < i; k++) {
            for (int l = 0; l < j; l++) {
                System.out.print("Nhập phần tử thứ " + (l + 1) + " của hàng " + (k + 1) + ": ");
                arr[k][l] = Integer.parseInt(sc.nextLine());
            }
            System.out.println();
        }

        System.out.println("Ma trận:");
        for(int[] a : arr){
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }

        findMax(arr, i, j);
    }



    public static void findMax(int[][] arr, int row, int col) {
        int max = arr[0][0];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Phần tử lớn nhất: " + max);
    }
}
