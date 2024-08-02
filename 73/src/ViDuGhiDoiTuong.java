import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class ViDuGhiDoiTuong {
    public static void main(String[] args) {
        try{
            File file = new File("E:\\Users\\ploan\\Java\\73\\file\\file.data");
            OutputStream os = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(os);

            SinhVien st = new SinhVien("20223767", "Nguyen Thi Loan", 2004, 10);
            oos.writeObject(st);
            oos.flush();
            oos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
