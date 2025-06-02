package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Car;

public class CarRepository {
    private Car[] cars = new Car[10];
    private int index = 0;

    public void addCar(Car car) {
        cars[index] = car;
        index++;
    }

    public Car[] findAllCars() {
        for (Car car : cars) {
            return car;
        }
    }

    public Car findCarById(String id) {
        for (Car car : cars) {
            if ()
        }
    }

    public void deleteCar(String id) {

    }

    public void updateCar(String id, Car car) {
        
    }
}
