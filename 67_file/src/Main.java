import java.io.File;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Kiem tra thu muc ton tai hay ko
        File folder1 = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67");
        System.out.println("Kiem tra folder1 co ton tai khong: "+ folder1.exists());

        // Tao thu muc
        // Phuong thuc mkdir() => tao 1 thu muc
        File d1 = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67");
        d1.mkdir();
        System.out.println("Kiem tra folder1 co ton tai khong: "+ d1.exists());

        // Phuong thuc mkdirs() => tao nhieu thu muc cung luc
        File d2 = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67\\Java_67_1\\Java_67_2\\Java_67_3");
        d2.mkdirs();

        // Tao tap tin (co phan mo rong: exe, txt, dox, xls...)
        File file1 = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67\\Vidu1.txt");
        try{
            file1.createNewFile();
        }catch (IOException e){
            // khong co quyen tao tap tin
            // o cung bi day
            // duong dan sai
            e.printStackTrace();
        }
    }
}