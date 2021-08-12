package HomeWork6;
import HomeWork6.Dog;
public class PetsApp {
    private static int run;
    public static int dogCount;
    public static int catCount;
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

        run = (int) (Math.random() * 1000);
        for(int i =0; i < dog.length; i++) {
            dog[i].runningDistance(run);
        }

        cat.runningDistance(run);
        System.out.println("Количество собак = " + dogCount);
        System.out.println("Количество кошек = " + catCount);
        System.out.println("Все животные = " + (dogCount + catCount));
    }

    public static int getDogCount() {
        return dogCount;
    }

    public static void setDogCount(int dogCount) {
        PetsApp.dogCount = dogCount;
    }

    public static int getCatCount() {
        return catCount;
    }

    public static void setCatCount(int catCount) {
        PetsApp.catCount = catCount;
    }
}
