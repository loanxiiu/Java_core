public class Bird extends Animal{
    public Bird(){
        super("Bird");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating fruit");
    }

    @Override
    public void makeSound() {
        System.out.println("Bird makes sound chiep");
    }
}
