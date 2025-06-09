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
                    flag = editDeleteVehicle();
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

    private static boolean editDeleteVehicle() {
        boolean flag3 = true;
        while (flag3) {
            int choice3 = view.displayEditDelateView();
            switch (choice3) {
                case 1:
                    flag3 = editVehicle();
                    break;
                case 2:
                    flag3 = deleteVehicle();
                    break;
                case 3:
                    flag3 = false;
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
        return true;
    }

    private static boolean editVehicle() {
        boolean flag4 = true;
        while (flag4) {
            int choice4 = view.displayEditView();
            switch (choice4) {
                case 1:
                    updateTrucks();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    flag4 = false;
                default:
                    System.out.println("Không cóa lựa chọn này");
            }
        }
        return true;
    }

    private static boolean deleteVehicle() {
        boolean flag5 = true;
        while (flag5) {
            int choice5 = view.displayDeleteView();
            switch (choice5) {
                case 1:
                    deleteTrucks();
                    break;
                case 2:
                    deleteCars();
                    break;
                case 3:
                    deleteMotors();
                    break;
                case 4:
                    flag5 = false;
                default:
                    System.out.println("Không cóa lựa chọn này");
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

    public static void deleteTrucks(){
        System.out.println("------DELETE TRUCK-----");
        System.out.println("Nhập biển kiểm soát xe muốn xóa: ");
        String newBienKiemSoat = sc.nextLine();
        tc.deleteTruck(newBienKiemSoat);
    }

    public static void deleteMotors(){
        System.out.println("------DELETE MOTOR-----");
        System.out.println("Nhập biển kiểm soát xe muốn xóa: ");
        String bienKiemSoat = sc.nextLine();
        mc.deleteMotor(bienKiemSoat);
    }

    public static void deleteCars(){
        System.out.println("------DELETE CAR-----");
        System.out.println("Nhập biển kiểm soát xe muốn xóa: ");
        String bienKiemSoat = sc.nextLine();
        cc.deleteCar(bienKiemSoat);
    }

    public static void updateTrucks(){
        System.out.println("------UPDATE TRUCK-----");
        System.out.print("Nhập biển kiểm soát xe muốn xóa: ");
        String bienKiemSoat = sc.nextLine();
        System.out.print("Nhập biển kiểm soát mới: ");
        String newBienKiemSoat = sc.nextLine();
        System.out.print("Nhập tên hãng sản xuất mới: ");
        String newHangSanXuat = sc.nextLine();
        System.out.print("Nhập năm sản xuất mới: ");
        String newNamSanXuat = sc.nextLine();
        System.out.print("Nhập chủ sở hữu mới: ");
        String newChuSoHuu = sc.nextLine();
        System.out.print("Nhập tải trọng mới: ");
        Double newTrongTai = Double.parseDouble(sc.nextLine());
        tc.updateTruck(bienKiemSoat, new Truck(newBienKiemSoat,newHangSanXuat,newNamSanXuat,newChuSoHuu,newTrongTai));
    }
}
