package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Motor;

import java.util.ArrayList;
import java.util.List;

public class MotorRepository {
    private static List<Motor> motors = new ArrayList<>();

    static  {
        motors.add(new Motor("43-K1-678.56","Yamaha","2019","Nguyễn Văn A",100));
        motors.add(new Motor("43-H1-345.89","Honda","2019","Nguyễn Văn B",150));
        motors.add(new Motor("43-AK-765.23","Ford","2020","Nguyễn Văn C",50));
    }

    public void addMotor (Motor motor){
        motors.add(motor);
    }

    public List<Motor> findALlMotors(){
        return motors;
    }
}
