package Homework3;

public abstract class Animal {
    String name;
    int canRun;
    int canSwim;
    static int numberOfObjects = 0;

    public String getName() {
        return name;
    }

    public int getCanRun() {
        return canRun;
    }

    public int getCanSwim() {
        return canSwim;
    }

    public Animal(String name, int canRun, int canSwim) {
        this.name = name;
        this.canRun = canRun;
        this.canSwim = canSwim;
        numberOfObjects++;

    }

    public static void getNumberOfObjects() {
        System.out.println("Created objects : " + numberOfObjects);
    }


    public abstract void run();

    public abstract void swim();


}






