import View.Form1;
import View.Hello;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Hello hello = new Hello();

//        JFrame jf = new JFrame();
//        jf.setTitle("Hello World");
//        jf.setSize(800, 600);
//
//        //gan vi tri hien thi
//        jf.setLocation(300,300);
//
//        //thoat truong trinh khi dong cua so
//        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        //cho phep hien thi
//        jf.setVisible(true);

        Form1 f = new Form1();
        f.showIt();

        Form1 f2 = new Form1();
        f2.showIt("Loan phai giau", 800,400);

    }
}