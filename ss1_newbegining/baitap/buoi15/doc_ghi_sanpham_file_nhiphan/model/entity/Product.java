package baitap.buoi15.doc_ghi_sanpham_file_nhiphan.model.entity;

import java.io.Serializable;

public class Product implements Serializable {
    private String maSanPham;
    private String tenSanPham;
    private double gia;
    private String hangSanXuat;
    private String moTa;
    private static final long serialVersionUID = 1L;

    public Product() {
    }

    public Product(String maSanPham, String tenSanPham, double gia, String hangSanXuat, String moTa) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.gia = gia;
        this.hangSanXuat = hangSanXuat;
        this.moTa = moTa;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", gia=" + gia +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", moTa='" + moTa + '\'' +
                '}';
    }
}
