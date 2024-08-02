import javax.swing.*;
import java.awt.*;

public class VD_GridLayout extends JFrame {
    public VD_GridLayout() {
        this.setTitle("ViDu FlowLayout");
        this.setSize(600, 400);

        // can giua cua so chuong trinh
        this.setLocationRelativeTo(null);

        // set layout
        GridLayout layout = new GridLayout();
        GridLayout layout1 = new GridLayout(3,3);
        GridLayout layout2 = new GridLayout(3,3,25,25);
        this.setLayout(layout1);

        for(int i=0; i<9; i++){
            JButton button = new JButton(i+"");
            this.add(button);
        }

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
