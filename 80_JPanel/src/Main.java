import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        try{
            //			com.sun.java.swing.plaf.windows.WindowsLookAndFeel
            //UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MyCalculator calc = new MyCalculator();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}