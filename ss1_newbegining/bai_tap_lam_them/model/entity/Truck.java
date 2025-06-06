package bai_tap_lam_them.model.entity;

public class Truck extends Transport{
    private double trongTai;

    public Truck() {
    }

    public Truck(double trongTai) {
        this.trongTai = trongTai;
    }

    public Truck(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu, double trongTai) {
        super(bienKiemSoat, tenHangSanXuat, namSanXuat, chuSoHuu);
        this.trongTai = trongTai;
    }

    public double getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(double trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "Truck{" + super.toString() +
                " trongTai=" + trongTai +
                '}';
    }
}
