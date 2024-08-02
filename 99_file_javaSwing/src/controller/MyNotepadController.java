package controller;

import view.MyNotepadView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class MyNotepadController implements ActionListener {
    private MyNotepadView myNotepadView;

    public MyNotepadController(MyNotepadView myNotepadView) {
        this.myNotepadView = myNotepadView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        JFileChooser fc = new JFileChooser();

        if (command.equals("Open")) {
            int returnVal = fc.showOpenDialog(this.myNotepadView);
            if(returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fc.getSelectedFile();
                String fileName = file.getName();
                this.myNotepadView.myNotepadModel.setFileName(file.getAbsolutePath());
                this.myNotepadView.jLabel1.setText(this.myNotepadView.myNotepadModel.getFileName());
                if(fileName.endsWith(".txt")) {
                    try{
                        List<String> allText = Files.readAllLines(file.toPath(), StandardCharsets.UTF_8);
                        String result = "";
                        for (String line : allText) {
                            result += line;
                            result += "\n";
                        }
                        this.myNotepadView.myNotepadModel.setContent(result);
                        this.myNotepadView.textArea1.setText(this.myNotepadView.myNotepadModel.getContent());
                    }
                    catch (IOException ex){
                        ex.printStackTrace();
                    }
                }
            }
        }

        else if (command.equals("Save")) {
            if(this.myNotepadView.myNotepadModel.getFileName().length()>0){
                save(this.myNotepadView.myNotepadModel.getFileName());
            }
            else {
                int returnVal = fc.showSaveDialog(this.myNotepadView);
                if(returnVal == JFileChooser.APPROVE_OPTION) {
                    File file = fc.getSelectedFile();
                    save(file.getAbsolutePath());
                }
            }
        }
    }

    public void save(String fileName) {
        try{
            PrintWriter pw = new PrintWriter(fileName,StandardCharsets.UTF_8);
            String data = this.myNotepadView.textArea1.getText();
            pw.print(data);
            pw.flush();
            pw.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
