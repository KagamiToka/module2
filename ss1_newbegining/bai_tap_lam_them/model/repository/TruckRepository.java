package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Motor;
import bai_tap_lam_them.model.entity.Truck;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TruckRepository {
    private static List<Truck> trucks = new ArrayList<>();
    private static final String TRUCKS_FILE_PATH = "bai_tap_lam_them/data/trucks.csv";

//    static {
//            trucks.add(new Truck("43C-012.34", "Huyndai", "2019", "Nguyễn Văn A", 3));
//            trucks.add(new Truck("43C-47.678","Dongfeng","2020","Nguyễn Văn B",9));
//            trucks.add(new Truck("43C-45.235","Hino","2021","Nguyễn Văn C",12));
//    }

    private void readFile() {
        File file = new File(TRUCKS_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(TRUCKS_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    try {
                        Truck truck = new Truck(
                                data[0],
                                data[1],
                                data[2],
                                data[3],
                                Double.parseDouble(data[4])
                        );
                        trucks.add(truck);
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

    private void saveFile() {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(TRUCKS_FILE_PATH))) {
            for (Truck truck : trucks) {
                bw.write(String.format("%s,%s,%s,%s,%d,%s",
                        truck.getBienKiemSoat(),
                        truck.getTenHangSanXuat(),
                        truck.getNamSanXuat(),
                        truck.getChuSoHuu(),
                        truck.getTrongTai()
                ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public boolean addTruck(Truck truck) {
        for (Truck truck1 : trucks) {
            if (truck1.getBienKiemSoat().equals(truck.getBienKiemSoat())){
                return false;
            }
        }
        trucks.add(truck);
        saveFile();
        return true;
    }

    public List<Truck> findAllTrucks() {
        return new ArrayList<>(trucks) ;
    }

    public boolean deleteTruck(String id) {
//        for (Truck truck : trucks) {
//            if (truck.getBienKiemSoat().equals(id)) {
//                trucks.remove(truck);
//            }
//        }
        boolean removed = trucks.removeIf(truck -> truck.getBienKiemSoat().equals(id));
        saveFile();
        return removed;
    }

    public boolean updateTruck(String id, Truck truck) {
//        for (Truck truck1 : trucks) {
//            if (truck1.getBienKiemSoat().equals(id)) {
//                truck1.setBienKiemSoat(truck.getBienKiemSoat());
//                truck1.setTenHangSanXuat(truck.getTenHangSanXuat());
//                truck1.setNamSanXuat(truck.getNamSanXuat());
//                truck1.setChuSoHuu(truck.getChuSoHuu());
//                truck1.setTrongTai(truck.getTrongTai());
//            }
//        }
        for (int i = 0; i<trucks.size(); i++) {
            if (trucks.get(i).getBienKiemSoat().equals(id)) {
                trucks.set(i, truck);
                saveFile();
                return true;
            }
        }
        return false;
    }
}
