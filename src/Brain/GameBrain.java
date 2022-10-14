package Brain;

import java.util.Scanner;
import static Main.Main.*;
import static Brain.Playground.*;
import static Functions.Check.Check;

public class GameBrain {
    public static void ChoseNPCX(boolean turn) {
        double x, y;
        x = Math.random() * 3;
        y = Math.random() * 3;
        while (pole[(int) x][(int) y] == "X" && pole[(int) x][(int) y] == "0") {
            x = Math.random() * 3;
            y = Math.random() * 3;
        }
        pole[(int) x][(int) y] = "0";
        Playground();
    }

    public static void ChoseNPC0(boolean turn) {
        double p, l;
        p = Math.random() * 3;
        l = Math.random() * 3;
        while (pole[(int) p][(int) l] == "X" && pole[(int) p][(int) l] == "0") {
            p = Math.random() * 3;
            l = Math.random() * 3;
        }
        pole[(int) p][(int) l] = "X";
        Playground();
    }

    public static void TurnX(boolean player) {
        Scanner input = new Scanner(System.in);
        int x, y;
        if (player == true) {
            System.out.println("Выберете куда хотите походить.\nВведите строку(1-3)");
            x = Check();
            while (x + 1 > 3 || x + 1 < 1) {
                System.out.println("Число не удовлетворяет условие, введите снова!");
                x = input.nextInt() - 1;
            }
            System.out.println("Выберете куда хотите походить.\nВведите столбец(1-3)");
            y = Check();
            while (y + 1 > 3 || y + 1 < 1) {
                System.out.println("Число не удовлетворяет условие, введите снова!");
                y = input.nextInt() - 1;
            }
            while (pole[x][y] == "0" || pole[x][y] == "X") {
                System.out.println("\nКлетка занята введите другие значения\n");
                System.out.println("Выберете куда хотите походить.\nВведите строку(1-3)");
                x = input.nextInt() - 1;
                System.out.println("Выберете куда хотите походить.\nВведите столбец(1-3)");
                y = input.nextInt() - 1;
            }
            pole[x][y] = "X";
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void TurnO(boolean player) {
        Scanner input = new Scanner(System.in);
        int x, y;
        if (player == true) {
            System.out.println("Выберете куда хотите походить.\nВведите строку(1-3)");
            x = Check();
            while (x + 1 > 3 || x + 1 < 1) {
                System.out.println("Число не удовлетворяет условие, введите снова!");
                x = input.nextInt() - 1;
            }
            System.out.println("Выберете куда хотите походить.\nВведите столбец(1-3)");
            y = Check();
            while (y + 1 > 3 || y + 1 < 1) {
                System.out.println("Число не удовлетворяет условие, введите снова!");
                y = input.nextInt() - 1;
            }
            while (pole[x][y] == "0" || pole[x][y] == "X") {
                System.out.println("\nКлетка занята введите другие значения\n");
                System.out.println("Выберете куда хотите походить.\nВведите строку(1-3)");
                x = input.nextInt() - 1;
                System.out.println("Выберете куда хотите походить.\nВведите столбец(1-3)");
                y = input.nextInt() - 1;
            }
            pole[x][y] = "0";
        }
    }
}
