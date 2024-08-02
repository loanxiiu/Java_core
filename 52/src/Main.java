// Phương thức chuyển đổi lớp String

public class Main {
    public static void main(String[] args) {
        String s1 = "Loan phải giàu";
        String s2 = ", Trước 24 tuổi";

        String s3 = s1 + s2;

        // concat => nối chuỗi
        String s4 = s1.concat(s2);
        System.out.println("s3= "+ s3);
        System.out.println("s4= "+ s4);

        // Replace => thay thế
        String s5 = "Loan phải giàu, Trước 24 tuổi";
        String s6 = s5.replaceAll("24", "22");
        System.out.println("s6= "+ s6);

        // toLowerCase() => viết thường
        // toUpperCase() => viết hoa
        String s7 = s3.toLowerCase();
        String s8 = s3.toUpperCase();
        System.out.println("s7= "+ s7);
        System.out.println("s8= "+ s8);

        // trim() => xóa khoảng trắng dư thừa ở đầu cuối chuỗi
        String s9 = " Loan phải giàu ";
        String s10 = s9.trim();
        System.out.println("s10= "+ s10);

        // subString => cắt chuỗi con
        String s11 = "Loan phải giàu";
        String s12 = s11.substring(10,14);
        System.out.println("s12= "+ s12);
    }
}