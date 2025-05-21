package baitap.buoi5.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

//    private double getRadius() {
//    protected double getRadius() {
    public double getRadius() {
        return radius;
    }

//    protected double getArea() {
//    private double getArea() {
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
