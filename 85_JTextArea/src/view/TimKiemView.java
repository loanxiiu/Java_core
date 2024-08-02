package view;

import controller.TimKiemListener;
import model.TimKiemModel;

import javax.swing.*;
import java.awt.*;

public class TimKiemView extends JFrame {
    private TimKiemModel timKiemModel;
    private JTextField jTextField_tuKhoa;
    private JTextArea jTextArea_vanBan;
    private JLabel jLabel_ketQua;
    public TimKiemView() throws HeadlessException {
        this.timKiemModel = new TimKiemModel();
        this.init();
    }

    private void init() {
        this.setSize(800, 600);
        this.setTitle("TimKiem");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("Times New Roman", Font.BOLD, 20);

        //center
        JLabel jLabel_vanBan = new JLabel("Van ban");
        jLabel_vanBan.setFont(font);
        jTextArea_vanBan = new JTextArea(100,100);
        jTextArea_vanBan.setFont(font);

        JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);

        // footer
        TimKiemListener timKiemListener = new TimKiemListener(this);

        JLabel jLabel_tuKhoa = new JLabel("Tu Khoa");
        jLabel_tuKhoa.setFont(font);
        jTextField_tuKhoa = new JTextField();
        jTextField_tuKhoa.setFont(font);

        JButton jButton_thongKe =new JButton("Thong Ke");
        jButton_thongKe.setFont(font);
        jButton_thongKe.addActionListener(timKiemListener);
        jButton_thongKe.setBackground(Color.BLUE);
        jButton_thongKe.setBorderPainted(false);
        jButton_thongKe.setOpaque(true);

        jLabel_ketQua = new JLabel();
        jLabel_ketQua.setBackground(Color.YELLOW);
        jLabel_ketQua.setFont(font);
        jLabel_ketQua.setOpaque(true);

        JPanel jPanel_footer = new JPanel();
        jPanel_footer.setLayout(new GridLayout(2,2,20,20));
        jPanel_footer.add(jLabel_tuKhoa);
        jPanel_footer.add(jTextField_tuKhoa);
        jPanel_footer.add(jButton_thongKe);
        jPanel_footer.add(jLabel_ketQua);

        this.setLayout(new BorderLayout());
        this.add(jPanel_footer, BorderLayout.SOUTH);
        this.add(jScrollPane, BorderLayout.CENTER);
        this.add(jLabel_vanBan, BorderLayout.NORTH);
        this.setVisible(true);
    }

    public void timKiem(){
        this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
        this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
        this.timKiemModel.timKiem();
        this.jLabel_ketQua.setText(this.timKiemModel.getKetQua());
    }
}
