package baitap.buoi9.chuyendoi_thapphan_nhiphan;

import java.util.Scanner;
import java.util.Stack;

public class ConvertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số decimal cần chuyển đổi: ");
        Integer n = Integer.parseInt(sc.next());
        while(n != 0){
            stack.push(n%2);
            n = n/2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
