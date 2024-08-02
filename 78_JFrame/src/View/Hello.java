package View;

import javax.swing.*;

import java.awt.*;

public class Hello extends JFrame {
    public Hello() {
        // xay dung mot so noi dung trong chuong trinh
        this.init();

        this.setTitle("Xin chao");
        this.setSize(600, 400);

        // cua so hien thi o giua man hinh
        this.setLocationRelativeTo(null);

        // quy dinh thoat chuong trinh khi dong cua so
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // cho phep hien thi ra man hinh
        this.setVisible(true);
    }

    private void init() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JButton jtren = new JButton("Phia tren");
        JButton jduoi = new JButton("Phia duoi");
        JButton jphai = new JButton("Phia phiai");
        JButton jtrai = new JButton("Phia trai");
        JButton jtam = new JButton("Phia tam");

        mainPanel.add(jtren, BorderLayout.NORTH);
        mainPanel.add(jduoi, BorderLayout.SOUTH);
        mainPanel.add(jphai, BorderLayout.EAST);
        mainPanel.add(jtrai, BorderLayout.WEST);
        mainPanel.add(jtam, BorderLayout.CENTER);

        this.add(mainPanel);
    }
}
