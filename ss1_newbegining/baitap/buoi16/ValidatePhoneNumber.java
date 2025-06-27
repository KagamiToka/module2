package baitap.buoi16;

import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    private static final Pattern PHONE_PATTERN = Pattern.compile("^\\(\\d{2}\\)-\\(0\\d{9}\\)$");

    public static boolean isValidPhoneNumber(String phoneNumber) {
        if (phoneNumber == null || phoneNumber.isEmpty()) {
            return false;
        }

        return PHONE_PATTERN.matcher(phoneNumber).matches();
    }

    public static void main(String[] args) {
        String[] testCases = {
                "(84)-(0978489648)",
                "(a8)-(22222222)",
                "(84)-(22b22222)",
                "(84)-(9978489648)",
                "(12)-(0123456789)",
                "(99)-(0999999999)"
        };

        for (String test : testCases) {
            System.out.println("Số điện thoại: " + test + " -> " +
                    (isValidPhoneNumber(test) ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
