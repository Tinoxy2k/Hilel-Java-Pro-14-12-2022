package Homework3;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Mellisa", 200, 5);
        Dog dog = new Dog("Ray", 500, 10);
        cat.swim();
        cat.run();
        dog.run();
        dog.swim();
        Animal.getNumberOfObjects();


    }
}
