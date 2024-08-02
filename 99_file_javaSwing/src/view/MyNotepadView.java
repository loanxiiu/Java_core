package view;

import controller.MyNotepadController;
import model.MyNotepadModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyNotepadView extends JFrame{
    public MyNotepadModel myNotepadModel;
    public JPanel panel1;
    public JTextArea textArea1;
    public JScrollPane jScrollPane1;
    public JPanel jPane1;
    public JButton openButton;
    public JButton saveButton;
    public JLabel jLabel1;

    public MyNotepadView(){
        this.myNotepadModel = new MyNotepadModel();
        setTitle("Notepad");
        setContentPane(panel1);
        setMinimumSize(new Dimension(400, 300));
        //setModal(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);

        ActionListener actionListener = new MyNotepadController(this);
        openButton.addActionListener(actionListener);
        saveButton.addActionListener(actionListener);
    }

    public static void main(String[] args){
        try{
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MyNotepadView notepadView = new MyNotepadView();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
