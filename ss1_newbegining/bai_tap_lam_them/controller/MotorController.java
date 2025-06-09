package bai_tap_lam_them.controller;

import bai_tap_lam_them.model.entity.Motor;
import bai_tap_lam_them.model.service.CarService;
import bai_tap_lam_them.model.service.ICarService;
import bai_tap_lam_them.model.service.IMotorService;
import bai_tap_lam_them.model.service.MotorService;

import java.util.List;

public class MotorController {
    private IMotorService motorService = new MotorService();

    public void addMotor(Motor motor) { motorService.addMotor(motor); }

    public List<Motor> getMotors() { return motorService.findAllMotors(); }

    public void deleteMotor(String id) { motorService.deleteMotor(id);}

    public void updateMotor(String id, Motor motor) { motorService.updateMotor(id, motor); }
}
