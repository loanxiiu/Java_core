package view;

import controller.MyColorListener;
import model.MyColorModel;

import javax.swing.*;
import java.awt.*;

public class MyColorView extends JFrame {
    private MyColorModel myColorModel;
    private JLabel jLabel;

    public MyColorView(){
        this.myColorModel = new MyColorModel();
        this.init();
    }
    private void init(){
        this.setTitle("My Color");
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font_text = new Font("Serif", Font.PLAIN, 20);
        jLabel = new JLabel("TEXT");
        jLabel.setFont(font_text);

        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2, 3));

        Font font = new Font("Arial", Font.PLAIN, 20);
        MyColorListener myColorListener = new MyColorListener(this);

        JButton jButton_text_red = new JButton("Red text");
        jButton_text_red.setFont(font);
        jButton_text_red.setForeground(Color.red);
        jButton_text_red.setOpaque(true);
        jButton_text_red.setBorderPainted(false);
        jButton_text_red.addActionListener(myColorListener);

        JButton jButton_text_blue = new JButton("Blue text");
        jButton_text_blue.setFont(font);
        jButton_text_blue.setForeground(Color.blue);
        jButton_text_blue.setOpaque(true);
        jButton_text_blue.addActionListener(myColorListener);

        JButton jButton_text_green = new JButton("Green text");
        jButton_text_green.setFont(font);
        jButton_text_green.setForeground(Color.green);
        jButton_text_green.setOpaque(true);
        jButton_text_green.addActionListener(myColorListener);

        JButton jButton_text_yellow = new JButton("Yellow text");
        jButton_text_yellow.setFont(font);
        jButton_text_yellow.setBackground(Color.yellow);
        jButton_text_yellow.setOpaque(true);
        jButton_text_yellow.addActionListener(myColorListener);

        JButton jButton_text_pink = new JButton("Pink text");
        jButton_text_pink.setFont(font);
        jButton_text_pink.setBackground(Color.pink);
        jButton_text_pink.setOpaque(true);
        jButton_text_pink.addActionListener(myColorListener);

        JButton jButton_text_orange = new JButton("Orange text");
        jButton_text_orange.setFont(font);
        jButton_text_orange.setBackground(Color.orange);
        jButton_text_orange.setOpaque(true);
        jButton_text_orange.addActionListener(myColorListener);

        jPanel.add(jButton_text_red);
        jPanel.add(jButton_text_blue);
        jPanel.add(jButton_text_green);
        jPanel.add(jButton_text_yellow);
        jPanel.add(jButton_text_pink);
        jPanel.add(jButton_text_orange);

        this.setLayout(new BorderLayout());
        this.add(jLabel,BorderLayout.NORTH);
        this.add(jPanel,BorderLayout.CENTER);

        this.setVisible(true);
    }

    public void changeColor(Color color) {
        this.jLabel.setForeground(color);
    }
    public void changeBackground(Color color) {
        this.jLabel.setBackground(color);
        this.jLabel.setOpaque(true);
    }
}
