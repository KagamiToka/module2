package baitap.buoi5.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println("Radius of circle is: " + cir.getRadius());
        System.out.println("Area of circle is: " + cir.getArea());

        //Sau khi đổi access modifier
        System.out.println("Radius of circle is: " + cir.getRadius());
    }
}
