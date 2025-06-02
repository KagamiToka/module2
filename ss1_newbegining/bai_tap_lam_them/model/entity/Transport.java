package bai_tap_lam_them.model.entity;

public class Transport {
    private String bienKiemSoat;
    private String tenHangSanXuat;
    private String namSanXuat;
    private String chuSoHuu;

    public Transport() {
    }

    public Transport(String bienKiemSoat, String tenHangSanXuat, String namSanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHangSanXuat = tenHangSanXuat;
        this.namSanXuat = namSanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHangSanXuat() {
        return tenHangSanXuat;
    }

    public void setTenHangSanXuat(String tenHangSanXuat) {
        this.tenHangSanXuat = tenHangSanXuat;
    }

    public String getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(String namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "bienKiemSoat: '" + bienKiemSoat + '\'' +
                ", tenHangSanXuat: '" + tenHangSanXuat + '\'' +
                ", namSanXuat: '" + namSanXuat + '\'' +
                ", chuSoHuu: '" + chuSoHuu + '\'';
    }
}
