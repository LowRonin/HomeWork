package HomeWork6;
import HomeWork6.Dog;
public class PetsApp {
    private static int run;
    private static int swim;
    public static void main(String[] args) {
        Dog[] dog = new Dog[3];
        dog[0] = new Dog(
                4,
                2,
                "Shepard",
                48
        );
        dog[1] = new Dog(
                4,
                2,
                "Labrador",
                48
        );
        dog[2] = new Dog(
                4,
                2,
                "DvorDog",
                48
        );
        Cat cat = new Cat(4, 2, "DvorCat", 4 );

        swim = (int) (Math.random() * 10);
        run = (int) (Math.random() * 1000);
        for(int i =0; i < dog.length; i++) {
            dog[i].runningDistance(run, Dog.getRunDist());
            dog[i].swimmingDistance(swim, Dog.getSwimDist());
        }

        cat.runningDistance(run, Cat.getRunDist());
        cat.swimmingDistance(swim, Cat.getSwimDist());

        System.out.println("\nКоличество собак = " + Dog.getDogCount());
        System.out.println("Количество кошек = " + Cat.getCatCounter());
        System.out.println("Все животные = " + (Cat.getCatCounter() + Dog.getDogCount()));
    }
}
