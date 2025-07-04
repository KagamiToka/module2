package luyen_tap.model.service;

import luyen_tap.model.entity.Drone;

import java.util.List;

public interface IDroneService {
    List<Drone> getAllDrones();
    void  addDrone(Drone drone);
    void  removeDrone(String soHieu);
    void  updateDrone(String soHieu, Drone drone);
    void getDrone(String soHieu);
}
