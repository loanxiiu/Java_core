public class MayBay extends PhuongTienDiChuyen{
    private String tenLoaiNhienLieu;
    public MayBay(HangSanXuat hangSanXuat, String tenLoaiNhienLieu){
        super("MayBay", hangSanXuat);
        this.tenLoaiNhienLieu = tenLoaiNhienLieu;
    }
    public String getTenLoaiNhienLieu(){
        return tenLoaiNhienLieu;
    }
    public void setTenLoaiNhienLieu(String tenLoaiNhienLieu){
        this.tenLoaiNhienLieu = tenLoaiNhienLieu;
    }

    public void catCanh(){
        System.out.println("Cat Canh...");
    }
    public void haCanh(){
        System.out.println("Ha Canh...");
    }

    @Override
    public double layVanToc() {
        return 500;
    }
}
