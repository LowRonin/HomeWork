package HomeWorkApp;

public class HomeWorkApp {
    // Задание 6
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    //Задание 1
    public static void printThreeWords(){
        System.out.println("Orange\nBanana\nApple");
    }
    //Задание 2
    public static void checkSumSign(){
        int a,b,x;
        a = 22;
        b = -36;
        x = a + b;
        if (x >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    //Задание 3
    public static void printColor(){
        int value = 68;
        if (value <= 0){
            System.out.println("Красный");
        } else if (value > 0 && value <= 100){
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    //Задание 4
    public static void compareNumbers() {
        int a, b;
        a = 10;
        b = 1;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

}
