import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Cach 1
//        File f = new File("E:\\Users\\ploan\\Java\\72\\file\\file.txt");
//        try{
//            BufferedReader br = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
//            String line = null;
//            while(true){
//                line = br.readLine();
//                if(line == null){
//                    break;
//                }
//                else{
//                    System.out.println(line);
//                }
//            }
//        }
//        catch(IOException e){
//            e.printStackTrace();
//        }


        // Cach2
        File f2 = new File("E:\\Users\\ploan\\Java\\72\\file\\file.txt");
        try{
            List<String> allText = Files.readAllLines(f2.toPath(), StandardCharsets.UTF_8);
            for (String line : allText) {
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}