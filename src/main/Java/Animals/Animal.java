package Animals;

public class Animal {
    private final String name;
    private final int canRun;
    private final int canSwim;
    private static int numberOfObjects = 0;

    public static void getNumberOfObjects() {
        System.out.println("Created objects : " + numberOfObjects);
    }


    public Animal(String name, int canRun, int canSwim) {
        this.name = name;
        this.canRun = canRun;
        this.canSwim = canSwim;
        numberOfObjects++;

    }

    public void run() {

    }

    public void swim() {

    }



    public String getName() {
        return name;
    }


    public int getCanRun() {
        return canRun;
    }


    public int getCanSwim() {
        return canSwim;
    }


}






