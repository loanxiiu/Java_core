package controller;

import view.MiniCalculatorView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MiniCalculatorListener implements ActionListener {
    private MiniCalculatorView miniCalculatorView;
    public MiniCalculatorListener(MiniCalculatorView miniCalculatorView) {
        this.miniCalculatorView = miniCalculatorView;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("+")) {
            this.miniCalculatorView.Plus();
        }
        else if(button.equals("-")) {
            this.miniCalculatorView.Minus();
        }
        else if(button.equals("*")) {
            this.miniCalculatorView.Multiply();
        }
        else if(button.equals("/")) {
            this.miniCalculatorView.Divide();
        }
        else if(button.equals("%")) {
            this.miniCalculatorView.Mod();
        }
        else if(button.equals("^")) {
            this.miniCalculatorView.Pow();
        }
    }
}
