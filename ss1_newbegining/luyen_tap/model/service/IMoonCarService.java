package luyen_tap.model.service;

import luyen_tap.model.entity.MoonCar;

import java.util.List;

public interface IMoonCarService {
    List<MoonCar> getMoonCarList();
    void addMoonCar(MoonCar moonCar);
    void deleteMoonCar(String soHieu);
    void updateMoonCar(String soHieu, MoonCar moonCar);
    void getMoonCar(String soHieu);
}
