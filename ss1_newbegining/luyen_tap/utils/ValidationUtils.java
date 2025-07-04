package luyen_tap.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.HashSet;

public class ValidationUtils {
    private static final String DRONE_REGEX = "DRN-\\d{3}";
    private static final String MOON_CAR_REGEX = "XTT-\\d{3}";
    private static final String YEAR_REGEX = "\\d{4}";
    private static final int CURRENT_YEAR = 2025;
    private static HashSet<String> validManufacturers = loadManufacturers();

    private static HashSet<String> loadManufacturers() {
        HashSet<String> manufacturers = new HashSet<>();
        try (BufferedReader br = new BufferedReader(new FileReader("luyen_tap/data/hangCheTao.csv"))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }
                if (!line.trim().isEmpty() && !line.trim().startsWith("//")) {
                    String[] data = line.split(",");
                    if (data.length > 1) {
                        manufacturers.add(data[1].trim());
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file hangCheTao.csv: " + e.getMessage());
        }
        return manufacturers;
    }

    public static boolean isNotEmpty(String input, String fieldName) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println(fieldName + " không được để trống!");
            return false;
        }
        return true;
    }

    public static boolean isValidSerialNumber(String soHieu, boolean isDrone) {
        if (!isNotEmpty(soHieu, "Số hiệu")) return false;
        boolean isValid = isDrone ? soHieu.matches(DRONE_REGEX) : soHieu.matches(MOON_CAR_REGEX);
        if (!isValid) {
            System.out.println("Số hiệu phải có định dạng " + (isDrone ? "DRN-XXX" : "XTT-XXX") + "!");
        }
        return isValid;
    }

    public static boolean isValidManufacturer(String hangSanXuat) {
        if (!isNotEmpty(hangSanXuat, "Hãng sản xuất")) return false;
        if (!validManufacturers.contains(hangSanXuat)) {
            System.out.println("Hãng sản xuất phải nằm trong danh sách từ hangCheTao.csv!");
            return false;
        }
        return true;
    }

    public static boolean isValidYear(String nam) {
        if (!isNotEmpty(nam, "Năm sản xuất")) return false;
        if (!nam.matches(YEAR_REGEX)) {
            System.out.println("Năm phải là 4 chữ số!");
            return false;
        }
        int year = Integer.parseInt(nam);
        if (year > CURRENT_YEAR) {
            System.out.println("Năm sản xuất không được vượt quá năm hiện tại (" + CURRENT_YEAR + ")!");
            return false;
        }
        return true;
    }

    public static boolean isValidFlightRange(double tamBay) {
        if (tamBay <= 0) {
            System.out.println("Tầm bay phải là số dương!");
            return false;
        }
        return true;
    }

    public static boolean isValidRadiationResistance(int chongBucXa) {
        if (chongBucXa < 1 || chongBucXa > 10) {
            System.out.println("Khả năng chống bức xạ phải từ 1 đến 10!");
            return false;
        }
        return true;
    }

    public static boolean isValidRadiationResistance(String chongBucXa) {
        if (!isNotEmpty(chongBucXa, "Khả năng chống bức xạ")) return false;
        if (!chongBucXa.matches("Cấp\\s[1-9]|Cấp\\s10")) {
            System.out.println("Khả năng chống bức xạ phải có định dạng 'Cấp X' (X từ 1 đến 10)!");
            return false;
        }
        return true;
    }
}