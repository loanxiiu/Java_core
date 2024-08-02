import java.util.ArrayDeque;
import java.util.Deque;

public class VD_Deque {
    public static void main(String[] args) {
        Deque<String> danhSachSV = new ArrayDeque<String>();

        danhSachSV.offer("Loan");
        danhSachSV.offerFirst("Tung");
        danhSachSV.offerLast("Dan");
        danhSachSV.offer("Anh");
        danhSachSV.offerFirst("Tung2");

        while(true){
            String ten = danhSachSV.poll();
            if(ten==null){
                break;
            }
            System.out.println(ten);
        }
    }
}
