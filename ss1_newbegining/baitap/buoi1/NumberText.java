package baitap.buoi1;

import java.util.Scanner;

public class NumberText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        int n = 0;
        boolean validInput = false;

        System.out.print("Nhập số cần đọc (0-999): ");
        while (!validInput) {
            n = Integer.parseInt(sc.nextLine());
            if (n < 0 || n > 999) {
                System.out.print("Số cần đọc cần nằm trong khoảng 0 - 999: ");
            } else {
                validInput = true;
            }
        }

        if (n < 10) {
            s = convertSingle(n);
        } else if (n < 20) {
            s = convertTeens(n);
        } else if (n < 100) {
            s = convertTwoDigits(n);
        } else {
            s = convertHundred(n);
        }

        System.out.println("Số " + n + " đọc là " + s);
    }

    public static String convertSingle(int n) {
        switch (n) {
            case 0: return "zero";
            case 1: return "one";
            case 2: return "two";
            case 3: return "three";
            case 4: return "four";
            case 5: return "five";
            case 6: return "six";
            case 7: return "seven";
            case 8: return "eight";
            case 9: return "nine";
            default: return "";
        }
    }

    public static String convertTeens(int n) {
        switch (n) {
            case 10: return "ten";
            case 11: return "eleven";
            case 12: return "twelve";
            case 13: return "thirteen";
            case 14: return "fourteen";
            case 15: return "fifteen";
            case 16: return "sixteen";
            case 17: return "seventeen";
            case 18: return "eighteen";
            case 19: return "nineteen";
            default: return "";
        }
    }

    public static String convertTens(int n) {
        switch (n) {
            case 2: return "twenty";
            case 3: return "thirty";
            case 4: return "forty";
            case 5: return "fifty";
            case 6: return "sixty";
            case 7: return "seventy";
            case 8: return "eighty";
            case 9: return "ninety";
            default: return "";
        }
    }

    public static String convertTwoDigits(int n) {
        if (n < 10) {
            return convertSingle(n);
        } else if (n < 20) {
            return convertTeens(n);
        } else {
            int ten = n / 10;
            int unit = n % 10;
            String tenStr = convertTens(ten);
            String unitStr = convertSingle(unit);
            if (unit == 0) {
                return tenStr;
            }
            return tenStr + " " + unitStr;
        }
    }

    public static String convertHundred(int n) {
        int hundred = n / 100;
        int ten = n % 100;
        String hundredStr = convertSingle(hundred) + " hundred";
        if (ten == 0) {
            return hundredStr;
        }
        String tenStr = convertTwoDigits(ten);
        return hundredStr + " " + tenStr;
    }
}
