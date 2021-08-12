package HomeWork6;

public class Cat extends Pets {

private static int swimDist = 0;
private static int runDist = 200;
private static int catCounter;

    public Cat(int paws, int ears, String species, double weight) {
        super(paws, ears, species, weight);
       catCounter++;
    }

    protected static int getCatCounter() {
        return catCounter;
    }

    public static int getSwimDist() {
        return swimDist;
    }

    public static int getRunDist() {
        return runDist;
    }

    @Override
    public void swimmingDistance(int swim, int swimDist) {
        System.out.println("Cats can't swim\n");
    }
}
