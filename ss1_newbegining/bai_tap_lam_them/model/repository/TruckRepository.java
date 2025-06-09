package bai_tap_lam_them.model.repository;

import bai_tap_lam_them.model.entity.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckRepository {
    private static List<Truck> trucks = new ArrayList<>();

    static {
            trucks.add(new Truck("43C-012.34", "Huyndai", "2019", "Nguyễn Văn A", 3));
            trucks.add(new Truck("43C-47.678","Dongfeng","2020","Nguyễn Văn B",9));
            trucks.add(new Truck("43C-45.235","Hino","2021","Nguyễn Văn C",12));
    }

    public void addTruck(Truck truck) {
        trucks.add(truck);
    }

    public List<Truck> findAllTrucks() {
        return trucks;
    }

    public void deleteTruck(String id) {
        for (Truck truck : trucks) {
            if (truck.getBienKiemSoat().equals(id)) {
                trucks.remove(truck);
            }
        }
    }

    public void updateTruck(String id, Truck truck) {
        for (Truck truck1 : trucks) {
            if (truck1.getBienKiemSoat().equals(id)) {
                truck1.setBienKiemSoat(truck.getBienKiemSoat());
                truck1.setTenHangSanXuat(truck.getTenHangSanXuat());
                truck1.setNamSanXuat(truck.getNamSanXuat());
                truck1.setChuSoHuu(truck.getChuSoHuu());
                truck1.setTrongTai(truck.getTrongTai());
            }
        }
    }
}
