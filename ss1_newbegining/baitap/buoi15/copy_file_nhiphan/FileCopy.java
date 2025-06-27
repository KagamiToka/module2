package baitap.buoi15.copy_file_nhiphan;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        String sourceFile = "copy.dat";
        String targetFile = "copy_output.dat";

        File source = new File(sourceFile);
        File target = new File(targetFile);

        if (!source.exists()) {
            System.out.println("Lỗi: Tệp nguồn '" + sourceFile + "' không tồn tại.");
            System.out.println("Vui lòng tạo tệp 'copy.dat' trong thư mục hiện tại.");
            return;
        }

        if (target.exists()) {
            System.out.println("Cảnh báo: Tệp đích '" + targetFile + "' đã tồn tại. Ghi đè tệp...");
        }

        try (
                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(target)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytes = 0;

            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalBytes += bytesRead;
            }

            System.out.println("Sao chép thành công! Số byte đã sao chép: " + totalBytes);

        } catch (IOException e) {
            System.out.println("Lỗi trong quá trình sao chép: " + e.getMessage());
        }
    }
}

