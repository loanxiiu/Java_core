//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(17,7,2024);
        MyDate m2 = new MyDate(18,7,2024);
        MyDate m3 = new MyDate(19,7,2024);

        System.out.println(m1.getDay() + "/" + m1.getMonth() + "/" + m1.getYear());
        System.out.println(m2);
    }
}