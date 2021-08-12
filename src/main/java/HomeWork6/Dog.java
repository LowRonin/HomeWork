package HomeWork6;

public class Dog extends Pets{
    private static int DogCount;
    private static int swimDist = 10;
private static int runDist = 500;

    public Dog(int paws, int ears, String species, double weight) {
        super(paws, ears, species, weight);
        DogCount++;
    }

    protected static int getDogCount() {
        return DogCount;
    }

    public static int getSwimDist() {
        return swimDist;
    }

    public static int getRunDist() {
        return runDist;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "runDist=" + runDist +
                ", paws=" + paws +
                ", ears=" + ears +
                ", species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
