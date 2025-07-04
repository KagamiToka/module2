package luyen_tap.controller;

import luyen_tap.model.entity.Drone;
import luyen_tap.model.entity.MoonCar;
import luyen_tap.utils.ValidationUtils;
import luyen_tap.view.MainView;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainController {
//    private static final String DRONE_REGEX = "DRN-\\d{3}";
//    private static final String MOON_CAR_REGEX = "XTT-\\d{3}";
    static DateFormat df = new SimpleDateFormat("yyyy");
    static Scanner sc = new Scanner(System.in);
    private static MainView view = new MainView();
    private static DroneController droneController = new DroneController();
    private static MoonCarController moonCarController = new MoonCarController();

    public static void main(String[] args) throws ParseException {
        boolean flag = true;
        while (flag) {
            int choice = view.displayMenu();
            switch (choice) {
                case 1:
                    addView();
                    break;
                case 2:
                    listView();
                    break;
                case 3:
                    searchView();
                    break;
                case 4:
                    deleteView();
                    break;
                case 5:
                    System.out.println("Thoát chương trình...");
                    flag = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");
            }
        }
    }

    public static boolean addView() throws ParseException {
        boolean flag1 = true;
        while (flag1) {
            int choice = view.addMenu();
            switch (choice) {
                case 1:
                    addDrone();
                    break;
                case 2:
                    addMoonCar();
                    break;
                case 3:
                    flag1 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");
            }
        }
        return true;
    }

    public static boolean listView() {
        boolean flag2 = true;
        while (flag2) {
            int choice = view.listMenu();
            switch (choice) {
                case 1:
                    getDroneList();
                    break;
                case 2:
                    getMoonCarList();
                    break;
                case 3:
                    flag2 = false;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");
            }
        }
        return true;
    }

    public static boolean deleteView() throws ParseException {
        boolean flag3 = true;
        while (flag3) {
            int choice = view.deleteMenu();
            switch (choice) {
                case 1:
                    deleteDrone();
                    break;
                case 2:
                    deleteMoonCar();
                    break;
                case 3:
                    flag3 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");
            }
        }
        return true;
    }

    public static boolean searchView() throws ParseException {
        boolean flag4 = true;
        while (flag4) {
            int choice = view.searchMenu();
            switch (choice) {
                case 1:
                    searchDrone();
                    break;
                case 2:
                    searchMoonCar();
                    break;
                case 3:
                    flag4 = false;
                    break;
                default:
                    System.out.println("Không có lựa chọn này, hãy nhập lại");
            }
        }
        return true;
    }

    private static void getDroneList() {
        System.out.println("==============================");
        for (Drone drone : droneController.getDroneList()) {
            System.out.println(drone);
        }
        System.out.println("==============================");
    }

    private static void getMoonCarList() {
        System.out.println("=============================");
        for (MoonCar moonCar : moonCarController.getMoonCars()) {
            System.out.println(moonCar);
        }
        System.out.println("==============================");
    }

    private static void addDrone() throws ParseException {
        System.out.println("=============================");
//        System.out.print("Hãy nhập số hiệu: ");
//        String soHieu = sc.nextLine();
        String soHieu;
        do {
            System.out.print("Hãy nhập số hiệu: ");
            soHieu = sc.nextLine().trim();
        } while (!ValidationUtils.isValidSerialNumber(soHieu, true));
        String hangSanXuat;
        do {
            System.out.print("Hãy nhập hãng sản xuất: ");
            hangSanXuat = sc.nextLine().trim();
        } while (!ValidationUtils.isValidManufacturer(hangSanXuat));
        String nam;
        do {
            System.out.print("Hãy nhập năm sản xuất (yyyy): ");
            nam = sc.nextLine().trim();
        } while (!ValidationUtils.isValidYear(nam));
        Date namSanXuat = df.parse(nam);
        System.out.print("Hãy nhập tên người điều phối: ");
        String nguoiDieuPhoi = sc.nextLine().trim();
        if (!ValidationUtils.isNotEmpty(nguoiDieuPhoi, "Tên người điều phối")) return;
        double tamBay;
        do {
            System.out.print("Hãy nhập tầm bay tối đa của drone (số dương): ");
            try {
                tamBay = Double.parseDouble(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                tamBay = -1;
                System.out.println("Tầm bay phải là số hợp lệ!");
                continue;
            }
        } while (!ValidationUtils.isValidFlightRange(tamBay));
        droneController.addDrone(new Drone(soHieu,hangSanXuat,namSanXuat,nguoiDieuPhoi,tamBay));
        System.out.println("===============================");
    }

    private static void addMoonCar() throws ParseException {
        System.out.println("=============================");
        String soHieu;
        do {
            System.out.print("Hãy nhập số hiệu: ");
            soHieu = sc.nextLine().trim();
        } while (!ValidationUtils.isValidSerialNumber(soHieu, false));
        String hangSanXuat;
        do {
            System.out.print("Hãy nhập hãng sản xuất: ");
            hangSanXuat = sc.nextLine().trim();
        } while (!ValidationUtils.isValidManufacturer(hangSanXuat));
        String nam;
        do {
            System.out.print("Hãy nhập năm sản xuất (yyyy): ");
            nam = sc.nextLine().trim();
        } while (!ValidationUtils.isValidYear(nam));
        Date namSanXuat = df.parse(nam);
        System.out.print("Hãy nhập tên người điều phối: ");
        String nguoiDieuPhoi = sc.nextLine().trim();
        if (!ValidationUtils.isNotEmpty(nguoiDieuPhoi, "Tên người điều phối")) return;
        String chongBucXa;
        do {
            System.out.print("Hãy nhập khả năng chống bức xạ (1-10): ");
            chongBucXa = sc.nextLine().trim();
        } while (!ValidationUtils.isValidRadiationResistance(chongBucXa));
        moonCarController.addMoonCar(new MoonCar(soHieu,hangSanXuat,namSanXuat,nguoiDieuPhoi,chongBucXa));
        System.out.println("===============================");
    }

    private static void deleteMoonCar() throws ParseException {
        System.out.println("===============================");
        System.out.print("Hãy nhập số hiệu của MoonCar muốn xóa: ");
        String soHieu = sc.nextLine();
        moonCarController.deleteMoonCar(soHieu);
        System.out.println("===============================");
    }

    private static void searchMoonCar() throws ParseException {
        System.out.println("===============================");
        System.out.println("Hãy nhập số hiệu MoonCar muốn tìm: ");
        String soHieu = sc.nextLine();
        moonCarController.getMoonCar(soHieu);
        System.out.println("===============================");
    }

    private static void deleteDrone() throws ParseException {
        System.out.println("===============================");
        System.out.print("Hãy nhập số hiệu của MoonCar muốn xóa: ");
        String soHieu = sc.nextLine();
        droneController.deleteDrone(soHieu);
        System.out.println("===============================");
    }

    private static void searchDrone() throws ParseException {
        System.out.println("===============================");
        System.out.println("Hãy nhập số hiệu MoonCar muốn tìm: ");
        String soHieu = sc.nextLine();
        droneController.getDrone(soHieu);
        System.out.println("===============================");
    }
}
