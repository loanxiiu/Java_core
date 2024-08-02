//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyDate md = new MyDate(17, 7, 2024);
        System.out.println(md.getDay());

        md.setDay(16);
        md.setDay(34);
        System.out.println(md.getDay());
    }
}