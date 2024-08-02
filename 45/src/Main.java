//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HangSanXuat h1 = new HangSanXuat("Hang 1", "Viet Nam");
        HangSanXuat h2 = new HangSanXuat("Hang 2", "My");
        HangSanXuat h3 = new HangSanXuat("Hang 3", "Nhat Ban");

        MayBay p1 = new MayBay(h2, "xang");
        PhuongTienDiChuyen p2 = new XeOto(h1, "xang");
        PhuongTienDiChuyen p3 = new XeDap(h3);

        System.out.println("lay hang san xuat");
        System.out.println("p1: "+ p1.layTenHangSanXuat());

        p2.batDau();

        System.out.println("lay van toc: ");
        System.out.println("p1: "+ p1.layVanToc());
        System.out.println("p2: "+ p2.layVanToc());
        System.out.println("p3: "+ p3.layVanToc());

        p1.catCanh();
        p1.haCanh();
    }
}