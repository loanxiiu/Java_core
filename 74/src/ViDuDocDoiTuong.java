import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ViDuDocDoiTuong {
    public static void main(String[] args) {
        try{
            File file = new File("E:\\Users\\ploan\\Java\\74\\file\\file.txt");
            InputStream is = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(is);

            SinhVien st = (SinhVien) ois.readObject();
            System.out.println(st);
            ois.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
