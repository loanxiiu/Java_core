package view;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class MainView extends JFrame {
    private JMenu menu, submenu;
    private JMenuItem i1, i2, i3, i4, i5;
    private JMenuBar mb = new JMenuBar();
    private JButton jButton;
    private JLabel jLabel;

    public MainView() {
        this.setTitle("Notepad");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());

        // set icon => JFrame
        URL urlIconNotepad = MainView.class.getResource("notes-icon.png");
        Image img = Toolkit.getDefaultToolkit().createImage(urlIconNotepad);
        this.setIconImage(img);

        // JMenuBar
        menu = new JMenu("Menu");
        submenu = new JMenu("Sub menu");
        i1 = new JMenuItem("New");
        i1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("new-tab-icon.png"))));
        i2 = new JMenuItem("Save");
        i2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save-floppy-disk-icon.png"))));
        i3 = new JMenuItem("Save as");
        i3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("save-action-floppy-icon.png"))));
        i4 = new JMenuItem("Exit");
        i4.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("Users-Exit-icon.png"))));
        i5 = new JMenuItem("Test");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        menu.add(submenu);
        mb.add(menu);

        // JLabel
        jLabel = new JLabel();
        jLabel.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("Screenshot 2024-07-22 174306.png"))));

        // JButton
        jButton = new JButton("TEST BUTTON");
        jButton.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("new-tab-icon.png"))));
        jButton.setFont(new Font("Serif", Font.BOLD, 50));
        jButton.setSize(50, 50);

        this.setJMenuBar(mb);
        this.add(jLabel, BorderLayout.CENTER);
        this.add(jButton, BorderLayout.SOUTH);
        this.setVisible(true);
    }
}
