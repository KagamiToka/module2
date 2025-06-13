package baitap.buoi11;

import java.util.Scanner;

public class LongestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String str = sc.nextLine();
        String result = getLongestString(str);
        System.out.println(result);
    }

    public static String getLongestString(String str) {
        String longest = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (stringBuilder.length() == 0 || str.charAt(i) >= stringBuilder.charAt(stringBuilder.length() - 1)) {
                stringBuilder.append(str.charAt(i));
            }  else {
                if (stringBuilder.length() > longest.length()) {
                    longest = stringBuilder.toString();
                }
                stringBuilder = new StringBuilder();
                stringBuilder.append(str.charAt(i));
            }
        }
        if (stringBuilder.length() > longest.length()) {
            longest = stringBuilder.toString();
        }

        return longest;
    }
}
