//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
        MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
        System.out.println("5+3="+ mfx500.cong(5,3));
        System.out.println("5+3="+ mvn500.cong(5,3));
        System.out.println("5/3="+ mfx500.chia(5,0));

        double[] arr = {1,4,2,3,6,2};
        double[] arr2 = {2,3,5,4,2,3,6};
        SapXepChen sxchen = new SapXepChen();
        SapXepChon sxchon = new SapXepChon();

        sxchen.sapXepGiam(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }

        System.out.println();

        sxchon.sapXepTang(arr2);
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]);
        }

        System.out.println();
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("3+5= "+ pmmt.cong(3,5));
        double[] arr3 = {4,2,3,6,5,2,1};
        pmmt.sapXepGiam(arr3);
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]);
        }
    }
}