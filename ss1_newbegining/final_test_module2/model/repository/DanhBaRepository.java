package final_test_module2.model.repository;

import final_test_module2.model.entity.DanhBa;
import luyen_tap.model.entity.Drone;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class DanhBaRepository {
    private static List<DanhBa> danhBaList = new ArrayList<>();
//    private static List<DanhBa> danhBa = new ArrayList<>();
    private static String DANHBA_FILE_PATH = "final_test_module2/data/danhba.csv";

    static {
        danhBaList.add(new DanhBa("0912345678","Môn Phái","Vương Trùng Dương","Nam","Cổ Mộ","30/2/1768","duong@tcp.cm"));
    }

    public DanhBaRepository() {
//        readFile();
    }

    public void readFile() {
        File file = new File(DANHBA_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(DANHBA_FILE_PATH))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
//                if (isFirstLine) {
//                    isFirstLine = false;
//                    continue;
//                }

                if (line.trim().isEmpty() || line.trim().startsWith("//")) {
                    continue;
                }

                String[] data = line.split(",");
                if (data.length == 7) {
                    try {
                        DanhBa danhBa = new DanhBa(
                                data[0],
                                data[1],
                                data[2],
                                data[3],
                                data[4],
                                data[5],
                                data[6]
                        );
                        danhBaList.add(danhBa);
                    } catch (NumberFormatException e) {
                        System.out.println("Dữ liệu không đúng định dạng " + e.getMessage());
                    }
                } else {
                    System.out.println("Dòng không hợp lệ " + line);
                }
            }
        }catch (IOException e) {
            System.out.println("Lỗi đọc file " + e.getMessage());
        }
    }

    public void saveFile() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(DANHBA_FILE_PATH))) {
            for (DanhBa danhBa : danhBaList) {
                bw.write(String.format("%s,%s,%s,%s,%s,%s,%s",
                        danhBa.getSoDienThoai(),
                        danhBa.getNhom(),
                        danhBa.getHoTen(),
                        danhBa.getGioiTinh(),
                        danhBa.getDiaChi(),
                        danhBa.getNgaySinh(),
                        danhBa.getEmail()
                ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public  List<DanhBa> getDanhBaList() {
        return danhBaList;
    }

    public boolean addDanhBa(DanhBa danhBa) {
        for (DanhBa danhBa1 : danhBaList) {
            if (danhBa1.getSoDienThoai().equals(danhBa.getSoDienThoai())) {
                return false;
            }
        }
        danhBaList.add(danhBa);
        saveFile();
        return true;
    }

    public boolean editDanhBa(String soDienThoai, DanhBa danhBa) {
        for (int i = 0; i< danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai().equals(soDienThoai)) {
                danhBaList.set(i, danhBa);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public boolean deleteDanhBa(String soDienThoai) {
        for (int i = 0; i< danhBaList.size(); i++) {
            if (danhBaList.get(i).getSoDienThoai().equals(soDienThoai)) {
                danhBaList.remove(i);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public boolean getSoDienThoai(String soDienThoai) {
        for (int i = 0; i< danhBaList.size(); i++) {
            if (soDienThoai.equals(danhBaList.get(i).getSoDienThoai())) {
                return true;
            }
        }
        return false;
    }

    public DanhBa getDanhBa(String soDienThoai) {
        for (DanhBa danhBa1 : danhBaList) {
            if (danhBa1.getSoDienThoai().equals(soDienThoai)) {
                return danhBa1;
            }
        }
        return null;
    }
}
