package baitap.buoi7.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();

        circle.setRadius(3);
        System.out.println(circle + "Area = " + circle.getArea());
        circle.resize(60);
        System.out.println(circle + "Area = " + circle.getArea());

        rectangle.setHeight(30);
        rectangle.setWidth(60);
        System.out.println(rectangle + "Area = " + rectangle.calculateArea());
        rectangle.resize(50);
        System.out.println(rectangle + "Area = " + rectangle.calculateArea());

        square.setSize(40);
        System.out.println(square + "Area = " + square.area());
        square.resize(80);
        System.out.println(square + "Area = " + square.area());
    }
}
