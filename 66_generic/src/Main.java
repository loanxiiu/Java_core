//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Box box = new Box(15);
        System.out.println("Gia tri: "+ box.getValue());

        Box_generic box2 = new Box_generic(15.5);
        System.out.println("Gia tri: "+ box2.getValue());

        Box_generic box3 = new Box_generic("Muoi lam");
        System.out.println("Gia tri: "+ box3.getValue());

    }
}