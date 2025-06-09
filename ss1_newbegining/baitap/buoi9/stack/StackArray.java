package baitap.buoi9.stack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class StackArray {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i+1) + " : ");
            int k = Integer.parseInt(sc.nextLine());
            stack.push(k);
        }
        while (!stack.isEmpty()) {
            for (int i = stack.size() - 1; i >= 0; i--) {
                arr[i] = stack.pop();
            }
        }
        System.out.println(Arrays.toString(arr));
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
