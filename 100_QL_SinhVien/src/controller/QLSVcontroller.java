package controller;

import model.ThiSinh;
import view.QLSVView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class QLSVcontroller implements ActionListener {
    private QLSVView qlsvView;
    public QLSVcontroller(QLSVView qlsvView) {
        this.qlsvView = qlsvView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        //JOptionPane.showMessageDialog(qlsvView,"Bạn vừa nhấn vào "+command);
        if(command.equals("Thêm")){
            this.qlsvView.xoaForm();
            this.qlsvView.qlsvModel.setLuaChon("Thêm");
        }
        else if(command.equals("Lưu")){
            try {
                this.qlsvView.thucHienThemSinhVien();
            }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
        }
        else if(command.equals("Cập nhật")){
            this.qlsvView.hienThiThongTinSinhVienDaChon();
        }
        else if(command.equals("Xóa")){
            this.qlsvView.thucHienXoaSinhVien();
            ArrayList<ThiSinh> l = this.qlsvView.qlsvModel.getDsThiSinh();
            for(ThiSinh thiSinh : l){
                System.out.println(thiSinh);
            }
        }
        else if(command.equals("Hủy bỏ")){
            this.qlsvView.xoaForm();
        }
        else if(command.equals("Tìm")){
            this.qlsvView.thucHienTim();
        }
        else if(command.equals("Hủy tìm")){
            this.qlsvView.thucHienTaiLaiDuLieu();
        }
        else if(command.equals("About me")){
            this.qlsvView.hienThiAbout();
        }
        else if (command.equals("Exit")) {
            this.qlsvView.thoatKhoiChuongTrinh();
        }
        else if (command.equals("Save")){
            this.qlsvView.thucHienSave();
        }
        else if(command.equals("Open")){
            this.qlsvView.thucHienOpen();
        }
    }
}
