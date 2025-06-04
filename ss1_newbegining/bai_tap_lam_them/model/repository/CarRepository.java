package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Car;

import java.util.ArrayList;
import java.util.List;

public class CarRepository {
    private List<Car> cars = new ArrayList<>();

    private void insertData() {
        cars.add(1,new Car());
        cars.add(1,new Car());
        cars.add(1,new Car());
    }


    public void addCar(Car car) {
        cars.add(car);
    }

    public List<Car> findAllCars() {
        return cars;
    }

//    public Car findCarById(String id) {
//        for (Car car : cars) {
//            if (id == car.getBienKiemSoat()){
//                return car;
//        }
//    }
//
//    public void deleteCar(String id) {
//
//    }
//
//    public void updateCar(String id, Car car) {
//
//    }
}
