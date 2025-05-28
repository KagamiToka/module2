package baitap.buoi7.colorable;

public class Test {
    public static void main(String[] args) {
        Square s = new Square("red", true, 20);

        System.out.println(s);
        System.out.println("Area = " + s.calculateArea());
        System.out.println("Perimeter = " + s.calculatePerimeter());
        System.out.print("How to color: ");
        s.howToColor();
    }
}
