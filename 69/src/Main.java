import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File f0 = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67\\Java_67_1\\Java_67_2\\Java_67_3\\f0");
        File f0_1 = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67\\Java_67_1\\Java_67_2\\Java_67_3\\f0_1");
        File f = new File("E:\\Users\\ploan\\Java\\67_file\\Java_67\\Java_67_1\\Java_67_2\\Java_67_3\\ViDu.txt");

//        f0.deleteOnExit();// xoa duoc vi thu muc rong
//        f0_1.deleteOnExit(); // khong xoa duoc vi khong phai thu muc rong
//        f.deleteOnExit();
//        System.out.println(f0.delete()); // khong xoa vi khong ton tai
//        ViduXoaFile.xoaFile(f0_1);


        // Su dung class Files xoa tap tin va thu muc
        Path p0 = f0.toPath();
        Path p0_1 = f0_1.toPath();
        Path p0_2 = f.toPath();

        try{
            //Files.deleteIfExists(p0);
            Files.deleteIfExists(p0_1);
            Files.deleteIfExists(p0_2);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}