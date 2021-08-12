package HomeWork6;

public class Cat extends Pets {

private double swimDist;
private double runDist;

    public Cat(int paws, int ears, String species, double weight) {
        super(paws, ears, species, weight);
        swimDist = 0;
        runDist = 200;
        PetsApp.setCatCount(PetsApp.getCatCount() + 1);
    }

    @Override
    public void runningDistance(int run){
        if (run < runDist) {
            System.out.println(species + " ran - " + run + "m");
        }else System.out.println(species + " died at " + runDist + " meters, there were" + (run - runDist) + "meters left");
    }
    @Override
    public void swimmingDistance(int swim){
        if (swim < swimDist) {
            System.out.println(species + " swam - " + swim + "m");
        }else System.out.println(species + " died at " + swimDist + " meters, there were " + (swim - swimDist) + " meters left");
    }
}
