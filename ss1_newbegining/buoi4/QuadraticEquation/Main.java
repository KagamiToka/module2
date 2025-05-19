package buoi4.QuadraticEquation;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double a, b, c;
        System.out.print("Enter value of a: ");
        a = Double.parseDouble(sc.nextLine());
        System.out.print("Enter value of b: ");
        b = Double.parseDouble(sc.nextLine());
        System.out.print("Enter value of c: ");
        c = Double.parseDouble(sc.nextLine());
        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        double discriminant = qe.getDiscriminant(a, b, c);
        if (discriminant < 0) {
            System.out.println("The equation has no real roots");
        } else if (discriminant == 0) {
            System.out.println("The equation has one real root: " + qe.getRoot1(a, b, c));
        } else {
            System.out.println("The equation has two real roots: " + qe.getRoot1(a, b, c) + " and " + qe.getRoot2(a, b, c));
        }
    }
}
