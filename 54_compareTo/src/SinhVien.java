public class SinhVien implements Comparable<SinhVien> {

    private int maSinhvien;
    private String hoVaTen;
    private String tenLop;
    private double diemTrungBinh;

    public SinhVien(int maSinhvien, String hoVaTen, String tenLop, double diemTrungBinh) {
        this.maSinhvien = maSinhvien;
        this.hoVaTen = hoVaTen;
        this.tenLop = tenLop;
        this.diemTrungBinh = diemTrungBinh;
    }

    public int getMaSinhvien() {
        return maSinhvien;
    }
    public void setMaSinhvien(int maSinhvien) {
        this.maSinhvien = maSinhvien;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public String getTenLop() {
        return tenLop;
    }
    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }
    public double getDiemTrungBinh() {
        return diemTrungBinh;
    }
    public void setDiemTrungBinh(double diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getTen(){
        String s = this.hoVaTen.trim();
        if(s.indexOf(" ")>=0) {
            int vt = s.lastIndexOf(" ");
            return s.substring(vt+1);
        }
        else {
            return s;
        }
    }

    @Override
    public String toString() {
        return "SinhVien [maSinhvien=" + maSinhvien + ", hoVaTen=" + hoVaTen + ", tenLop=" + tenLop + ", diemTrungBinh=" + diemTrungBinh + "]";
    }

    @Override
    public int compareTo(SinhVien o) {
        // <0
        // =0
        // >0
        // Dua tren so sanh ten
        // Ten: Adam, Obama

         return this.maSinhvien - o.maSinhvien;

//        String tenThis = this.getTen();
//        String tenO = o.getTen();
//        return tenThis.compareTo(tenO);

//        if (this.diemTrungBinh > o.diemTrungBinh) {
//            return 1;
//        } else if (this.diemTrungBinh < o.diemTrungBinh) {
//            return -1;
//        } else {
//            // If average scores are the same, compare based on name
//            return 0;
//        }
    }
}
