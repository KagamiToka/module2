package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Truck;
import bai_tap_lam_them.model.repository.TruckRepository;

import java.util.List;

public class TruckService implements ITruckService {

    TruckRepository truckRepository = new TruckRepository();

    @Override
    public void addTruck(Truck truck) {
        if (truckRepository.addTruck(truck)) {
            System.out.println("Truck added successfully");
        } else  {
            System.out.println("Truck add failed");
        }
    }

    @Override
    public List<Truck> findAllTrucks() {
        return truckRepository.findAllTrucks();
    }

    @Override
    public void deleteTruck(String id) {
        if (truckRepository.deleteTruck(id)) {
            System.out.println("Truck deleted successfully");
        } else   {
            System.out.println("Truck delete failed");
        }
    }

    @Override
    public void updateTruck(String id, Truck truck) {
        if (truckRepository.updateTruck(id, truck)) {
            System.out.println("Truck updated successfully");
        } else   {
            System.out.println("Truck updated failed");
        }
    }

    @Override
    public void searchTruck(String id) {

    }
}
