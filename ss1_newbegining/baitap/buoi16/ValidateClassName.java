package baitap.buoi16;

import java.util.regex.Pattern;

public class ValidateClassName {
    private static final Pattern CLASS_NAME_PATTERN = Pattern.compile("^[CAP][0-9]{4}[GHIK]$");

    public static boolean isValidClassName(String className) {
        if (className == null || className.isEmpty()) {
            return false;
        }

        return CLASS_NAME_PATTERN.matcher(className).matches();
    }

    public static void main(String[] args) {
        String[] testCases = {"C0223G", "A0323K", "M0318G", "P0323A", "C1234H", "A12K34I", "P@123K"};

        for (String test : testCases) {
            System.out.println("Tên lớp: " + test + " -> " +
                    (isValidClassName(test) ? "Hợp lệ" : "Không hợp lệ"));
        }
    }
}
