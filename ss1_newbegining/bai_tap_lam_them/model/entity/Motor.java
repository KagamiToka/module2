package bai_tap_lam_them.model.entity;

public class Motor extends Transport{
    private double congSuat;

    public Motor() {
    }

    public Motor(double congSuat) {
        this.congSuat = congSuat;
    }

    public Motor(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "Motor{" + super.toString() +
                " congSuat=" + congSuat +
                '}';
    }
}
