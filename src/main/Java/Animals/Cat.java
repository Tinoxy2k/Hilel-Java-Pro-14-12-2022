package Animals;

public class Cat extends Animal {


    public Cat(String name, int canRun, int canSwim) {
        super(name, canRun, canSwim);
    }
@Override
    public void run() {
        System.out.println("Cat " + super.getName() + " able to run " + super.getCanRun() + " meters.");
    }
@Override
    public void swim() {
        System.out.println( "Cat " + super.getName() + " able to swim " + super.getCanSwim() + " meters.");
    }
}
