//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.makeSound();
        dog.sleep();

        Cat cat = new Cat();
        cat.eat();
        cat.makeSound();
        cat.sleep();

        Bird bird = new Bird();
        bird.eat();
        bird.makeSound();
        bird.sleep();
    }
}