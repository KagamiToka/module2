package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Truck;
import bai_tap_lam_them.model.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {

    TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {
        truckRepository.addTruck(truck);
    }

    @Override
    public List<Truck> findAllTrucks() {
        return truckRepository.findAllTrucks();
    }

    @Override
    public void deleteTruck(String id) {

    }

    @Override
    public void updateTruck(String id, Truck truck) {

    }

    @Override
    public void searchTruck(String id) {

    }
}
