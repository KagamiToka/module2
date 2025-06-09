package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private static List<Car> cars = new ArrayList<>();

    static  {
        cars.add(new Car("43A-212.56","Toyota","2019","Nguyễn Văn A",5,"Du lịch"));
        cars.add(new Car("43B-453.88","Huyndai","2020","Nguyễn Văn B",45,"Xe khách"));
        cars.add(new Car("43B-453.89","Ford","2020","Nguyễn Văn C",12,"Xe khách"));
    }


    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> findAllCars() {
        return cars;
    }

    public void deleteCar(String id) {
        for(Car car : cars){
            if (car.getBienKiemSoat().equals(id)){
                cars.remove(car);
            }
        }
    }

    public void updateCar(String id, Car car) {
        for(Car car1 : cars){
            if (car1.getBienKiemSoat().equals(id)){
                car1.setBienKiemSoat(car.getBienKiemSoat());
                car1.setTenHangSanXuat(car.getTenHangSanXuat());
                car1.setNamSanXuat(car.getNamSanXuat());
                car1.setChuSoHuu(car.getChuSoHuu());
                car1.setSoChoNgoi(car.getSoChoNgoi());
                car1.setKieuXe(car.getKieuXe());
            }
        }
    }
}
