package HomeWorkApp;

public class HomeWorkApp {
    public static void main(String[] args) {
        int year = 2100;
        int a = 10;
        int b = -2;
        String x = "Написать " + a + " раз";
        System.out.println(returnBool(a, b));//1
        returnPosOrNeg(a);//2
        System.out.println(returnBoolPosOrNeg(b));//3
        returnStringNumOfTimes(x, a);//4
        System.out.println(leapYear(year));//5
    }

    /**Задание 1
     *Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * @param a
     * @param b
     * @return
     */
    public static boolean returnBool(int a, int b) {
        if (a + b > 10 && a + b < 20) {
            return true;
        } else {
            return false;
        }
    }

    /**Задание 2
     *Написать метод, принимающий на вход два целых числа и проверяющий,
     *  что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     * @param a
     */
    public static void returnPosOrNeg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");

        } else {
            System.out.println("Число отрицательное");
        }

    }

    /**Задание 3
     *Написать метод, которому в качестве параметра передается целое число.
     *  Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     * @param b
     * @return
     */
    public static boolean returnBoolPosOrNeg(int b) {
        if (b >= 0) {
            return false;
        } else {
            return true;
        }
    }

    /**Задание 4
     *Написать метод, которому в качестве аргументов передается строка и число,
     *  метод должен отпечатать в консоль указанную строку, указанное количество раз;
     * @param x
     * @param a
     */
    public static void returnStringNumOfTimes(String x, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(x);
        }
    }

    /**Задание 5
     * Написать метод, который определяет, является ли год високосным, и возвращает boolean
     *  (високосный - true, не високосный - false). Каждый 4-й год является високосным,
     *  кроме каждого 100-го, при этом каждый 400-й – високосный.
     * @param year
     * @return
     */
    public static boolean leapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else return false;

    }
}