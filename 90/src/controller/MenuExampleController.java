package controller;

import view.MenuExampleView;

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
        if(button.equals("Open")) {
            this.menuExampleView.setTextJLabel("Ban da click JMenuItem OPEN");
        }
        else if(button.equals("Exit")) {
            this.menuExampleView.setTextJLabel("Ban da click JMenuItem EXIT");
            System.exit(0);
        }
        else if(button.equals("Welcome")) {
            this.menuExampleView.setTextJLabel("Ban da click JMenuItem WELCOME");
        }
        else if(button.equals("New")) {
            this.menuExampleView.setTextJLabel("Ban da click JMenuItem NEW");
        }
    }
}
