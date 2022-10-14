package Functions;

import java.util.Scanner;

public class Check {
    public static Integer Check() {
        String tmp;
        Scanner input = new Scanner(System.in);
        Integer x;
        try {
            tmp = input.next();
            x = Integer.parseInt(tmp) - 1;
            return x;
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели недопустимое значение!");
            return Check();
        }
    }
}