package luyen_tap.model.service;

import luyen_tap.model.entity.Drone;
import luyen_tap.model.repository.DroneRepository;

import java.util.List;

public class DroneService implements IDroneService {
    private static DroneRepository droneRepository = new DroneRepository();

    @Override
    public List<Drone> getAllDrones() {
        return droneRepository.getDroneList();
    }

    @Override
    public void addDrone(Drone drone) {
        if (droneRepository.addDrone(drone)) {
            System.out.println("Thêm mới thanh cong");
        } else {
            System.out.println("Đã tồn tại số hiệu này");
        }
    }

    @Override
    public void removeDrone(String soHieu) {
        if (droneRepository.deleteDrone(soHieu)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy số hiệu này");
        }
    }

    @Override
    public void updateDrone(String soHieu, Drone drone) {
        if (droneRepository.updateDrone(soHieu, drone )) {
            System.out.println("Sửa thành công");
        } else {
            System.out.println("Không tìm thấy số hiệu này");
        }
    }

    @Override
    public void getDrone(String soHieu) {
        if (droneRepository.getDrone(soHieu) != null) {
            System.out.println(droneRepository.getDrone(soHieu));
        } else {
            System.out.println("Không tìm thấy phương tiện phù hợp");
        }
    }
}
