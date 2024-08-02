//Trong lập trình Java (và các ngôn ngữ lập trình khác), phép toán 1 ngôi (unary operator) là những phép toán chỉ cần một toán hạng để thực hiện. Các phép toán 1 ngôi thông thường bao gồm:
//
//Phép toán tăng/giảm:
//
//        ++: Tăng giá trị của biến lên 1.
//        --: Giảm giá trị của biến đi 1.
//Phép toán dấu âm:
//
//        -: Đảo ngược dấu của giá trị.
//Phép toán phủ định logic:
//
//        !: Đảo ngược giá trị boolean.
//Phép toán bitwise NOT:
//
//        ~: Đảo ngược tất cả các bit của giá trị số nguyên.

public class _12_Unary_Operators {
    public static void main(String[] args) {
        int a = 5;
        boolean b = false;
        System.out.println(" -a => gia tri: "+ (-a));
        System.out.println(" +a => gia tri: "+ (+a));
        System.out.println("  =!b> gia tri: "+ (!b));
        System.out.println("--------------------");
        System.out.println(" a = "+ a);
        System.out.println(" ++a = "+ (++a));
        System.out.println(" a++ = "+ (a++));
        System.out.println(" a = "+ a);
        System.out.println(" --a = "+ (--a));
        System.out.println(" a-- = "+ (a--));
        System.out.println(" a = "+ a);

    }
}
