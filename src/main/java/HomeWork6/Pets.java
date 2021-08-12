package HomeWork6;

public abstract class Pets {
    protected int paws;
    protected int ears;
    protected String species;
    protected double weight;

    public Pets(int paws, int ears, String species, double weight) {
        this.paws = paws;
        this.ears = ears;
        this.species = species;
        this.weight = weight;
    }

    public void runningDistance(int run, int runDist){
        if (run < runDist) {
            System.out.println(species + " ran - " + run + "m\n");
        }else System.out.println(species + " died at " + runDist + " meters, there were " + (run - runDist) + " meters left\n");
    }

    public void swimmingDistance(int swim, int swimDist){
        if (swim < swimDist) {
            System.out.println(species + " swam - " + swim + "m\n");
        }else System.out.println(species + " died at " + swimDist + " meters, there were " + (swim - swimDist) + " meters left.\n" + "Because cats can't swim\n");
    }
}
