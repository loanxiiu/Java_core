//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ThoiKhoaBieu tkb2 = new ThoiKhoaBieu(Day.Monday, "Java");
        ThoiKhoaBieu tkb3 = new ThoiKhoaBieu(Day.Tuesday, "MySQL");
        ThoiKhoaBieu tkb4 = new ThoiKhoaBieu(Day.Wednesday, "Oracle");
        ThoiKhoaBieu tkb5 = new ThoiKhoaBieu(Day.Thursday, "Javascript");
        ThoiKhoaBieu tkb6 = new ThoiKhoaBieu(Day.Saturday, "Spring boot");
        ThoiKhoaBieu tkb7 = new ThoiKhoaBieu(Day.Friday, "Git");
        ThoiKhoaBieu tkbCn = new ThoiKhoaBieu(Day.Sunday, "CTDL&GT");

        System.out.println(tkb2);

        int x = Thang.Thang1.getSoNgay();
        System.out.println(x);
    }
}