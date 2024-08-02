public class SinhVien extends Nguoi{
    private String tenTruong;
    private String tenLop;
    public SinhVien(String ten, int namSinh, String tenTruong, String tenLop) {
        super(ten, namSinh);
        this.tenTruong = tenTruong;
        this.tenLop = tenLop;
    }
    public String getTenTruong() {
        return tenTruong;
    }
    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public void lamBaiTap(){
        System.out.println("lam bai tap");
    }
}
