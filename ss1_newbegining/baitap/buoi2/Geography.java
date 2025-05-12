package baitap.buoi2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Geography {
    static Scanner sc = new Scanner(System.in);
    public int menu() {
        System.out.println("---------------Menu---------------");
        System.out.println("-------1. Print the rectangle-----");
        System.out.println("-------2. Print the square triangle-----");
        System.out.println("-------3. Print isosceles triangle-----");
        System.out.println("-------4. Exit program-----");
        System.out.print("Hãy nhập lựa chọn của bạn: ");
        int choose = sc.nextInt();
        return choose;
    }

    public void printRectangle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printSquareTriangle(int a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void printIsoscelesTriangle(int a) {
        for (int i = a; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Geography geo = new Geography();
        while (true) {
            int choice = geo.menu();
            switch (choice) {
                case 1:
                    System.out.print("Nhập chiều rộng: ");
                    int a = sc.nextInt();
                    System.out.print("Nhập chiều dài: ");
                    int b = sc.nextInt();
                    geo.printRectangle(a, b);
                    break;
                case 2:
                    System.out.print("Hãy nhập độ rộng của tam giác: ");
                    int c = sc.nextInt();
                    geo.printSquareTriangle(c);
                    break;
                case 3:
                    System.out.print("Hãy nhập độ rộng của tam giác: ");
                    int d = sc.nextInt();
                    geo.printIsoscelesTriangle(d);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Don't have this option");
            }
        }
    }
}
