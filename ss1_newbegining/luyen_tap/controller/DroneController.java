package luyen_tap.controller;

import luyen_tap.model.entity.Drone;
import luyen_tap.model.service.DroneService;
import luyen_tap.model.service.IDroneService;

import java.util.List;

public class DroneController {
    private IDroneService droneService = new DroneService();

    public List<Drone> getDroneList() {
        return droneService.getAllDrones();
    }

    public void addDrone(Drone drone) {
        droneService.addDrone(drone);
    }

    public void deleteDrone(String soHieu) {
        droneService.removeDrone(soHieu);
    }

    public void updateDrone(String soHieu, Drone drone) {
        droneService.updateDrone(soHieu, drone);
    }

    public void getDrone(String soHieu) {
        droneService.getDrone(soHieu);
    }
}
