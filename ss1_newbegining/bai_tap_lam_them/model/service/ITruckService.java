package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Truck;

import java.util.List;

public interface ITruckService {
    void addTruck(Truck truck);
    List<Truck> findAllTrucks();
    void deleteTruck(String id);
    void updateTruck(String id, Truck truck);
    void searchTruck(String name);
}
