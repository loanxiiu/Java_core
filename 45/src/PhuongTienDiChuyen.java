public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;
    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
        this.hangSanXuat = hangSanXuat;
    }
    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }
    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }
    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }
    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String layTenHangSanXuat() {
        return this.hangSanXuat.getTenHangSanXuat();
    }
    public void batDau(){
        System.out.println("batDau...");
    }
    public void tangToc(){
        System.out.println("tangToc...");
    }
    public void dungLai(){
        System.out.println("dungLai...");
    }
    public abstract double layVanToc();
}
