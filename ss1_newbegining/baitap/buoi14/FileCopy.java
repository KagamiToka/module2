package baitap.buoi14;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập đường dẫn tệp nguồn
        System.out.print("Nhập đường dẫn tệp nguồn: ");
        String sourceFile = scanner.nextLine();

        // Tạo đường dẫn tệp đích tự động (thêm "_copy" trước phần mở rộng)
        String targetFile = getTargetFilePath(sourceFile);

        long charCount = 0;

        // Kiểm tra file nguồn có tồn tại
        File source = new File(sourceFile);
        if (!source.exists()) {
            System.out.println("Lỗi: Tệp nguồn '" + sourceFile + "' không tồn tại!");
            scanner.close();
            return;
        }

        // Kiểm tra file đích có tồn tại
        File target = new File(targetFile);
        if (target.exists()) {
            System.out.println("Cảnh báo: Tệp đích '" + targetFile + "' đã tồn tại. Ghi đè? (y/n)");
            try {
                String response = scanner.nextLine();
                if (!response.toLowerCase().startsWith("y")) {
                    System.out.println("Hủy thao tác sao chép.");
                    scanner.close();
                    return;
                }
            } catch (Exception e) {
                System.out.println("Lỗi khi đọc phản hồi: " + e.getMessage());
                scanner.close();
                return;
            }
        }

        // Sao chép file và đếm ký tự
        try (
                BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                charCount++;
            }
            System.out.println("Sao chép thành công! Số ký tự: " + charCount);
            System.out.println("Tệp đích: " + targetFile);
        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép tệp: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Hàm tạo đường dẫn tệp đích bằng cách thêm "_copy" trước phần mở rộng
    private static String getTargetFilePath(String sourceFile) {
        int lastDotIndex = sourceFile.lastIndexOf('.');
        if (lastDotIndex == -1) {
            // Không có phần mở rộng
            return sourceFile + "_copy";
        }
        String name = sourceFile.substring(0, lastDotIndex);
        String extension = sourceFile.substring(lastDotIndex);
        return name + "_copy" + extension;
    }
}