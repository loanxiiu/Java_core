public class Nguoi {
    private String ten;
    private int namSinh;

    public Nguoi(String ten, int namSinh) {
        this.ten = ten;
        this.namSinh = namSinh;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void an(){
        System.out.println("an");
    }
    public void uong(){
        System.out.println("uong");
    }
    public void ngu(){
        System.out.println("ngu");
    }
}
