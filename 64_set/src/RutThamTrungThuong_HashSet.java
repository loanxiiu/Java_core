import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RutThamTrungThuong_HashSet {
    Set<String> thungPhieuDuThuong = new TreeSet<String>();

    public RutThamTrungThuong_HashSet(){

    }

    public boolean themPhieu(String giaTri){
        return this.thungPhieuDuThuong.add(giaTri);
    }

    public boolean xoaPhieu(String giaTri){
        return this.thungPhieuDuThuong.remove(giaTri);
    }

    public boolean kiemTraPhieuTonTai(String giaTri){
        return this.thungPhieuDuThuong.contains(giaTri);
    }

    public void xoaTatCaPhieuDuThuong(){
        this.thungPhieuDuThuong.clear();
    }

    public int laySoLuong(){
        return this.thungPhieuDuThuong.size();
    }

    public String rutMotPhieu(){
        String ketQua="";
        Random rd = new Random();
        int viTri = rd.nextInt(thungPhieuDuThuong.size());
        ketQua =(String) this.thungPhieuDuThuong.toArray()[viTri];
        return ketQua;
    }

    public void inTatCa(){
        System.out.println(Arrays.toString(this.thungPhieuDuThuong.toArray()));
    }

    public static void main(String[] args) {
        RutThamTrungThuong_HashSet rt = new RutThamTrungThuong_HashSet();
        Scanner sc = new Scanner(System.in);
        int luaChon =0;
        do{
            System.out.println("-------- MENU --------");
            System.out.println("1. Them ma so du thuong.\n" +
            "2. Xoa ma so du thuong.\n" +
            "3. Kiem tra so du thuong co ton tai hay khong?\n" +
            "4. Xoa tat ca cac phieu du thuong.\n"+
            "5. So luong phieu du thuong.\n" +
            "6. Rut tham trung thuong.\n"+
            "0. Thoat khoi chuong trinh.\n");
            luaChon = sc.nextInt();
            sc.nextLine();

            if(luaChon==1 || luaChon==2 || luaChon==3){
                System.out.println("Nhap vao ma phieu du thuong: ");
                String giaTri = sc.next();
                if (luaChon == 1) {
                    rt.themPhieu(giaTri);
                }
                else if (luaChon == 2) {
                    rt.xoaPhieu(giaTri);
                }
                else {
                    System.out.println("Ket qua kiem tra: "+ rt.kiemTraPhieuTonTai(giaTri));
                }
            }
            else if(luaChon==4){
                rt.xoaTatCaPhieuDuThuong();
            }
            else if(luaChon==5){
                System.out.println("So luong phieu la: "+ rt.laySoLuong());
            }
            else if(luaChon==6){
                System.out.println("Ma so trung thuong la: "+ rt.rutMotPhieu());
            }
            else if(luaChon==7){
                System.out.println("Cac ma phieu du thuong la: ");
                rt.inTatCa();
            }
        }while (luaChon!=0);
    }
}