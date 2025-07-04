package luyen_tap.model.entity;

import java.util.Date;

public class Drone extends AdventureTool{
    private double tamBay;

    public Drone() {
    }

    public Drone(double tamBay) {
        this.tamBay = tamBay;
    }

    public Drone(String soHieu, String tenHang, Date namSanXuat, String nguoiDieuPhoi, double tamBay) {
        super(soHieu, tenHang, namSanXuat, nguoiDieuPhoi);
        this.tamBay = tamBay;
    }

    public double getTamBay() {
        return tamBay;
    }

    public void setTamBay(double tamBay) {
        this.tamBay = tamBay;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + tamBay;
    }
}
