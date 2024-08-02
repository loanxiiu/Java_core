import java.io.File;

public class ViduXoaFile {
    public static void xoaFile(File fx){
        if(fx.isFile()){
            // xoa neu la tap tin
            fx.delete();
            System.out.println("Da xoa: "+ fx.getAbsolutePath());
        }
        else if(fx.isDirectory()){
            // lay cac file con
            File[] mangCon = fx.listFiles();
            for(File f : mangCon){
                // xoa cac file con
                xoaFile(f);
            }
            // xoa ban than thu muc sau khi xoa cac file con
            fx.delete();
            System.out.println("Da xoa: "+ fx.getAbsolutePath());
        }
    }

    public static void xoaFile2(File fx){
        // Su dung class Files.delete...
    }
}
