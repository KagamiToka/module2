package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Motor;

public interface IMotorService {
    void addMotor(Motor motor);
    void findAllMotors();
    void deleteMotor(String id);
    void updateMotor(String id, Motor motor);
    void searchMotor(String name);
}
