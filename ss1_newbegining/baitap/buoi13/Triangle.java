package baitap.buoi13;

public class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Phải là số lớn hơn 0");
        }
        if (a + b <= c || b + c <= a || c + a <= b) {
            throw new IllegalTriangleException("Tổng 2 cạnh phải lớn hơn cạnh còn lại");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void getInformation() {
        System.out.println("Tam giác hợp lệ với các cạnh: " + a + ", " + b + ", " + c);
    }
}
