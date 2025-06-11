package baitap.buoi9.Parolime;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String s) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();

        for (char c : s.toCharArray()) {
            stack.push(c);
            queue.offer(c);
        }

        while (!queue.isEmpty()) {
            char queueChar = queue.poll();
            char stackChar = stack.pop();
            if (queueChar != stackChar) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "Able was I ere I saw Elba";
        String s2 = "racecar";
        String s3 = "hello";
        String s4 = "A man a plan a canal Panama";

        System.out.println("Chuỗi \"" + s1 + "\" là Palindrome: " + isPalindrome(s1));
        System.out.println("Chuỗi \"" + s2 + "\" là Palindrome: " + isPalindrome(s2));
        System.out.println("Chuỗi \"" + s3 + "\" là Palindrome: " + isPalindrome(s3));
        System.out.println("Chuỗi \"" + s4 + "\" là Palindrome: " + isPalindrome(s4));
    }
}
