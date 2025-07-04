package luyen_tap.model.repository;

import bai_tap_lam_them.model.entity.Car;
import luyen_tap.model.entity.Drone;

import java.io.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DroneRepository {
    private static DateFormat dateFormat = new SimpleDateFormat("yyyy");
    private static List<Drone> droneList = new ArrayList<>();
    private static String DRONE_FILE_PATH = "luyen_tap/data/drone.csv";

    public DroneRepository() {
        readFile();
    }

    private void readFile() {
        File file = new File(DRONE_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(DRONE_FILE_PATH))) {
            String line;
            boolean isFirstLine = true;
            while ((line = br.readLine()) != null) {
                // Bỏ qua dòng tiêu đề
                if (isFirstLine) {
                    isFirstLine = false;
                    continue;
                }

                // Bỏ qua dòng rỗng hoặc dòng chú thích
                if (line.trim().isEmpty() || line.trim().startsWith("//")) {
                    continue;
                }

                String[] data = line.split(",");
                if (data.length == 5) {
                    try {
                        Drone drone = new Drone(
                                data[0],
                                data[1],
                                dateFormat.parse(data[2]),
                                data[3],
                                Double.parseDouble(data[4])
                        );
                        droneList.add(drone);
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
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(DRONE_FILE_PATH))) {
            for (Drone drone : droneList) {
                bw.write(String.format("%s,%s,%s,%s,%.2f",
                        drone.getSoHieu(),
                        drone.getTenHang(),
                        drone.getNamSanXuat(),
                        drone.getNguoiDieuPhoi(),
                        drone.getTamBay()
                ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public boolean addDrone(Drone drone) {
        for (Drone d : droneList) {
            if (d.getSoHieu().equals(drone.getSoHieu())) {
                return false;
            }
        }
        droneList.add(drone);
        saveFile();
        return true;
    }

    public boolean deleteDrone(String soHieu) {
        for (int i = 0; i < droneList.size(); i++) {
            if (droneList.get(i).getSoHieu().equals(soHieu)) {
                droneList.remove(i);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public List<Drone> getDroneList() {
        return new ArrayList<>(droneList);
    }

    public boolean updateDrone(String soHieu, Drone drone) {
        for (int i = 0; i < droneList.size(); i++) {
            if (droneList.get(i).getSoHieu().equals(soHieu)) {
                droneList.set(i, drone);
                saveFile();
                return true;
            }
        }
        return false;
    }

    public Drone getDrone(String soHieu) {
        for (int i = 0; i < droneList.size(); i++) {
            if (droneList.get(i).getSoHieu().equals(soHieu)) {
                return droneList.get(i);
            }
        }
        return null;
    }
}
