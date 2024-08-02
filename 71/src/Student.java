public class Student {
    private String maSinhVien, tenSinhVien;
    public Student(String maSinhVien, String tenSinhVien) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
    }
    public String getMaSinhVien() {
        return maSinhVien;
    }
    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }
    public String getTenSinhVien() {
        return tenSinhVien;
    }
    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    @Override
    public String toString() {
        return "SinhVien: " + maSinhVien + ", Ten: " + tenSinhVien;
    }
}
