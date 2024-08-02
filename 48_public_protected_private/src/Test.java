import code.Info;
public class Test{
    private Info info;
    public void method(){
        // this.info.a => khong truy cap duoc
        // this.info.b =>khong truy cap duoc
        // this.info.c => khong truy cap duoc
        this.info.d =4;
    }
}
