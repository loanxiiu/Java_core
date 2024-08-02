// Phương thức lập chỉ mục với lớp String

public class Main {
    public static void main(String[] args) {
        String s1 = "Loan phải giàu";
        String s2 = "Loan giàu, Loan";
        String s3 = "Loan";
        char c = 'o';

        // Hàm indexOf
        System.out.println(s1.indexOf(s2));
        System.out.println(s2.indexOf(s3));

        // Sử dụng vị trí bắt đầu
        System.out.println("Vị trí của s3 trong s2 là "+ s2.indexOf(s3, 2));

        // Tìm kiếm char
        System.out.println("Vị trí của "+ c +" trong s1 là "+ s1.indexOf(c));
        System.out.println("Vị trí của "+ c +" trong s1 là "+ s1.indexOf(c, 5));

        // lastIndexOf => tìm kiếm từ phải sang trái
        System.out.println("Vị tí của s3 trong s1 "+ s1.lastIndexOf(s3));
    }
}