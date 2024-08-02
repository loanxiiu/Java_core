import java.io.File;

public class ViduFile {
    File file;
    public ViduFile(String tenFile) {
        file = new File(tenFile);
    }

    public boolean kiemTraThucThi(){
        return this.file.canExecute();
    }

    public boolean kiemTraDoc() {
        return this.file.canRead();
    }

    public boolean kiemTraGhi(){
        return this.file.canWrite();
    }

    public void inDuongDan(){
        System.out.println(this.file.getAbsoluteFile());
    }

    public void inTen(){
        System.out.println(this.file.getName());
    }

    public void kiemTraLaThuMucHoacTapTin(){
        if(this.file.isDirectory()){
            System.out.println("Day la thu muc.");
        }
        if(this.file.isFile()){
            System.out.println("Day la tap tin.");
        }
    }

    public void inDanhSachCacFileCon(){
        if(this.file.isDirectory()){
            System.out.println("Cac tap tin con/ thu muc con la:");
            File[] mangCon = this.file.listFiles();
            for(File f : mangCon){
                System.out.println(f.getAbsolutePath());
            }
        }
        else if(this.file.isFile()){
            System.out.println("Day la tap tin, khong co tap tin con ben trong");
        }
    }

    public void inCayThuMuc(){
        this.inChiTietCayThuMuc(this.file, 1);
    }

    public void inChiTietCayThuMuc(File f, int bac){
        for(int i = 0; i < bac; i++){
            System.out.print("\t");
        }
        System.out.print("|_");
        System.out.println(f.getName());
        if(f.canRead() && f.isDirectory()){
            File[] mangCon = f.listFiles();
            for(File fx : mangCon){
                inChiTietCayThuMuc(fx, bac+1);
            }
        }
    }
}
