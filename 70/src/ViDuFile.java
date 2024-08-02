import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class ViDuFile {
    public static void copyAll(File f1, File f2) {
        try{
            // copy ban than no
            Files.copy(f1.toPath(), f2.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }catch (IOException e){
            e.printStackTrace();
        }
        if(f1.isDirectory()){
            // copy cac tap tin va thu muc con
            File[] mangCon = f1.listFiles();
            for(File f : mangCon){
                File file_new = new File(f2.getAbsolutePath()+"\\"+f.getName());
                copyAll(f, file_new);
            }
        }
    }
}
