package model;

public class MouseExampleModel {
    private int x, y;
    private int count;
    private String checkIn; // yes, no
    public MouseExampleModel(){
        this.x = 0;
        this.y = 0;
        this.count = 0;
        this.checkIn = "no";
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public void setCount(int count){
        this.count = count;
    }
    public void setCheckIn(String checkIn){
        this.checkIn = checkIn;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getCount(){
        return count;
    }
    public String getCheckIn(){
        return checkIn;
    }

    public void click(){
        this.count++;
    }

    public void entered(){
        this.checkIn ="yes";
    }

    public void exit(){
        this.checkIn ="no";
    }
}
