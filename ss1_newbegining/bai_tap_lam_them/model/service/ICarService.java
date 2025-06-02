package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Car;

public interface ICarService {
    void addCar(Car car);
    Car[] findAllCars();
    void deleteCar(String id);
    void updateCar(String id,Car car);
    void searchCar(String name);
}
