package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Motor;
import bai_tap_lam_them.model.repository.MotorRepository;

import java.util.List;

public class MotorService implements IMotorService{
    MotorRepository motorRepository = new MotorRepository();

    @Override
    public void addMotor(Motor motor) { motorRepository.addMotor(motor); }

    @Override
    public List<Motor> findAllMotors() {return motorRepository.findALlMotors();}

    @Override
    public void deleteMotor(String id) {

    }

    @Override
    public void updateMotor(String id, Motor motor) {

    }

    @Override
    public void searchMotor(String name) {

    }
}
