package Homework3;

public class Dog extends Animal {

    public Dog(String name, int canRun, int canSwim) {
        super(name, canRun, canSwim);
    }

    @Override
    public void run() {
        System.out.println("Dog " + super.getName() + " able to  run " + super.getCanRun() + " meters.");
    }

    @Override
    public void swim() {
        System.out.println("Dog " + super.getName() + " able to swim " + super.getCanSwim() + " meters.");
    }

}
