package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Car;

import java.util.List;

public interface ICarService {
    void addCar(Car car);
    List<Car> findAllCars();
    void deleteCar(String id);
    void updateCar(String id,Car car);
    void searchCar(String name);
}
