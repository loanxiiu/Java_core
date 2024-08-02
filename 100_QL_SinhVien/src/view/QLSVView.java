package view;

import controller.QLSVcontroller;
import model.QLSVModel;
import model.ThiSinh;
import model.Tinh;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import javax.swing.JComboBox;


public class QLSVView extends JFrame {
    public ButtonGroup btn_gioiTinh;
    public QLSVModel qlsvModel;
    public JPanel panel1;
    public JMenuItem jMenuItem_open;
    public JMenuItem jMenuItem_save;
    public JMenuItem jMenuItem_Exit;
    public JPanel contentPane;
    public JTextField textField2;
    public JTable table1;
    public JTextField textField3;
    public JTextField textField4;
    public JTextField textField5;
    public JTextField textField8;
    public JTextField textField9;
    public JTextField textField10;
    public JRadioButton namRadioButton;
    public JRadioButton nữRadioButton;
    public JButton thêmButton;
    public JButton xóaButton;
    public JButton cậpNhậtButton;
    public JButton lưuButton;
    public JButton hủyBỏButton;
    public JComboBox jcomboBox1;
    public JComboBox jcomboBox2;
    private JButton hủyTìmButton;
    private JButton tìmButton;
    private JMenuItem jMenuItem_aboutme;

    public QLSVView(){
        qlsvModel = new QLSVModel();
        setTitle("Quản lý sinh viên");
        setContentPane(panel1);
        createTable();
        setMinimumSize(new Dimension(800, 600));
        setLocationRelativeTo(null);

        ActionListener actionListener = new QLSVcontroller(this);
        thêmButton.addActionListener(actionListener);
        xóaButton.addActionListener(actionListener);
        cậpNhậtButton.addActionListener(actionListener);
        lưuButton.addActionListener(actionListener);
        hủyBỏButton.addActionListener(actionListener);
        tìmButton.addActionListener(actionListener);
        hủyTìmButton.addActionListener(actionListener);
        jMenuItem_open.addActionListener(actionListener);
        jMenuItem_save.addActionListener(actionListener);
        jMenuItem_Exit.addActionListener(actionListener);
        jMenuItem_aboutme.addActionListener(actionListener);

        ArrayList<Tinh> listTinh = Tinh.getDSTinh();
        jcomboBox1.addItem("");
        jcomboBox2.addItem("");
        for (Tinh tinh : listTinh) {
            jcomboBox1.addItem(tinh.getTenTinh());
            jcomboBox2.addItem(tinh.getTenTinh());
        }

        btn_gioiTinh = new ButtonGroup();
        btn_gioiTinh.add(namRadioButton);
        btn_gioiTinh.add(nữRadioButton);

        table1.setRowHeight(30);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void xoaForm() {
        textField2.setText("");
        textField3.setText("");
        textField4.setText("");
        textField5.setText("");
        textField8.setText("");
        textField9.setText("");
        textField10.setText("");
        jcomboBox1.setSelectedIndex(0);
        jcomboBox2.setSelectedIndex(0);
        btn_gioiTinh.clearSelection();
    }

    public void themThiSinhVaoTable(ThiSinh ts){
        DefaultTableModel model_table = (DefaultTableModel) table1.getModel();
        model_table.addRow(
                new Object[]{
                        ts.getMaThiSinh()+"",
                        ts.getTenThiSinh(),
                        ts.getQueQuan().getTenTinh(),
                        ts.getNgaySinh().getDate()+9+"/"+(ts.getNgaySinh().getMonth()+4)+"/"+(ts.getNgaySinh().getYear()+1899),
                        (ts.isGioiTinh() ? "Nam" : "Nữ"),
                        ts.getDiemMon1()+"",
                        ts.getDiemMon2()+"",
                        ts.getDiemMon3()+"",
                }
        );
    }

    public void themHoacCapNhatSinhVien(ThiSinh ts) {
        DefaultTableModel model_table = (DefaultTableModel) table1.getModel();

        if(!this.qlsvModel.kiemTraTonTai(ts)){
            this.qlsvModel.insert(ts);
            this.themThiSinhVaoTable(ts);
        }
        else {
            this.qlsvModel.update(ts);
            int soLuongDong = model_table.getRowCount();
            for(int i=0; i< soLuongDong; i++){
                String id = model_table.getValueAt(i, 0)+"";
                if(id.equals(ts.getMaThiSinh()+"")){
                    model_table.setValueAt(ts.getMaThiSinh()+"", i, 0);
                    model_table.setValueAt(ts.getTenThiSinh()+"", i, 1);
                    model_table.setValueAt(ts.getQueQuan().getTenTinh()+"", i, 2);
                    model_table.setValueAt(ts.getNgaySinh().getDate()+9+"/"+(ts.getNgaySinh().getMonth()+4)+"/"+(ts.getNgaySinh().getYear()+1899), i, 3);
                    model_table.setValueAt((ts.isGioiTinh() ? "Nam" : "Nữ"), i, 4);
                    model_table.setValueAt(ts.getDiemMon1()+"", i, 5);
                    model_table.setValueAt(ts.getDiemMon2()+"", i, 6);
                    model_table.setValueAt(ts.getDiemMon3()+"", i, 7);
                }
            }
        }
    }

    public ThiSinh getThiSinhDangChon(){
        DefaultTableModel model_table = (DefaultTableModel) table1.getModel();
        int i_row = table1.getSelectedRow();

        int maThiSinh = Integer.valueOf(model_table.getValueAt(i_row,0)+"");
        String tenThiSinh = model_table.getValueAt(i_row,1)+"";
        Tinh tinh = Tinh.getTinhByTen(model_table.getValueAt(i_row, 2)+"");
        String s_ngaySinh = model_table.getValueAt(i_row,3)+"";
        Date ngaySinh = new Date(s_ngaySinh);
        String textGioiTinh = model_table.getValueAt(i_row,4)+"";
        boolean gioiTinh = textGioiTinh.equals("Nam");
        float diemMon1 = Float.valueOf(model_table.getValueAt(i_row,5)+"");
        float diemMon2 = Float.valueOf(model_table.getValueAt(i_row,6)+"");
        float diemMon3 = Float.valueOf(model_table.getValueAt(i_row,7)+"");

        ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
        return ts;
    }

    public void hienThiThongTinSinhVienDaChon() {
        try{
            ThiSinh ts = getThiSinhDangChon();

            this.textField3.setText(ts.getMaThiSinh()+"");
            this.textField4.setText(ts.getTenThiSinh()+"");
            this.textField5.setText(ts.getNgaySinh().getDate()+9+"/"+(ts.getNgaySinh().getMonth()+4)+"/"+(ts.getNgaySinh().getYear()+1899));
            if(ts.isGioiTinh()){
                namRadioButton.setSelected(true);
            }
            else {
                nữRadioButton.setSelected(true);
            }
            this.jcomboBox2.setSelectedItem(ts.getQueQuan().getTenTinh());
            this.textField8.setText(ts.getDiemMon1()+"");
            this.textField9.setText(ts.getDiemMon2()+"");
            this.textField10.setText(ts.getDiemMon3()+"");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void thucHienXoaSinhVien() {
        DefaultTableModel model_table = (DefaultTableModel) table1.getModel();
        int i_row = table1.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa dòng đã chọn?");
        if(luaChon == JOptionPane.YES_OPTION){
            ThiSinh ts = getThiSinhDangChon();
            this.qlsvModel.delete(ts);
            model_table.removeRow(i_row);
        }
    }

    public void thucHienThemSinhVien() {
        int maThiSinh = Integer.valueOf(textField3.getText());
        String tenThiSinh = textField4.getText();
        int queQuan = jcomboBox2.getSelectedIndex()-1;
        Tinh tinh = Tinh.getTinhById(queQuan);
        Date ngaySinh = new Date(textField5.getText());
        boolean gioiTinh = true;
        if(namRadioButton.isSelected()){
            gioiTinh = true;
        }
        else if(nữRadioButton.isSelected()){
            gioiTinh = false;
        }
        float diemMon1 = Float.valueOf(textField8.getText());
        float diemMon2 = Float.valueOf(textField9.getText());
        float diemMon3 = Float.valueOf(textField10.getText());

        ThiSinh ts = new ThiSinh(maThiSinh, tenThiSinh, tinh, ngaySinh, gioiTinh, diemMon1, diemMon2, diemMon3);
        themHoacCapNhatSinhVien(ts);
    }

    public void thucHienTim() {
        // goi ham huy tim
        this.thucHienTaiLaiDuLieu();
        // thuc hien tim
        int queQuan = jcomboBox1.getSelectedIndex()-1;
        String maTS = textField2.getText();
        DefaultTableModel model_table = (DefaultTableModel) table1.getModel();
        int soLuongDong = model_table.getRowCount();
        Set<Integer> idCuaThiSinhCanXoa = new TreeSet<Integer>();
        if(queQuan>=0){
            Tinh tinhDaChon = Tinh.getTinhById(queQuan);
            for(int i=0; i<soLuongDong; i++){
                String tenTinh =model_table.getValueAt(i,2)+"";
                String id = model_table.getValueAt(i,0)+"";
                if(!tenTinh.equals(tinhDaChon.getTenTinh())){
                    idCuaThiSinhCanXoa.add(Integer.valueOf(id));
                }
            }
        }
        if(maTS.length()>0){
            for(int i=0; i<soLuongDong; i++){
                String id = model_table.getValueAt(i,0)+"";
                if(!id.equals(maTS)){
                    idCuaThiSinhCanXoa.add(Integer.valueOf(id));
                }
            }
        }
        for(Integer idCanXoa : idCuaThiSinhCanXoa){
            soLuongDong = model_table.getRowCount();
            for(int i=0; i< soLuongDong; i++){
                String idTrongTable = model_table.getValueAt(i,0)+"";
                if(idTrongTable.equals(idCanXoa.toString())){
                    try {
                        model_table.removeRow(i);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
    }

    public void thucHienTaiLaiDuLieu() {
        while (true){
            DefaultTableModel model_table = (DefaultTableModel) table1.getModel();
            int soLuongDong = model_table.getRowCount();
            if(soLuongDong==0){
                break;
            }else {
                try{
                    model_table.removeRow(0);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        for(ThiSinh ts : this.qlsvModel.getDsThiSinh()){
            this.themThiSinhVaoTable(ts);
        }
    }

    public void hienThiAbout(){
        JOptionPane.showMessageDialog(this, "Phần mềm quản lý thí sinh 1.0!");
    }

    public void thoatKhoiChuongTrinh(){
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có muốn thoát khỏi chương trình", "Exit", JOptionPane.YES_NO_OPTION);
        if(luaChon == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    public void saveFile(String path){
        try{
            this.qlsvModel.setTenFile(path);
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(ThiSinh ts: this.qlsvModel.getDsThiSinh()){
                oos.writeObject(ts);
            }
            oos.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void thucHienSave() {
        if(this.qlsvModel.getTenFile().length()>0){
            saveFile(this.qlsvModel.getTenFile());
        }
        else {
            JFileChooser fc = new JFileChooser();
            int returnVal = fc.showSaveDialog(this);
            if(returnVal == JFileChooser.APPROVE_OPTION){
                File file = fc.getSelectedFile();
                saveFile(file.getAbsolutePath());
            }
        }
    }

    public void openFile(File file){
        ArrayList<ThiSinh> ds = new ArrayList<ThiSinh>();
        try{
            this.qlsvModel.setTenFile(file.getAbsolutePath());
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            ThiSinh ts = null;
            while((ts =(ThiSinh) ois.readObject()) != null){
                ds.add(ts);
            }
            ois.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        this.qlsvModel.setDsThiSinh(ds);
    }

    public void thucHienOpen() {
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
            openFile(file);
            thucHienTaiLaiDuLieu();
        }
    }

    public void createTable(){
        Object[][] data = {};
        table1.setModel(new DefaultTableModel(data, new String[]{"Mã Sinh viên", "Họ tên", "Quê quán", "Ngày sinh", "Giới tính", "Điểm 1", "Điểm 2", "Điểm 3"}));
        TableColumnModel columnModel = table1.getColumnModel();
        columnModel.getColumn(2).setMinWidth(80);
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
             QLSVView view = new QLSVView();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
























}
