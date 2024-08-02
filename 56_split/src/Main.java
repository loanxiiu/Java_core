import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String s = "Loan phai giau";
        String[] a = s.split(" ");
        System.out.println(Arrays.toString(a));

        String s2 = "Loan phai giau. Truoc 22 tuoi";
        String[] b = s2.split("a|o");
        System.out.println(Arrays.toString(b));
    }
}