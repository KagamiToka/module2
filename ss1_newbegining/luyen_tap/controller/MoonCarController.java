package luyen_tap.controller;

import luyen_tap.model.entity.MoonCar;
import luyen_tap.model.service.IMoonCarService;
import luyen_tap.model.service.MoonCarService;

import java.util.List;

public class MoonCarController {
    private IMoonCarService moonCarService = new MoonCarService();

    public List<MoonCar> getMoonCars() {
        return moonCarService.getMoonCarList();
    }

    public void addMoonCar(MoonCar moonCar) {
        moonCarService.addMoonCar(moonCar);
    }

    public void deleteMoonCar(String soHieu) {
        moonCarService.deleteMoonCar(soHieu);
    }

    public void updateMoonCar(String soHieu, MoonCar moonCar) {
        moonCarService.updateMoonCar(soHieu, moonCar);
    }

    public void getMoonCar(String soHieu) {
        moonCarService.getMoonCar(soHieu);
    }
}
