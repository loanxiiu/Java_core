import javax.swing.*;
import java.awt.*;

public class drawEXView extends JFrame {
    public drawEXView(){
        this.setTitle("Draw EX");
        this.setSize(500,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        drawView dr = new drawView();

        this.setLayout(new BorderLayout());
        this.add(dr, BorderLayout.CENTER);
        this.setVisible(true);
    }
}
