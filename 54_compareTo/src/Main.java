import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(100, "Loan", "IT20", 9);
        SinhVien sv2 = new SinhVien(150, "Lan", "IT2", 9.5);
        SinhVien sv3 = new SinhVien(180, "Lam", "IT21", 9.5);

        //System.out.println(sv1.compareTo(sv2));

        SinhVien[] arrSV= {sv1,sv2,sv3};
        Arrays.sort(arrSV); // hieu ro compareTo
        System.out.println(Arrays.toString(arrSV));
        System.out.println(Arrays.binarySearch(arrSV,sv2));
    }
}