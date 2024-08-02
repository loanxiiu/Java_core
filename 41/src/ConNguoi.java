public class ConNguoi {
    protected String hoVaTen;
    protected int namSinh;
    public ConNguoi(String hoVaTen, int namSinh) {
        this.hoVaTen = hoVaTen;
        this.namSinh = namSinh;
    }
    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
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
    public void ngu(){
        System.out.println("ngu");
    }
    public void lam(){
        System.out.println("lam");
    }
}
