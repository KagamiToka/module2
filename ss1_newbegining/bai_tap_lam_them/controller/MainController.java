package bai_tap_lam_them.controller;

import bai_tap_lam_them.model.entity.Car;
import bai_tap_lam_them.model.entity.Motor;
import bai_tap_lam_them.model.entity.Truck;
import bai_tap_lam_them.view.MainView;

import java.util.List;
import java.util.Scanner;

public class MainController {
    static MotorController mc = new MotorController();
    static CarController cc = new CarController();
    static TruckController tc = new TruckController();
    static Scanner sc = new Scanner(System.in);
    static MainView view = new MainView();
    public static void main(String[] args) {
        boolean flag = true;
        while (flag) {
            int choice = view.displayMainView();
            switch (choice) {
                case 1:
                    flag = addVehicle();
                    break;
                case 2:
                    flag = listVehicles();
                    break;
                case 3:
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Không có lựa chọn này hãy vui lòng chọn lại");
            }
        }
    }

    private static boolean addVehicle() {
        boolean flag1 = true;
        while (flag1) {
            int choice1 = view.displayAddView();
            switch (choice1) {
                case 1:
                    addTruck();
                    break;
                case 2:
                    addCar();
                    break;
                case 3:
                    addMotor();
                    break;
                case 4:
                    flag1 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này hãy vui lòng chọn lại");
            }
        }
        return true;
    }

    private static boolean listVehicles() {
        boolean flag2 = true;
        while (flag2) {
            int choice2 = view.displayListView();
            switch (choice2) {
                case 1:
                    getListTrucks();
                    break;
                case 2:
                    getListCars();
                    break;
                case 3:
                    getListMotors();
                    break;
                case 4:
                    flag2 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này hãy vui lòng chọn lại");
            }
        }
        return true;
    }

    private static void addTruck() {
        System.out.print("Hãy nhập biển kiểm soát: ");
        String newBienKiemSoat = sc.nextLine();
        System.out.print("Hãy nhập hãng sản xuất: ");
        String newHangSanXuat = sc.nextLine();
        System.out.print("Hãy nhập năm sản xuất: ");
        String newNamSanXuat = sc.nextLine();
        System.out.print("Hãy nhập chủ sở hữu: ");
        String newChuSoHuu = sc.nextLine();
        System.out.print("Hãy nhập tải trọng: ");
        Double newTaiTrong = Double.parseDouble(sc.nextLine());
        tc.addTruck(new Truck(newBienKiemSoat,newHangSanXuat,newNamSanXuat,newChuSoHuu,newTaiTrong));
    }

    private static void addCar(){
        System.out.print("Hãy nhập biển kiểm soát: ");
        String newBienKiemSoat = sc.nextLine();
        System.out.print("Hãy nhập hãng sản xuất: ");
        String newHangSanXuat = sc.nextLine();
        System.out.print("Hãy nhập năm sản xuất: ");
        String newNamSanXuat = sc.nextLine();
        System.out.print("Hãy nhập chủ sở hữu: ");
        String newChuSoHuu = sc.nextLine();
        System.out.print("Hãy nhập số chỗ ngồi: ");
        Integer newSoChoNgoi = Integer.parseInt(sc.nextLine());
        System.out.print("Hãy nhập kiểu xe: ");
        String newKieuXe =  sc.nextLine();
        cc.addCar(new Car(newBienKiemSoat,newHangSanXuat,newNamSanXuat,newChuSoHuu,newSoChoNgoi,newKieuXe));
    }

    private static void addMotor() {
        System.out.print("Hãy nhập biển kiểm soát: ");
        String newBienKiemSoat = sc.nextLine();
        System.out.print("Hãy nhập hãng sản xuất: ");
        String newHangSanXuat = sc.nextLine();
        System.out.print("Hãy nhập năm sản xuất: ");
        String newNamSanXuat = sc.nextLine();
        System.out.print("Hãy nhập chủ sở hữu: ");
        String newChuSoHuu = sc.nextLine();
        System.out.print("Hãy nhập công suất của xe: ");
        Double newCongSuat = Double.parseDouble(sc.nextLine());
        mc.addMotor(new Motor(newBienKiemSoat,newHangSanXuat,newNamSanXuat,newChuSoHuu,newCongSuat));
    }

    public static void getListCars(){
        System.out.println("------LIST CAR-----");
        List<Car> cars = cc.getAllCars();
        for (Car car : cars){
            System.out.println(car);
        }
    }

    public static void getListMotors(){
        System.out.println("------LIST MOTOR-----");
        List<Motor> motors = mc.getMotors();
        for (Motor motor : motors){
            System.out.println(motor);
        }
    }

    public static void getListTrucks(){
        System.out.println("------LIST TRUCK-----");
        List<Truck> trucks = tc.getAllTruck();
        for (Truck truck : trucks){
            System.out.println(truck);
        }
    }
}
