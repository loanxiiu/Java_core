package controller;

import view.MyColorView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorListener implements ActionListener {
    private MyColorView myColorView;
    public MyColorListener(MyColorView myColorView) {
        this.myColorView = myColorView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String src = e.getActionCommand();
        if(src.equals("Red text")){
            this.myColorView.changeColor(Color.RED);
        }
        if(src.equals("Green text")){
            this.myColorView.changeColor(Color.green);
        }
        if(src.equals("Blue text")){
            this.myColorView.changeColor(Color.BLUE);
        }
        if(src.equals("Yellow text")){
            this.myColorView.changeBackground(Color.YELLOW);
        }
        if(src.equals("Orange text")){
            this.myColorView.changeBackground(Color.ORANGE);
        }
        if(src.equals("Pink text")){
            this.myColorView.changeBackground(Color.PINK);
        }

    }
}
