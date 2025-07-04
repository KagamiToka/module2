package luyen_tap.model.entity;

import java.util.Date;

public class AdventureTool {
    private String soHieu;
    private String tenHang;
    private Date namSanXuat;
    private String nguoiDieuPhoi;

    public AdventureTool() {
    }

    public AdventureTool(String soHieu, String tenHang, Date namSanXuat, String nguoiDieuPhoi) {
        this.soHieu = soHieu;
        this.tenHang = tenHang;
        this.namSanXuat = namSanXuat;
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public Date getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(Date namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public String getNguoiDieuPhoi() {
        return nguoiDieuPhoi;
    }

    public void setNguoiDieuPhoi(String nguoiDieuPhoi) {
        this.nguoiDieuPhoi = nguoiDieuPhoi;
    }

    @Override
    public String toString() {
        return soHieu + ", " + tenHang + ", " + namSanXuat + ", " + nguoiDieuPhoi;
    }
}
