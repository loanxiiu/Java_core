import javax.swing.*;
import java.awt.*;

public class drawView extends JPanel {
    public drawView(){
        this.setBackground(Color.WHITE);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.drawLine(15, 15, 50, 150);

        g.setColor(Color.BLUE);
        g.drawOval(255, 255, 50, 50);

        g.setColor(Color.GREEN);
        g.drawRect(45, 150, 30, 90);

        g.setColor(Color.CYAN);
        g.fillRect(45, 150, 30, 90);

        g.setColor(Color.YELLOW);
        g.drawString("Hello World", 100, 100);
    }
}
