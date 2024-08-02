package view;

import controller.MenuExampleController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class MenuExampleView extends JFrame {
    private final JLabel jLabel;

    public MenuExampleView() {
        this.setTitle("Menu Example");
        this.setSize(500, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // tao controller
        MenuExampleController menuExampleController = new MenuExampleController(this);

        // tao thanh menu
        JMenuBar jMenuBar = new JMenuBar();

        // tao 1 menu
        JMenu jMenu_file = new JMenu("File");
        // tao cac menu con
        JMenuItem jMenuItem_new = new JMenuItem("New");
        jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_new.addActionListener(menuExampleController);
        JMenuItem jMenuItem_open = new JMenuItem("Open");
        jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jMenuItem_open.addActionListener(menuExampleController);
        JMenuItem jMenuItem_exit = new JMenuItem("Exit");
        jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.ALT_DOWN_MASK));
        jMenuItem_exit.addActionListener(menuExampleController);
        jMenu_file.add(jMenuItem_new);
        jMenu_file.add(jMenuItem_open);
        jMenu_file.addSeparator();
        jMenu_file.add(jMenuItem_exit);

        JMenu jMenu_help = new JMenu("Help");
        jMenu_help.setMnemonic(KeyEvent.VK_L);
        jMenu_help.setDisplayedMnemonicIndex(0);

        JMenuItem jMenuItem_welcome = new JMenuItem("Welcome");
        jMenuItem_welcome.addActionListener(menuExampleController);
        jMenu_help.add(jMenuItem_welcome);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_help);

        // them thanh menu vao chuong trinh
        this.setJMenuBar(jMenuBar);

        // tao toolbar (thanh cong cu)
        JToolBar jToolBar = new JToolBar();
        JButton jButton_Undo = new JButton("Undo");
        jButton_Undo.setToolTipText("Nhấn vào đây để quay lại thao tác vừa rồi!");
        jButton_Undo.addActionListener(menuExampleController);
        JButton jButton_Redo = new JButton("Redo");
        jButton_Redo.setToolTipText("Nhấn vào đây để quay lại thao tác vừa rồi!");
        jButton_Redo.addActionListener(menuExampleController);
        JButton jButton_Copy = new JButton("Copy");
        jButton_Copy.addActionListener(menuExampleController);
        JButton jButton_cut = new JButton("Cut");
        jButton_cut.addActionListener(menuExampleController);
        JButton jButton_Paste = new JButton("Paste");
        jButton_Paste.addActionListener(menuExampleController);

        jToolBar.add(jButton_Undo);
        jToolBar.add(jButton_Redo);
        jToolBar.add(jButton_Copy);
        jToolBar.add(jButton_cut);
        jToolBar.add(jButton_Paste);


        // tao label hien thi
        Font font = new Font("Serif", Font.BOLD, 50);
        jLabel = new JLabel();

        this.setLayout(new BorderLayout());
        this.add(jToolBar, BorderLayout.NORTH);
        this.add(jLabel, BorderLayout.CENTER);
        this.setVisible(true);
    }

    public void setTextJLabel(String text) {
        this.jLabel.setText(text);
    }
}
