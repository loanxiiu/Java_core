public class Cat extends Animal{
    public Cat(){
        super("Cat");
    }

    @Override
    public void eat() {
        System.out.println("cat eat fish");
    }

    @Override
    public void makeSound() {
        System.out.println("cat makeSound meow");
    }
}
