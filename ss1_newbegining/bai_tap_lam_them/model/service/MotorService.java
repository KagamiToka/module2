package bai_tap_lam_them.model.service;

import bai_tap_lam_them.model.entity.Motor;
import bai_tap_lam_them.model.repository.MotorRepository;

import java.util.List;

public class MotorService implements IMotorService{
    MotorRepository motorRepository = new MotorRepository();

    @Override
    public void addMotor(Motor motor) {
        if (motorRepository.addMotor(motor)) {
            System.out.println("Motor added successfully");
        } else {
            System.out.println("Motor add failed");
        }
    }

    @Override
    public List<Motor> findAllMotors() {return motorRepository.findALlMotors();}

    @Override
    public void deleteMotor(String id) {
        if (motorRepository.deleteMotor(id)) {
            System.out.println("Motor deleted successfully");
        } else  {
            System.out.println("Motor delete failed");
        }
    }

    @Override
    public void updateMotor(String id, Motor motor) {
        if (motorRepository.updateMotor(id, motor)) {
            System.out.println("Motor updated successfully");
        } else  {
            System.out.println("Motor updated failed");
        }
    }

    @Override
    public void searchMotor(String name) {

    }
}
