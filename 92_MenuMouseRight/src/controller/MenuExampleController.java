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
        if(button.equals("Exit")) {
            this.menuExampleView.setTextJLabel("Ban da click JMenuItem EXIT");
            System.exit(0);
        }
        else {
            this.menuExampleView.setTextJLabel("Ban da click: "+button);
        }
    }
}
