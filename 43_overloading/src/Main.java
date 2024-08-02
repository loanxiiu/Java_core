import java.lang.reflect.Array;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyMath myMath = new MyMath();
        System.out.println(myMath.timMin(3,3));
        System.out.println(myMath.timMin(2.5,3));
        System.out.println(myMath.tinhTong(3.5,3));

        double[] a = {1,3,4.5,1};
        System.out.println(myMath.tinhTong(a));
    }
}