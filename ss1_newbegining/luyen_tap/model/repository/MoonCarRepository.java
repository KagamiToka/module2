package luyen_tap.model.repository;

import luyen_tap.model.entity.Drone;
import luyen_tap.model.entity.MoonCar;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MoonCarRepository {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy");
    private static List<MoonCar> moonCars = new ArrayList<>();
    private static String MOONCAR_FILE_PATH = "luyen_tap/data/xeTuanTra.csv";

    public MoonCarRepository() {
        readFile();
    }

    private void readFile() {
        File file = new File(MOONCAR_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(MOONCAR_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 5) {
                    try {
                        MoonCar moonCar = new MoonCar(
                                data[0],
                                data[1],
                                dateFormat.parse(data[2]),
                                data[3],
                                data[4]
                        );
                        moonCars.add(moonCar);
                    } catch (NumberFormatException e) {
                        System.out.println("Dữ liệu không đúng định dạng " + e.getMessage());
                    } catch (ParseException e) {
                        throw new RuntimeException(e);
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
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(MOONCAR_FILE_PATH))) {
            for (MoonCar moonCar : moonCars) {
                bw.write(String.format("%s,%s,%s,%s,%s",
                        moonCar.getSoHieu(),
                        moonCar.getTenHang(),
                        moonCar.getNamSanXuat(),
                        moonCar.getNguoiDieuPhoi(),
                        moonCar.getChongBucXa()
                ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public List<MoonCar> getMoonCars() {
        return new ArrayList<>(moonCars);
    }

    public boolean addMoonCar(MoonCar moonCar) {
        for (MoonCar moonCar1 : moonCars) {
            if (moonCar1.getSoHieu().equals(moonCar.getSoHieu())) {
                return false;
            }
        }
        moonCars.add(moonCar);
        saveFile();
        return true;
    }

    public boolean deleteMoonCar(String soHieu) {
        for (int i = 0; i<moonCars.size(); i++) {
            if (moonCars.get(i).getSoHieu().equals(soHieu)) {
                moonCars.remove(i);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public boolean updateMoonCar(String soHieu, MoonCar moonCar) {
        for (int i = 0; i<moonCars.size(); i++) {
            if (moonCars.get(i).getSoHieu().equals(soHieu)) {
                moonCars.set(i, moonCar);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public MoonCar getMoonCar(String soHieu) {
        for (MoonCar moonCar : moonCars) {
            if (moonCar.getSoHieu().equals(soHieu)) {
                return moonCar;
            }
        }
        return null;
    }

    public MoonCar getMoonCarByNam(String nguoiDieuPhoi) {
        for (MoonCar moonCar : moonCars) {
            if (moonCar.getNguoiDieuPhoi().equals(nguoiDieuPhoi)) {
                return moonCar;
            }
        }
        return null;
    }

//    public static void main(String[] args) {
//        MoonCarRepository moonCarRepository = new MoonCarRepository();
//        if (moonCarRepository.getMoonCars().size() == 0) {
//            System.out.println("file rỗng");
//        } else {
//            moonCarRepository.getMoonCars();
//        }
//    }
}
