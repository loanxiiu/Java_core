import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        this.setTitle("My Calculator");
        this.setSize(300, 400);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField jTextField  = new JTextField(50);
        JPanel panel_head = new JPanel();
        panel_head.setLayout(new BorderLayout());
        panel_head.add(jTextField, BorderLayout.CENTER);

        JButton button_0 = new JButton("0");
        JButton button_1 = new JButton("1");
        JButton button_2 = new JButton("2");
        JButton button_3 = new JButton("3");
        JButton button_4 = new JButton("4");
        JButton button_5 = new JButton("5");
        JButton button_6 = new JButton("6");
        JButton button_7 = new JButton("7");
        JButton button_8 = new JButton("8");
        JButton button_9 = new JButton("9");
        JButton button_cong = new JButton("+");
        JButton button_tru = new JButton("-");
        JButton button_nhan = new JButton("*");
        JButton button_chia = new JButton("/");
        JButton button_bang = new JButton("=");

        JPanel jPanel_buttons = new JPanel();
        jPanel_buttons.setLayout(new GridLayout(5,3));

        jPanel_buttons.add(button_0);
        jPanel_buttons.add(button_1);
        jPanel_buttons.add(button_2);
        jPanel_buttons.add(button_3);
        jPanel_buttons.add(button_4);
        jPanel_buttons.add(button_5);
        jPanel_buttons.add(button_6);
        jPanel_buttons.add(button_7);
        jPanel_buttons.add(button_8);
        jPanel_buttons.add(button_9);
        jPanel_buttons.add(button_cong);
        jPanel_buttons.add(button_tru);
        jPanel_buttons.add(button_nhan);
        jPanel_buttons.add(button_chia);
        jPanel_buttons.add(button_bang);

        this.setLayout(new BorderLayout());
        this.add(panel_head, BorderLayout.NORTH);
        this.add(jPanel_buttons, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
