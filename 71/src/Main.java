import java.io.FileWriter;
import java.io.PrintWriter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        PrintWriter pw = new PrintWriter(System.out);
//        pw.println("Loan phai giau");
//        pw.flush();

        try{
            PrintWriter pw = new PrintWriter("E:\\Users\\ploan\\Java\\71\\file\\file.txt", "UTF-8");
            pw.println("Loan phải giàu");
            pw.println(' ');
            pw.println();
            pw.println(3.14);
            Student sv = new Student("20223767", "Loan");
            pw.println(sv);
            pw.flush();
            pw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}