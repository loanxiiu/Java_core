public class _30_Constructor {
    private int day;
    private int month;
    private int year;

    public _30_Constructor(int day, int month, int year) {
        this.day = day;
        this.month= month;
        this.year = year;
    }

    public void printDay(){
        System.out.println("Day: " + this.day);
    }
    public void printMonth(){
        System.out.println("Month: " + this.month);
    }
    public void printYear(){
        System.out.println("Year: " + this.year);
    }
    public void printDate(){
        System.out.println("Date: " + this.day + "-" + this.month + "-" + this.year);
    }

    public static void main(String[] args){
        _30_Constructor obj = new _30_Constructor(17, 7, 2024);
        obj.printDay();
        obj.printMonth();
        obj.printYear();
        obj.printDate();
    }
}
