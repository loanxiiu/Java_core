//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Nguoi nguoi1 = new Nguoi("Loan", 2024);
        nguoi1.an();

        SinhVien sv = new SinhVien("Loan", 2024, "IT1", "CNDA");
        sv.ngu();
        sv.lamBaiTap();
    }
}