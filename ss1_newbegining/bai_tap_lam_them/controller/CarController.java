package bai_tap_lam_them.controller;

import bai_tap_lam_them.model.entity.Car;
import bai_tap_lam_them.model.service.CarService;
import bai_tap_lam_them.model.service.ICarService;

public class CarController {
    private ICarService carService = new CarService();

    public void addCar (Car car){
        carService.addCar(car);
    }
}
