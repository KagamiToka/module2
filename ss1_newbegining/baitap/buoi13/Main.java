package baitap.buoi13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner sc = new Scanner(System.in);
        try {

            Triangle triangle = new Triangle(1, 2, 3);
            Triangle triangle1 = new Triangle(2, 2, 3);
            Triangle triangle2 = new Triangle(-1, 2, 3);

            triangle.getInformation();
            triangle1.getInformation();
            triangle2.getInformation();
        }catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
