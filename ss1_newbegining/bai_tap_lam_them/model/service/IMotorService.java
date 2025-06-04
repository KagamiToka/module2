package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Motor;

import java.util.List;

public interface IMotorService {
    void addMotor(Motor motor);
    List<Motor> findAllMotors();
    void deleteMotor(String id);
    void updateMotor(String id, Motor motor);
    void searchMotor(String name);
}
