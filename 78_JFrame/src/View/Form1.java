package View;

import javax.swing.*;

public class Form1 extends JFrame {
    public Form1() {

    }
    public void showIt(){
        this.setVisible(true);
    }

    public void showIt(String title, int width, int height){
        this.setTitle(title);
        this.setSize(width, height);
        this.setVisible(true);
    }
}
