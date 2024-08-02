package view;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

import javax.swing.*;
import java.awt.*;

public class MiniCalculatorView extends JFrame {
    private MiniCalculatorModel miniCalculatorModel;
    private JTextField textField_firstValue, textField_secondValue, textField_answer;
    public MiniCalculatorView() throws HeadlessException {
        this.miniCalculatorModel = new MiniCalculatorModel();
        this.init();
    }
    private void init(){
        this.setTitle("Mini Calculator");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        Font font = new Font("Arial", Font.BOLD, 20);
        JLabel jLabel_firstValue = new JLabel("1st Value");
        jLabel_firstValue.setFont(font);

        JLabel jLabel_secondValue = new JLabel("2nd Value");
        jLabel_secondValue.setFont(font);

        JLabel jLabel_answer = new JLabel("Answer");
        jLabel_answer.setFont(font);

        textField_firstValue = new JTextField(50);
        textField_firstValue.setFont(font);
        textField_secondValue = new JTextField(50);
        textField_secondValue.setFont(font);
        textField_answer = new JTextField(50);
        textField_answer.setFont(font);

        JPanel jPanelIO = new JPanel();
        jPanelIO.setLayout(new GridLayout(3, 2,10,10));
        jPanelIO.add(jLabel_firstValue);
        jPanelIO.add(textField_firstValue);
        jPanelIO.add(jLabel_secondValue);
        jPanelIO.add(textField_secondValue);
        jPanelIO.add(jLabel_answer);
        jPanelIO.add(textField_answer);

        MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
        JButton jButton_plus = new JButton("+");
        jButton_plus.setFont(font);
        jButton_plus.addActionListener(miniCalculatorListener);

        JButton jButton_minus = new JButton("-");
        jButton_minus.setFont(font);
        jButton_minus.addActionListener(miniCalculatorListener);

        JButton jButton_multiply = new JButton("*");
        jButton_multiply.setFont(font);
        jButton_multiply.addActionListener(miniCalculatorListener);

        JButton jButton_divide = new JButton("/");
        jButton_divide.setFont(font);
        jButton_divide.addActionListener(miniCalculatorListener);

        JButton jButton_pow = new JButton("^");
        jButton_pow.setFont(font);
        jButton_pow.addActionListener(miniCalculatorListener);

        JButton jButton_mod = new JButton("%");
        jButton_mod.setFont(font);
        jButton_mod.addActionListener(miniCalculatorListener);

        JPanel jPanelButtons = new JPanel();
        jPanelButtons.setLayout(new GridLayout(2, 3));
        jPanelButtons.add(jButton_plus);
        jPanelButtons.add(jButton_minus);
        jPanelButtons.add(jButton_multiply);
        jPanelButtons.add(jButton_divide);
        jPanelButtons.add(jButton_pow);
        jPanelButtons.add(jButton_mod);

        this.setLayout(new BorderLayout(10,10));
        this.add(jPanelIO, BorderLayout.CENTER);
        this.add(jPanelButtons, BorderLayout.SOUTH);

        this.setVisible(true);
    }

    public void Plus(){
        double firstValue = Double.valueOf(textField_firstValue.getText());
        double secondValue = Double.valueOf(textField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.Plus();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void Minus(){
        double firstValue = Double.valueOf(textField_firstValue.getText());
        double secondValue = Double.valueOf(textField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.Minus();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void Multiply(){
        double firstValue = Double.valueOf(textField_firstValue.getText());
        double secondValue = Double.valueOf(textField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.Mutiply();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void Divide(){
        double firstValue = Double.valueOf(textField_firstValue.getText());
        double secondValue = Double.valueOf(textField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.Divide();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void Pow(){
        double firstValue = Double.valueOf(textField_firstValue.getText());
        double secondValue = Double.valueOf(textField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.Pow();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
    public void Mod(){
        double firstValue = Double.valueOf(textField_firstValue.getText());
        double secondValue = Double.valueOf(textField_secondValue.getText());
        this.miniCalculatorModel.setFirstValue(firstValue);
        this.miniCalculatorModel.setSecondValue(secondValue);
        this.miniCalculatorModel.Mod();
        this.textField_answer.setText(this.miniCalculatorModel.getAnswer()+"");
    }
}
