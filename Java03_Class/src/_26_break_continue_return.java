public class _26_break_continue_return {
    public static void main(String[] args) {
//        int out, in=0;
//        outer : for(out=0; out<10; out++){
//            for(in =0; in<20; in++){
//                if(in>10){
//                    break outer;
//                }
//            }
//            System.out.println("Bên trong vòng lặp out: out = " + out +", in = " + in);
//        }
//        System.out.println("Bên ngoài vòng lặp out: out = " + out + ", in = " + in);

//        int max=100;
//        loop: for(int out=0; out<10; out++){
//            for(int i = 0; i<max; i++){
//                if(i>50){
//                    continue loop;
//                }
//                System.out.println(i);
//            }
//        }

//        outer: for(int i = 2; i <= 9; ++i) {
//            for(int j = 1; j <= 9; ++j) {
//                if(j>5){
//                    continue outer;
//                }
//                System.out.println( i + "*" + j + "=" + i * j);
//            }
//            System.out.println("-----");
//        }

        outer: for(int i = 2; i <= 9; ++i) {
            for(int j = 1; j <= 9; ++j) {
                if(j>5){
                    return;
                }
                System.out.println( i + "*" + j + "=" + i * j);
            }
            System.out.println("-----");
        }
    }
}
