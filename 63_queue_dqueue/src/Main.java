import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Queue<String> danhSachSV = new LinkedList<String>();
        Queue<String> danhSachSV = new PriorityQueue<>();

        danhSachSV.offer("Loan");
        danhSachSV.offer("Tung");
        danhSachSV.offer("Hoan");
        danhSachSV.offer("Danh");

        //peek() lay ra nhung ko xoa
        while(true){
            // lay ra va xoa
            String ten = danhSachSV.poll();
            if(ten==null) break;
            System.out.println(ten);
        }
    }
}