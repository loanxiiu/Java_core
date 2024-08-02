import java.util.Scanner;

public class _19_Switch_case {
    public static void main(String[] args) {
        while(true){
            int month, year;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter month: ");
            month = sc.nextInt();
            System.out.println("Enter year: ");
            year = sc.nextInt();

            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("January has 31 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("November has 30 days");
                    break;
                case 2:
                    if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                        System.out.println("January has 29 days");
                    }
                    else {
                        System.out.println("February has 28 days");
                    }
                    break;
                default:
                    System.out.println("Invalid month");
            }
        }



//        while (true){
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter n numer 2-8: ");
//            int n = sc.nextInt();
//
//            switch (n){
//                case 2:
//                    System.out.println("Thu 2");
//                    break;
//                case 3:
//                    System.out.println("Thu 3");
//                    break;
//                case 4:
//                    System.out.println("Thu 4");
//                    break;
//                case 5:
//                    System.out.println("Thu 5");
//                    break;
//                case 6:
//                    System.out.println("Thu 6");
//                    break;
//                case 7:
//                    System.out.println("Thu 7");
//                    break;
//                case 8:
//                    System.out.println("Chu nhat");
//                    break;
//                default:
//                    System.out.println("Enter data Fale");
//            }
//        }
    }
}
