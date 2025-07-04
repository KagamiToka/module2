package final_test_module2.model.service;

import final_test_module2.model.entity.DanhBa;
import final_test_module2.model.repository.DanhBaRepository;

import java.util.List;

public class DanhBaService implements IDanhBaService{
    private DanhBaRepository danhBaRepository = new DanhBaRepository();

    @Override
    public List<DanhBa> listDanhBa() {
        return danhBaRepository.getDanhBaList();
    }

    @Override
    public void addDanhBa(DanhBa danhBa) {
        if (danhBaRepository.addDanhBa( danhBa )) {
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Thêm mới thất bại");
        }
    }

    @Override
    public void deleteDanhBa(String soDienThoai) {
        if (danhBaRepository.deleteDanhBa( soDienThoai )) {
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không tìm thấy số điện thoại này");
        }
    }

    @Override
    public void updateDanhBa(String soDienThoai, DanhBa danhBa) {
        if (danhBaRepository.editDanhBa( soDienThoai, danhBa )) {
            System.out.println("Cập nhật thành công");
        } else {
            System.out.println("Không tìm thấy số điện thoại này");
        }
    }

    @Override
    public boolean getSoDienThoai(String soDienThoai) {
        if (danhBaRepository.getSoDienThoai( soDienThoai )) {
            return true;
        }  else {
            return false;
        }
    }

    public DanhBa getDanhBa(String soDienThoai) {
        return danhBaRepository.getDanhBa(soDienThoai);
    }

    public void readFile() {
        danhBaRepository.readFile();
    }

    @Override
    public void writeFile() {
        danhBaRepository.saveFile();
    }

}
