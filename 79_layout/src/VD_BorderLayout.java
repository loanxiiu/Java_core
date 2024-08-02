import javax.swing.*;
import java.awt.*;

public class VD_BorderLayout extends JFrame {
    public VD_BorderLayout() {
        this.setTitle("ViDu FlowLayout");
        this.setSize(600, 400);

        // can giua cua so chuong trinh
        this.setLocationRelativeTo(null);

        // set layout
        BorderLayout layout = new BorderLayout();
        BorderLayout layout2 = new BorderLayout(15,15);

        this.setLayout(layout2);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        // add thanh phan
        this.add(button1, BorderLayout.NORTH);
        this.add(button2, BorderLayout.SOUTH);
        this.add(button3, BorderLayout.EAST);
        this.add(button4, BorderLayout.WEST);
        this.add(button5, BorderLayout.CENTER);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
