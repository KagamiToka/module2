package bai_tap_lam_them.controller;

import bai_tap_lam_them.model.entity.Truck;
import bai_tap_lam_them.model.service.ITruckService;
import bai_tap_lam_them.model.service.TruckService;

import java.util.List;

public class TruckController {
    ITruckService truckService = new TruckService();

    public void addTruck(Truck truck) {
        truckService.addTruck(truck);
    }

    public List<Truck> getAllTruck() {
        return truckService.findAllTrucks();
    }

    public void deleteTruck(String id) { truckService.deleteTruck(id); }

    public void updateTruck(String id, Truck truck) {truckService.updateTruck(id, truck);}
}
