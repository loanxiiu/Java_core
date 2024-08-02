import java.util.Scanner;

public class _17_If_else {
    public static void main(String[] args) {
        // Giai phuong trinh bac 2
        double a, b, c, x1, x2, delta;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a = ");
        a = sc.nextDouble();
        System.out.print("Enter b = ");
        b = sc.nextDouble();
        System.out.print("Enter c = ");
        c = sc.nextDouble();

        delta = Math.pow(b,2) - 4 * a * c;
        if (delta > 0) {
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phuong trinh co hai nghiem phan biet x1 = " + x1 + " va x2 = " + x2);
        }
        else if(delta == 0){
            x1 = x2 = -b/(2*a);
            System.out.println("Phuong trinh co nghiem kep x1 = x2 = "+ x1);
        }
        else {
            System.out.println("Phuong trinh vo nghiem");
        }


//        // gia phuong trinh bac nhat
//        // ax + b = 0
//
//        double a, b, x;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a = ");
//        a = sc.nextDouble();
//        System.out.print("Enter b = ");
//        b = sc.nextDouble();
//
//        if (a == 0) {
//            if (b == 0) {
//                System.out.println("Phuong trinh vo so nghiem");
//            }
//            else {
//                System.out.println("Phuong trinh vo nghiem");
//            }
//        }
//        else {
//            x = -b/a;
//            System.out.println("Phuong trinh co nghiem x = "+ x);
//        }



//        int n;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        n = sc.nextInt();
//        if(n%2==0){
//            System.out.println(n + " la so chan");
//        }
//        else {
//            System.out.println(n + " la so le");
//        }
    }
}
