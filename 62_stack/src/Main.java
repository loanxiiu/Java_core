import java.util.Scanner;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();

//        stack.push(sc.nextLine()); // Đưa giá trị vào stack
//        stack.pop(); // Lấy giá trị ra xóa khỏi stack
//        stack.peek(); // Lấy giá trị ra nhưng không xóa khỏi stack
//        stack.clear(); // xóa tất cả phần tử trong stack
//        stack.contains(sc.nextLine()); // xác định giá trị có tồn tại trong stack hay không

        // Ví dụ đảo ngược chuỗi
//        System.out.println("Nhập vào chuỗi: ");
//        String s = sc.nextLine();
//        for(int i=0; i<s.length(); i++){
//            stack.push(s.charAt(i)+"");
//        }
//        System.out.println("Chuỗi đảo ngược: ");
//        for(int i=0; i<s.length(); i++){
//            System.out.print(stack.pop());
//        }

        // Vi du chuen tu he thap phan sang he nhi phan
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("Nhap 1 so nguyen duong tu ban phim");
        int x = sc.nextInt();
        while(x>0){
            int soDu = x%2;
            stackSoDu.push(soDu+"");
            x = x/2;
        }
        int n = stackSoDu.size();
        for(int i=0; i<n; i++){
            System.out.print(stackSoDu.pop());
        }
    }
}