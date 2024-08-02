//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(17,7,2024);
        MyDate m2 = new MyDate(18,7,2024);
        MyDate m3 = new MyDate(17,7,2024);

        System.out.println(m1.getDay() + "/" + m1.getMonth() + "/" + m1.getYear());
        System.out.println(m2);

//        int a=5;
//        int b=6;
//        if(a==b){
//            System.out.println("a==b");
//        }else {
//            System.out.println("a!=b");
//        }

        System.out.println("m1 sosanh m2: "+ m1.equals(m2));
        System.out.println("m1 sosanh m3: "+ m1.equals(m3));

        System.out.println("Hashcode m1: "+ m1.hashCode());
        System.out.println("Hashcode m2: "+ m2.hashCode());
        System.out.println("Hashcode m3: "+ m3.hashCode());
    }
}