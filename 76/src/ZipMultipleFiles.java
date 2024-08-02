import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipMultipleFiles{
    public static void main(String[] args){
        try {
            List<String> srcFiles = Arrays.asList("E:\\Users\\ploan\\Java\\76\\file\\file.txt", "E:\\Users\\ploan\\Java\\76\\file\\file.data");
            FileOutputStream fos = new FileOutputStream("E:\\Users\\ploan\\Java\\76\\file\\file.zip");
            ZipOutputStream zipOut = new ZipOutputStream(fos);

            for(String srcFile : srcFiles){
                File fileToZip = new File(srcFile);
                FileInputStream fis = new FileInputStream(fileToZip);
                ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
                zipOut.putNextEntry(zipEntry);

                byte[] bytes = new byte[1024];
                int length;
                while ((length = fis.read(bytes)) >= 0){
                    zipOut.write(bytes, 0, length);
                }
                fis.close();
            }
            zipOut.close();
            fos.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
