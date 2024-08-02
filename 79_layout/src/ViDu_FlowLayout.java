import javax.swing.*;
import java.awt.*;

public class ViDu_FlowLayout extends JFrame {
    public ViDu_FlowLayout(){
        this.setTitle("ViDu FlowLayout");
        this.setSize(600, 400);

        // can giua cua so chuong trinh
        this.setLocationRelativeTo(null);

        // set layout
        FlowLayout flowLayout = new FlowLayout();
        FlowLayout flowLayout1 = new FlowLayout(FlowLayout.RIGHT,50,50);
        FlowLayout flowLayout2 = new FlowLayout(FlowLayout.TRAILING);

        this.setLayout(flowLayout1);

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");

        // add thanh phan
        this.add(button1);
        this.add(button2);
        this.add(button3);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
