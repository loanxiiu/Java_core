public class Ngay {
    private int ngay, thang, nam;
    public Ngay(int ngay, int thang, int nam) {
        this.ngay = ngay;
        this.thang = thang;
        this.nam = nam;
    }
    public int getNgay() {
        return ngay;
    }
    public void setNgay(int ngay) {
        if(1<=ngay && ngay<=31){
            this.ngay = ngay;
        }
    }
    public int getThang() {
        return thang;
    }
    public void setThang(int thang) {
        if(1<=thang && thang<=12){
            this.thang = thang;
        }
    }
    public int getNam() {
        return nam;
    }
    public void setNam(int nam) {
        if(nam>0){
            this.nam = nam;
        }
    }
}
