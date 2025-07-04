package final_test_module2.model.service;

import final_test_module2.model.entity.DanhBa;

import java.util.List;

public interface IDanhBaService {
    List<DanhBa> listDanhBa();
    void addDanhBa(DanhBa danhBa);
    void deleteDanhBa(String soDienThoai);
    void updateDanhBa(String soDienThoai, DanhBa danhBa);
    boolean getSoDienThoai(String soDienThoai);
    DanhBa getDanhBa(String soDienThoai);
    void readFile();
    void writeFile();
}
