package baitap.buoi7.colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea(){
        return side * side;
    }

    public double calculatePerimeter(){
        return 4*side;
    }

    public void howToColor(){
        System.out.println("Color all four sides");
    }

    @Override
    public String toString() {
        return "A Circle with radius="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
}
