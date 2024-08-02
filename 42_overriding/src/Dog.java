public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating bone.");
    }

    @Override
    public void makeSound() {
        System.out.println("Dog makes sound gau gau.");
    }
}
