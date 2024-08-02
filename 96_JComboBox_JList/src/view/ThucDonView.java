package view;

import controller.ThucDonController;
import model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ThucDonView extends JFrame {
    public ThucDonModel thucDonModel;
    public JLabel jLabel_ThongTin;
    public JList<String> jList_MonPhu;
    public JComboBox<String> jComboBox_MonChinh;

    public ThucDonView(){
        this.thucDonModel = new ThucDonModel();
        this.init();
    }
    private void init(){
        this.setTitle("Thực đơn");
        this.setSize(600, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        Font font = new Font("Arial", Font.BOLD, 20);

        JLabel header = new JLabel("THỰC ĐƠN NHÀ HÀNG CỦA LOAN");
        header.setFont(font);

        JPanel jPanel_TieuDe = new JPanel();
        jPanel_TieuDe.add(header);
        this.add(jPanel_TieuDe, BorderLayout.NORTH);

        JPanel jPanel_MonChinh = new JPanel();
        jPanel_MonChinh.setLayout(new FlowLayout());

        String[] cacMonChinh = new String[]{"Tôm Hùm", "Cua Hoàng Đế", "Cá Hồi"};
        jComboBox_MonChinh = new JComboBox<String>(cacMonChinh);
        jComboBox_MonChinh.setFont(font);
        jPanel_MonChinh.add(jComboBox_MonChinh);

        JPanel jPanel_MonPhu = new JPanel();
        jPanel_MonPhu.setLayout(new GridLayout(1,3));

        String[] cacMonPhu = new String[]{"Trà sữa", "Pancake", "Tiramisu"};
        jList_MonPhu = new JList<>(cacMonPhu);
        jList_MonPhu.setFont(font);
        jPanel_MonPhu.add(jList_MonPhu);

        JPanel jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new BorderLayout());
        jPanel_LuaChon.add(jPanel_MonChinh, BorderLayout.NORTH);
        jPanel_LuaChon.add(jPanel_MonPhu, BorderLayout.CENTER);
        this.add(jPanel_LuaChon, BorderLayout.CENTER);

        JPanel jPanel_ThanhToan = new JPanel();
        jPanel_ThanhToan.setLayout(new GridLayout(1,2));
        jLabel_ThongTin = new JLabel();
        jLabel_ThongTin.setFont(font);
        JButton jButton_ThanhToan = new JButton("Thanh toan");
        jButton_ThanhToan.setFont(font);
        ActionListener thucDonController = new ThucDonController(this);
        jButton_ThanhToan.addActionListener(thucDonController);
        jPanel_ThanhToan.add(jLabel_ThongTin);
        jPanel_ThanhToan.add(jButton_ThanhToan);
        this.add(jPanel_ThanhToan, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void hienThiKetQua() {
        String kq = "Món chính: " + this.thucDonModel.getLuaChon_MonChinh()+
                ";\nMón phụ: " + this.thucDonModel.getLuaChon_MonPhu()+
                ";\nTổng tiền: "+ this.thucDonModel.getTongTien();
        this.jLabel_ThongTin.setText(kq);
    }
}
