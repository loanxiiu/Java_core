package view;

import controller.ThucDonController;
import model.ThucDonModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ThucDonView extends JFrame {
    public ThucDonModel thucDonModel;
    public JCheckBox jCheckBox_TraSua;
    public JCheckBox jCheckBox_Pancake;
    public JCheckBox jCheckBox_Tiramisu;
    public ButtonGroup buttonGroup_MonChinh;
    public ArrayList<JCheckBox> list_buttonGroup_MonPhu;
    private JLabel jLabel_ThongTin;

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
        //jPanel_MonChinh.setBackground(Color.PINK);
        jPanel_MonChinh.setLayout(new GridLayout(1, 3));
        JRadioButton jRadioButton_TomHum = new JRadioButton("Tôm Hùm");
        jRadioButton_TomHum.setFont(font);
        JRadioButton jRadioButton_CuaHoangDe = new JRadioButton("Cua Hoàng Đế");
        jRadioButton_CuaHoangDe.setFont(font);
        JRadioButton jRadioButton_CaHoi = new JRadioButton("Cá Hồi");
        jRadioButton_CaHoi.setFont(font);

        buttonGroup_MonChinh = new ButtonGroup();
        buttonGroup_MonChinh.add(jRadioButton_TomHum);
        buttonGroup_MonChinh.add(jRadioButton_CuaHoangDe);
        buttonGroup_MonChinh.add(jRadioButton_CaHoi);

        jPanel_MonChinh.add(jRadioButton_TomHum);
        jPanel_MonChinh.add(jRadioButton_CuaHoangDe);
        jPanel_MonChinh.add(jRadioButton_CaHoi);

        JPanel jPanel_MonPhu = new JPanel();
        //jPanel_MonPhu.setBackground(Color.getHSBColor(234, 136, 149));
        jPanel_MonPhu.setLayout(new GridLayout(1,3));
        jCheckBox_TraSua = new JCheckBox("Trà sữa");
        jCheckBox_TraSua.setFont(font);
        jCheckBox_Pancake = new JCheckBox("Pancake");
        jCheckBox_Pancake.setFont(font);
        jCheckBox_Tiramisu = new JCheckBox("Tiramisu");
        jCheckBox_Tiramisu.setFont(font);
        
        list_buttonGroup_MonPhu = new ArrayList<JCheckBox>();
        list_buttonGroup_MonPhu.add(jCheckBox_TraSua);
        list_buttonGroup_MonPhu.add(jCheckBox_Pancake);
        list_buttonGroup_MonPhu.add(jCheckBox_Tiramisu);

        jPanel_MonPhu.add(jCheckBox_TraSua);
        jPanel_MonPhu.add(jCheckBox_Pancake);
        jPanel_MonPhu.add(jCheckBox_Tiramisu);

        JPanel jPanel_LuaChon = new JPanel();
        jPanel_LuaChon.setLayout(new GridLayout(2,1));
        jPanel_LuaChon.add(jPanel_MonChinh);
        jPanel_LuaChon.add(jPanel_MonPhu);
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
