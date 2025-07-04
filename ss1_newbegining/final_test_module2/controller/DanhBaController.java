package final_test_module2.controller;

import final_test_module2.model.entity.DanhBa;
import final_test_module2.model.service.DanhBaService;
import final_test_module2.model.service.IDanhBaService;

import java.util.List;

public class DanhBaController {
    private IDanhBaService danhBaService = new DanhBaService();

    public List<DanhBa> listDanhBa() {
        return danhBaService.listDanhBa();
    }

    public void addDanhBa(DanhBa danhBa) {
        danhBaService.addDanhBa(danhBa);
    }

    public void deleteDanhBa(String soDienThoai) {
        danhBaService.deleteDanhBa(soDienThoai);
    }

    public void updateDanhBa(String soDienThoai, DanhBa danhBa) {
        danhBaService.updateDanhBa(soDienThoai, danhBa);
    }

    public boolean getSoDienThoai(String soDienThoai) {
        return danhBaService.getSoDienThoai(soDienThoai);
    }

    public DanhBa getDanhBa(String soDienThoai) {
        return danhBaService.getDanhBa(soDienThoai);
    }

    public void readFile() {
        danhBaService.readFile();
    }

    public void saveFile() {
        danhBaService.writeFile();
    }
}
