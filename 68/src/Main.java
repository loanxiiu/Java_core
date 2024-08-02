import java.io.File;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon=0;

        System.out.println("Nhap ten file: ");
        String tenFile = sc.nextLine();
        ViduFile vdf = new ViduFile(tenFile);

        do{
            System.out.println("----------------MENU --------------");
            System.out.println("1. Kiem tra file co the thuc thi.\n"+
                    "2. Kiem tra file co the doc.\n"+
                    "3. Kiem tra file co the ghi.\n"+
                    "4. In duong dan.\n"+
                    "5. In ten file.\n"+
                    "6. Kiem tra file la thu muc hay tap tin.\n"+
                    "7. In ra danh sach cac file con.\n"+
                    "8. In ra cay thu muc.\n"+
                    "0. Thoat chuong trinh.");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon){
                case 1:
                    System.out.println("Kiem tra file co the thuc thi: "+ vdf.kiemTraThucThi());
                    break;
                case 2:
                    System.out.println("Kiem tra file co the doc: "+ vdf.kiemTraDoc());
                    break;
                case 3:
                    System.out.println("Kiem tra file co the ghi: "+ vdf.kiemTraGhi());
                    break;
                case 4:
                    vdf.inDuongDan();
                    break;
                case 5:
                    vdf.inTen();
                    break;
                case 6:
                    vdf.kiemTraLaThuMucHoacTapTin();
                    break;
                case 7:
                    vdf.inDanhSachCacFileCon();
                    break;
                case 8:
                    vdf.inCayThuMuc();
                    break;
                default:
                    break;

            }
            sc.nextLine();
        }while(luaChon!=0);
    }
}