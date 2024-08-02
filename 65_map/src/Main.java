import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        TuDien tuDien = new TuDien();
        int luaChon=0;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("----------- MENU ------------");
            System.out.println("Tra tu dien Anh-Viet:\n"+
                    "1. Them tu (Tu khoa, Y nghia).\n"+
                    "2. Xoa tu.\n"+
                    "3. Tim y nghia cua tu khoa => Tra tu.\n"+
                    "4. In ra danh sach tu khoa.\n"+
                    "5. In ra so luong tu.\n"+
                    "6. Xoa tat ca cac tu khoa.\n"+
                    "0. Thoat khoi chuong trinh");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon==1){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                System.out.println("Nhap vao y nghia: ");
                String yNghia = sc.nextLine();
                tuDien.themTu(tuKhoa,yNghia);
            }
            else if(luaChon==2 || luaChon==3){
                System.out.println("Nhap vao tu khoa: ");
                String tuKhoa = sc.nextLine();
                if(luaChon==2){
                    tuDien.xoaTu(tuKhoa);
                }
                else {
                    System.out.println("Y nghia la: "+ tuDien.traTu(tuKhoa));
                }
            } else if (luaChon == 4) {
                tuDien.inTuKhoa();
            }
            else if (luaChon == 5) {
                System.out.println("So luong tu khoa la: "+ tuDien.laySoLuong());
            }
            else if (luaChon == 6) {
                tuDien.xoaTatCa();
            }
        }while(luaChon!=0);
    }
}