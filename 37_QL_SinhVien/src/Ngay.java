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

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        Ngay other = (Ngay) obj;
        if(ngay != other.ngay)
            return false;
        if(thang != other.thang)
            return false;
        if(nam != other.nam)
            return false;
        return true;
    }
}
