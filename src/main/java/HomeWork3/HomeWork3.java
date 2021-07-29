package HomeWork3;

import javax.swing.*;
import java.util.Arrays;

public class HomeWork3 {
    public static void main(String args[]) {
        /**
         * Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         * С помощью цикла и условия заменить 0 на 1, 1 на 0;
         */
        int[] arr1 = {1, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1};
        for (int i = 0; i < arr1.length; i++) {
            switch (arr1[i]) {
                case 0: {
                    System.out.printf(1 + " ");
                    break;
                }
                case 1: {
                    System.out.printf(0 + " ");
                    break;
                }
            }
        }
        System.out.println();
        /** Задание 2
         * Задать пустой целочисленный массив длиной 100.
         * С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
         */
        int[] arr2 = new int[100];
        int a = 0;
        while (a <= 99) {
            arr2[a] = a + 1; //Почему, если я тут поменяю на a++ в массиве получается билеберда,
                             //а если я пишу a+1 то все нормально?
            a++;
        }
        System.out.printf(Arrays.toString(arr2));
        System.out.println();
        /** Задание 3
         * Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
         * пройти по нему циклом, и числа меньшие 6 умножить на 2;
         */
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.print(Arrays.toString(arr3));
        System.out.println();
        System.out.println();
        /** Задание 4
         * Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
         * если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу:
         * индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         */
        int arr4[][] = new int[10][10];
        for (int y1 = 0; y1 < 10; y1++) {
            for (int x1 = 0, x2 = 9; x1 < 10; x1++, x2--) {
                if (arr4[y1] == arr4[x1]) {
                    arr4[y1][x1] = 1;
                    arr4[y1][x2] = 1;
                }
            }
            System.out.printf(Arrays.toString(arr4[y1]));
            System.out.println();
        }
        System.out.println("\n" + Arrays.toString(createArrayAndFill(10, 10)));// Задание 5

        System.out.println(findMaxMin());// Задание 6

        int[] arr7 = {2, 2, 2, 1, 2, 2, 12, 8, 4, 10, 1};//Задание 7
        System.out.println(Arrays.toString(sumLeftRight(arr7)));

        int[] arr8 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};//Задание 8
        int shift = 7;
        System.out.println(Arrays.toString(shiftLeftOrRight(arr8, shift)));
    }
    /** Задание 5
     * Написать метод, принимающий на вход два аргумента: len и initialValue,
     * и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
     */
    public static int[] createArrayAndFill(int len, int initialValue) {
       int[] arr5 = new int[len];
       Arrays.fill(arr5, initialValue);
        return arr5;
    }
    /** Задание 6
     * Задать одномерный массив и найти в нем минимальный и максимальный элементы
     */
     public static String findMaxMin (){
         int[] arr6 = {1, 23, 2, 94, 2, 0, -20, 65, -34};
         Arrays.sort(arr6);
         return ("Максимальное число = " + arr6[0] + "\n" + "Минимальное число = " + arr6[arr6.length - 1]);
   /*     Первый вариант)))
    int min = arr6[0];
                 int max = arr6[0];
                 for (int i = 0; i < arr6.length; i++){
                     if (arr6[i] > max){
                         max = arr6[i];
                     } else if (arr6[i] < min){
                         min = arr6[i];*/
    }
    /** Задание 7
     * ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true,
     * если в массиве есть место, в котором сумма левой и правой части массива равны.
     * Примеры:
     * checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
     * checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
     * @return
     */
    public static int[] sumLeftRight(int[] arr7) {

        int x = 0;//Сумма справа
        int y = 0;//Сумма слева
        int i = 0;
        int j = arr7.length - 1;
        while (j - i != -1) {
            if (y > x) {//Складываем правые числа
                x = arr7[j] + x;
                j--;
            }else if(x >= y){//Складываем левые
                y = arr7[i] + y;
                i++;
            }
        }
        if (x == y) {
            return arr7;
        }
        return null;

    }
    /**
     * Задание 8
     * *** Написать метод, которому на вход подается одномерный массив и число n
     * (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
     * Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
     * Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
     * [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
     * При каком n в какую сторону сдвиг можете выбирать сами.
     *
     * @param arr8
     * @param shift
     * @return
     */
    public static int[] shiftLeftOrRight(int[] arr8, int shift) {
        if (shift != arr8.length && shift != -arr8.length && shift != 0) {
            if (shift >= 0) {
                for (int i = 0; i < shift; i++) {
                    int y = arr8[0];
                    for (int j = 0; j < arr8.length; j++) {
                        if (j < arr8.length - 1) {
                            arr8[j] = arr8[j + 1];
                        } else {
                            arr8[arr8.length - 1] = y;
                        }
                    }
                }
            } else {
                for (int i = 0; i > shift; i--) {
                    int y = arr8[arr8.length - 1];
                    for (int j = arr8.length - 1; j >= 0; j--) {
                        if (j > 0) {
                            arr8[j] = arr8[j - 1];
                        } else {
                            arr8[0] = y;
                        }
                    }
                }
            }
        }
        return arr8;
    }
}