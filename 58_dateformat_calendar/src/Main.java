import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Ham lay thoi gian hien tai
        long t1 = System.currentTimeMillis();
        for(int i=0; i<100; i++){
            System.out.println("Test");
        }
        long t2 = System.currentTimeMillis();
        System.out.println("t1: " + t1);
        System.out.println("Time: " + (t2-t1) +"mls");

        //TimeUnit
        System.out.println("3000 nam = "+ TimeUnit.DAYS.toSeconds(3000*365)+"s");
        System.out.println("24h = "+ TimeUnit.HOURS.toSeconds(24)+"s");

        // Date
        Date d= new Date(System.currentTimeMillis());
        System.out.println(d);

        // Calendar
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.DATE));
        System.out.println(c.get(Calendar.MONTH)+1);
        System.out.println(c.get(Calendar.YEAR));

        c.add(Calendar.HOUR, 10);
        System.out.println(c.get(Calendar.HOUR));
        System.out.println(c.get(Calendar.DATE));

        // DateFormat
        DateFormat df = new SimpleDateFormat();
        System.out.println(df.format(d));

        df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(d));

    }
}