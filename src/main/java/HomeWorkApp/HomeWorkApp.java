package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        int year = 2100;
        int a = 10;
        int b = -2;
        String x = "Написать " + a + " раз";
        System.out.println(returnBool(a, b));
        returnPosOrNeg(a);
        System.out.println(returnBoolPosOrNeg(b));
        returnStringNumOfTimes(x, a);
        System.out.println(leapYear(year));
    }

//Задание 1
    public static boolean returnBool(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        } else {
            return false;
        }
    }
//Задание 2
    public static void returnPosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательное");
        }

    }
//Задание 3
    public static boolean returnBoolPosOrNeg(int b) {
        if (b >= 0) {
            return false;
        } else {
            return true;
        }
    }
//Задание 4
    public static void returnStringNumOfTimes(String x, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(x);
        }
    }
//Задание 5
    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;

    }
}
