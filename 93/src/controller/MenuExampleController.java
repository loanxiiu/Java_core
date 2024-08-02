package controller;

import view.MenuExampleView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuExampleController implements ActionListener {
    private MenuExampleView menuExampleView;

    public MenuExampleController(MenuExampleView menuExampleView) {
        this.menuExampleView = menuExampleView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();
        if(button.equals("Exit")) {
            this.menuExampleView.setTextJLabel("Ban da click JMenuItem EXIT");
            System.exit(0);
        }
        else if(button.equals("Toolbar")) {
            AbstractButton checkBox = (AbstractButton) e.getSource();
            boolean check = checkBox.getModel().isSelected();
            if(check) {
                this.menuExampleView.enableToolbar();
            }
            else {
                this.menuExampleView.disableToolbar();
            }
        }
        else {
            this.menuExampleView.setTextJLabel("Ban da click: "+button);
        }
    }
}
