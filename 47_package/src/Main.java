import code_a.ViDu;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ViDu vd = new ViDu(5,6);
        System.out.println(vd.getA());

        code_b.ViDu vd2 = new code_b.ViDu(1,2,3);
        System.out.println(vd2.getC());
    }
}