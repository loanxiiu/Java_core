package model;

public class MiniCalculatorModel {
    private double firstValue;
    private double secondValue;
    private double answer;

    public MiniCalculatorModel() {

    }

    public double getFirstValue() {
        return firstValue;
    }
    public void setFirstValue(double firstValue) {
        this.firstValue = firstValue;
    }
    public double getSecondValue() {
        return secondValue;
    }
    public void setSecondValue(double secondValue) {
        this.secondValue = secondValue;
    }
    public double getAnswer() {
        return answer;
    }
    public void setAnswer(double answer) {
        this.answer = answer;
    }

    public void Plus(){
        this.answer = this.firstValue + this.secondValue;
    }
    public void Minus(){
        this.answer = this.firstValue - this.secondValue;
    }
    public void Mutiply(){
        this.answer = this.firstValue * this.secondValue;
    }
    public void Divide(){
        this.answer = this.firstValue / this.secondValue;
    }
    public void Pow(){
        this.answer = Math.pow(this.firstValue, this.secondValue);
    }
    public void Mod(){
        this.answer = this.firstValue % this.secondValue;
    }
}
