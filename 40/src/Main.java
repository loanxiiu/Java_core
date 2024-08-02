//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Dog d = new Dog();
//        d.eat();
//        d.bark();

        BabyDog babyDog = new BabyDog();
        babyDog.eat();
        babyDog.bark();
        babyDog.weep();
        babyDog.name = "shiba";
        System.out.println(babyDog.name);

        Cat c = new Cat();
        c.eat();
        c.meow();

        Bird b = new Bird();
        b.eat();
        b.fly();
    }
}