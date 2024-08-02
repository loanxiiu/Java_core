//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        NguoiVietNam nvn = new NguoiVietNam("Loan", 2004);
        NguoiMy nm = new NguoiMy("Michal", 2003);
        NguoiBaLan nbl = new NguoiBaLan("BaLan", 2004);

        nvn.xinChao();
        nm.xinChao();
        nbl.xinChao();
    }
}