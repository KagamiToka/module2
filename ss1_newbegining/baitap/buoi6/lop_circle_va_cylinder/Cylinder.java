package baitap.buoi6.lop_circle_va_cylinder;

public class Cylinder extends Circle1 {
    private double height;

    public Cylinder() {
    }

    public Cylinder(double radius, String color, double height) {
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return Math.PI * getRadius() * getRadius() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" + super.toString() +
                "height=" + height +
                '}';
    }
}
