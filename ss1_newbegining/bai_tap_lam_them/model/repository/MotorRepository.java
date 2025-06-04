package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Motor;

import java.util.ArrayList;
import java.util.List;

public class MotorRepository {
    private List<Motor> motors = new ArrayList<>();

    private void insertData() {
        motors.add(1,new Motor());
        motors.add(1,new Motor());
        motors.add(1,new Motor());
    }

    public void addMotor (Motor motor){
        motors.add(motor);
    }

    public List<Motor> findALlMotors(){
        return motors;
    }
}
