package luyen_tap.model.entity;

import java.util.Date;

public class MoonCar extends AdventureTool{
    private String chongBucXa;

    public MoonCar() {
    }

    public MoonCar(String chongBucXa) {
        this.chongBucXa = chongBucXa;
    }

    public MoonCar(String soHieu, String tenHang, Date namSanXuat, String nguoiDieuPhoi, String chongBucXa) {
        super(soHieu, tenHang, namSanXuat, nguoiDieuPhoi);
        this.chongBucXa = chongBucXa;
    }

    public String getChongBucXa() {
        return chongBucXa;
    }

    public void setChongBucXa(String chongBucXa) {
        this.chongBucXa = chongBucXa;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + chongBucXa;
    }
}
