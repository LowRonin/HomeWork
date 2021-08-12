package HomeWork6;
import HomeWork6.Dog;

import java.util.Random;

public class PetsApp {
    private static int run;

    public static void main(String[] args) {
        Dog dog = new Dog(4, 2, "Shepard", 50);
        Cat cat = new Cat(4, 2, "DvorCat", 4 );


        run = (int) (Math.random() * 1000);
        dog.runningDistance(run);
        cat.runningDistance(run);
    }


}
