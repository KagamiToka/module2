package luyen_tap.model.service;

import luyen_tap.model.entity.MoonCar;
import luyen_tap.model.repository.MoonCarRepository;

import java.util.List;

public class MoonCarService implements IMoonCarService {
    private static MoonCarRepository moonCarRepository = new MoonCarRepository();

    @Override
    public List<MoonCar> getMoonCarList() {
        return moonCarRepository.getMoonCars();
    }

    @Override
    public void addMoonCar(MoonCar moonCar) {
        if (moonCarRepository.addMoonCar(moonCar)) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }

    @Override
    public void deleteMoonCar(String soHieu) {
        if (moonCarRepository.deleteMoonCar(soHieu)) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy số hiệu này");
        }
    }

    @Override
    public void updateMoonCar(String soHieu, MoonCar moonCar) {
        if (moonCarRepository.updateMoonCar(soHieu, moonCar)) {
            System.out.println("Chỉnh sửa thành công");
        } else {
            System.out.println("Không tìm thấy số hiệu này");
        }
    }

    @Override
    public void getMoonCar(String soHieu) {
        if (moonCarRepository.getMoonCar(soHieu) != null) {
            System.out.println(moonCarRepository.getMoonCar(soHieu));
        } else {
            System.out.println("Không tìm thấy phương tiện phù hợp");
        }
    }
}
