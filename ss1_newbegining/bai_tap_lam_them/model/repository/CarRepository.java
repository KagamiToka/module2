package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Car;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private static List<Car> cars = new ArrayList<>();
    private static final String CARS_FILE_PATH = "bai_tap_lam_them/data/cars.csv";

//    static  {
//        cars.add(new Car("43A-212.56","Toyota","2019","Nguyễn Văn A",5,"Du lịch"));
//        cars.add(new Car("43B-453.88","Huyndai","2020","Nguyễn Văn B",45,"Xe khách"));
//        cars.add(new Car("43B-453.89","Ford","2020","Nguyễn Văn C",12,"Xe khách"));
//    }

    public CarRepository() {
        readFile();
    }

    private void readFile() {
        File file = new File(CARS_FILE_PATH);
        if (!file.exists()) {
            try{
                file.createNewFile();
            }catch (IOException e) {
                System.out.println("Lỗi khi đọc file " + e.getMessage());
            }
        }

        try (BufferedReader br = new BufferedReader(new FileReader(CARS_FILE_PATH))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 6) {
                    try {
                        Car car = new Car(
                                data[0],
                                data[1],
                                data[2],
                                data[3],
                                Integer.parseInt(data[4]),
                                data[5]
                        );
                        cars.add(car);
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
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(CARS_FILE_PATH))) {
            for (Car car : cars) {
                bw.write(String.format("%s,%s,%s,%s,%d,%s",
                        car.getBienKiemSoat(),
                        car.getTenHangSanXuat(),
                        car.getNamSanXuat(),
                        car.getChuSoHuu(),
                        car.getSoChoNgoi(),
                        car.getKieuXe()
                        ));
                bw.newLine();
            }
        }catch (IOException e) {
            System.out.println("Lỗi khi ghi file " + e.getMessage());
        }
    }

    public boolean addCar(Car car) {
        for (Car car1 : cars) {
            if (car1.getBienKiemSoat().equals(car.getBienKiemSoat())) {
                return false;
            }
        }
        cars.add(car);
        saveFile();
        return true;
    }

    public List<Car> findAllCars() {
        return new ArrayList<>(cars);
    }

    public boolean deleteCar(String id) {
//        for(Car car : cars){
//            if (car.getBienKiemSoat().equals(id)){
//                cars.remove(car);
//            }
//        }
        boolean removed = cars.removeIf(car -> car.getBienKiemSoat().equals(id));
        if (removed) {
            saveFile();
        }
        return removed;
    }

    public boolean updateCar(String id, Car car) {
//        for(Car car1 : cars){
//            if (car1.getBienKiemSoat().equals(id)){
//                car1.setBienKiemSoat(car.getBienKiemSoat());
//                car1.setTenHangSanXuat(car.getTenHangSanXuat());
//                car1.setNamSanXuat(car.getNamSanXuat());
//                car1.setChuSoHuu(car.getChuSoHuu());
//                car1.setSoChoNgoi(car.getSoChoNgoi());
//                car1.setKieuXe(car.getKieuXe());
//            }
//        }
        for(int index = 0; index < cars.size(); index++) {
            if(cars.get(index).getBienKiemSoat().equals(id)) {
                cars.set(index, car);
                saveFile();
                return true;
            }
        }
        return false;
    }
}
