// Phương thức so sánh String

public class Main {
    public static void main(String[] args) {
        String s1 = "Loan phai giau";
        String s2 = "Loan Phai Giau";
        String s3 = "Loan phai giau";

        // Hàm equals => so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
        System.out.println("s1 equals s2: "+ s1.equals(s2));
        System.out.println("s1 equals s3: "+ s1.equals(s3));

        // equalsIgnoreCase() => so sánh 2 chuỗi giống nhau, không phân biệt hoa thường
        System.out.println("s1 equalsIgnoreCase s2: "+ s1.equalsIgnoreCase(s2));
        System.out.println("s1 equalsIgnoreCase s3: "+ s1.equalsIgnoreCase(s3));

        // compareTo() => so sánh > < =
        String sv1 = "Nguyễn Thị Loan";
        String sv2 = "Nguyễn Duy khang";
        String sv3 = "Nguyễn Duy";
        String sv4 = "Nguyễn Thị Loan";

        System.out.println("sv1 compareTo sv2: "+ sv1.compareTo(sv2));
        System.out.println("sv2 compareTo sv3: "+ sv2.compareTo(sv3));
        System.out.println("sv1 compareTo sv4: "+ sv1.compareTo(sv4));

        // compareToIgnoreCase => Tương tự compareTo, không phân biệt hoa thường

        // regionMatches => so sánh một đoạn
        String r1 = "Loan phải giàu";
        String r2 = "Loan giàu";
        boolean check = r1.regionMatches(10, r2, 5,4);
        System.out.println("r1 regionMatches: "+ check);

        // startsWith => Hàm kiểm tra chuỗi bắt đầu bằng...
        String sdt = "0394812333";
        System.out.println(sdt.startsWith("0394"));
        System.out.println(sdt.startsWith("0348"));

        // endsWith() => kiểm tra chuỗi kết thúc bằng
        String tenFile1 = "Loan phai giau.JPG";
        String tenFile2 = "Loan Phai Giau.PDF";

        if(tenFile1.endsWith(".JPG")){
            System.out.println("File 1 là hình ảnh!");
        }
        else if(tenFile1.endsWith(".PDF")){
            System.out.println("File 1 là file PDF!");
        }

        if(tenFile2.endsWith(".JPG")){
            System.out.println("File 2 là hình ảnh!");
        }
        else if(tenFile2.endsWith(".PDF")){
            System.out.println("File 2 là file PDF!");
        }
    }
}