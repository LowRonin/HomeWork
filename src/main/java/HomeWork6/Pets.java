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

    protected abstract void runningDistance(int run);
    protected abstract void swimmingDistance(int swim);
}
