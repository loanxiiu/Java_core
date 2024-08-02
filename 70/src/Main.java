import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File f0 = new File("E:\\Users\\ploan\\Java\\70\\file\\File_1.txt");
        File f1 = new File("E:\\Users\\ploan\\Java\\70\\file\\File_2.txt");
        File f2 = new File("E:\\Users\\ploan\\Java\\70\\file\\File_2xyz.txt");

//        1. Thay doi ten tap tin hoac thu muc
//        Su dung File de thay doi ten
//        f0.renameTo(f1);
//
//        Su dung Files de thay doi ten

        try{
            Files.move(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            e.printStackTrace();
        }

//        2. Di chuyen file (di chuyen duoc ca ruot)
        File f_2new = new File("E:\\Users\\ploan\\Java\\70\\file\\f0\\File_2xyz.txt");
        try{
            Files.move(f2.toPath(), f_2new.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch(IOException e){
            e.printStackTrace();
        }

//        3. Copy file (khong copy duoc ca ruot)
        File f_0 = new File("E:\\Users\\ploan\\Java\\70\\file\\f0");
        File f_0_copy = new File("E:\\Users\\ploan\\Java\\70\\file\\f0_copy");
        try{
            Files.copy(f_0.toPath(), f_0_copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ViDuFile.copyAll(f_0, f_0_copy);
    }
}