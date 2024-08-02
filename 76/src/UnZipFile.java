import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnZipFile {
    public static File newFile(File destinationDir, ZipEntry zipEntry) throws IOException {
        File destinationFile = new File(destinationDir, zipEntry.getName());

        String destDirPath = destinationDir.getCanonicalPath();
        String destFilePath = destinationFile.getCanonicalPath();

        if(!destFilePath.startsWith(destDirPath+ File.separator)){
            throw new IOException("Entry is outside of the target dir: " + zipEntry.getName());
        }
        return destinationFile;
    }

    public static void main(String[] args) throws IOException {
        try{
            String fileZip = "E:\\Users\\ploan\\Java\\76\\file2.zip";
            File destinationDir = new File("E:\\Users\\ploan\\Java\\76\\unzipfile");
            byte[] buffer = new byte[1024];
            ZipInputStream zis = new ZipInputStream(new FileInputStream(fileZip));
            ZipEntry zipEntry = zis.getNextEntry();
            while(zipEntry != null){
                File newFile = newFile(destinationDir, zipEntry);
                if(zipEntry.isDirectory()){
                    if(!newFile.isDirectory() && !newFile.mkdirs()){
                        throw new IOException("Failed to create directory: " + newFile.getAbsolutePath());
                    }
                }
                else {
                    // fix for windows-created archives
                    File parent = newFile.getParentFile();
                    if(!parent.isDirectory() && !parent.mkdirs()){
                        throw new IOException("Failed to create directory: " + parent.getAbsolutePath());
                    }

                    // write file content
                    FileOutputStream fos = new FileOutputStream(newFile);
                    int len;
                    while ((len = zis.read(buffer)) > 0) {
                        fos.write(buffer, 0, len);
                    }
                    fos.close();
                }
                zipEntry = zis.getNextEntry();
            }
            zis.closeEntry();
            zis.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
