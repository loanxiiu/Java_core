// Phương thức kiểm tra
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi:");
        String s = sc.nextLine();
        System.out.println("--------------");

        // Hàm Length
        System.out.println("Độ dài chuỗi "+ s.length());

        // charAt()
        for(int i = 0 ; i < s.length() ; i++){
            System.out.println("Vị trí "+ i + " là "+ s.charAt(i));
        }

        // getChars(Vị trí bắt đầu, vị trí kết thúc, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng)
        char[] arrChar = new char[100];
        s.getChars(2, 4, arrChar, 0);
        for(int i = 0 ; i < arrChar.length ; i++){
            System.out.print(arrChar[i]);
        }
        System.out.println();

        byte[] arrBytes = s.getBytes();
        for(byte b: arrBytes){
            System.out.print(b);
        }
    }
}