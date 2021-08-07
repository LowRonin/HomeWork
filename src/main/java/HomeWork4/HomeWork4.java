package HomeWork4;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static char[][] map;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static final char DOT_Q = 'Q';
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }

            aiTurn(DOT_O);
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект 0");
                break;
            }

            aiTurn(DOT_Q);
            printMap();
            if (checkWin(DOT_Q)) {
                System.out.println("Победил Искуственный Интеллект Q");
                break;
            }

            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");

    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            Arrays.fill(map[i], DOT_EMPTY);
            }
        }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void aiTurn(char DOT) {
        int x = -1;
        int y = -1;
        for (int checkY = 0; checkY < SIZE; checkY++) {
            x = -1;
            y = -1;
            int lineX = 0;
            for (int checkX = 0; checkX < SIZE; checkX++) {
                if (map[checkY][checkX] == DOT_EMPTY) {
                    x = checkX;
                    y = checkY;
                }
                if (map[checkY][checkX] != DOT_EMPTY) {
                    lineX++;
                }
                if (lineX >= SIZE - 1 && x != -1) {
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT;
                    return;
                }
            }
        }

        for (int checkX = 0; checkX < SIZE; checkX++) {
            int lineY = 0;
            x = -1;
            y = -1;
            for (int checkY = 0; checkY < SIZE; checkY++) {
                if (map[checkY][checkX] == DOT_EMPTY) {
                    x = checkX;
                    y = checkY;
                }
                if (map[checkY][checkX] != DOT_EMPTY) {
                    lineY++;
                }
                if (lineY >= SIZE - 1 && x != -1) {
                    System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                    map[y][x] = DOT;
                    return;
                }
            }
        }
        int diag = 0;
        x = -1;
        y = -1;
        for (int checkY = 0; checkY < SIZE; checkY++) {
            if (map[checkY][checkY] == DOT_EMPTY) {
                x = checkY;
                y = checkY;
            }
            if (map[checkY][checkY] != DOT_EMPTY) {
                diag++;
            }
            if (diag >= SIZE - 1 && x != -1) {
                System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                map[y][x] = DOT;
                return;
            }
        }

        diag = 0;
        for (int checkX = 0, checkY = SIZE - 1; checkX < SIZE; checkY--, checkX++) {
            x = -1;
            y = -1;
            if (map[checkX][checkY] == DOT_EMPTY) {
                x = checkX;
                y = checkY;
            }
            if (map[checkX][checkY] != DOT_EMPTY) {
                diag++;
            }
            if (diag >= SIZE - 1 && x != -1) {
                System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
                map[y][x] = DOT;
                return;
            }
        }

        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT;
    }

    public static boolean checkWin(char symb) {
        /*if(map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
        if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
        if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
        if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
        if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
        if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
        if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;*/
        for (int checkX = 0; checkX < SIZE; checkX++){
            int lineX = 0;
            int lineY = 0;
            int diag = 0;
            for (int checkY = 0; checkY < SIZE; checkY++ ){

                if (map[checkX][checkY] == symb) {
                    lineX++;
                }
                if (map[checkY][checkX] == symb) {
                    lineY++;
                }
                if (map[checkY][checkY] == symb){
                    diag++;
                }
                if (lineY == SIZE || lineX == SIZE || diag == SIZE) return true;
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

}
