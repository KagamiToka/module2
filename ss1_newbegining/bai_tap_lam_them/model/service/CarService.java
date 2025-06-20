package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Car;
import bai_tap_lam_them.model.repository.CarRepository;

import java.util.List;

public class CarService implements ICarService{
    CarRepository carRepository = new CarRepository();

    @Override
    public void addCar (Car car){
        if (carRepository.addCar(car)) {
            System.out.println("Car added successfully");
        } else  {
            System.out.println("Car already exists");
        }
    }

    @Override
    public List<Car> findAllCars() {
        return carRepository.findAllCars();
    }

    @Override
    public void deleteCar(String id) {
        if (carRepository.deleteCar(id)) {
            System.out.println("Car deleted successfully");
        } else  {
            System.out.println("Car not found");
        }
    }

    @Override
    public void searchCar(String name) {

    }

    @Override
    public void updateCar(String id, Car car) {
        if (carRepository.updateCar(id,car)) {
            System.out.println("Car updated successfully");
        } else   {
            System.out.println("Car not found");
        }
    }
}
