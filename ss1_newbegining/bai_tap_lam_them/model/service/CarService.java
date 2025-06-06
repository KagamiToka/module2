package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Car;
import bai_tap_lam_them.model.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService{
    CarRepository carRepository = new CarRepository();

    @Override
    public void addCar (Car car){
        carRepository.addCar(car);
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAllCars();
    }

    @Override
    public void deleteCar(String id) {

    }

    @Override
    public void searchCar(String name) {

    }

    @Override
    public void updateCar(String id, Car car) {
        
    }
}
