package Main;
import static Functions.FillField.Fill;
import static Functions.Winner.*;
import static Brain.GameBrain.*;
import static Brain.Playground.*;
import java.util.Scanner;
public class Main {
    public static String[][] pole = new String[3][3];

    public static void main(String[] args) {
        int chose;
        boolean turn;
        turn = true; //Player
        Fill();
        Scanner input = new Scanner(System.in);
        System.out.println("Выберете игрока: \n1.Крестик\n2.Нолик\n");
        chose = input.nextInt();
        System.out.println(Start(turn, chose,WinnerPlayer()));

    }
    public static String Start(boolean turn, int chose,String winner) {
        String x;
        x = winner;
        while (x == "0") {
            if(chose==1){x = GameX(turn, chose);
                turn=!turn;}
            else {
                x = Game0(turn, chose);
                turn=!turn;
            }
        }
        Playground();
        if(x=="2"){
            return "NPC win!";
        }
        else {
            return "Player win!";
        }
    }

    public static String GameX(boolean turn, int chose) {
        if (turn == true && chose==1) {
            TurnX(turn);
            return WinnerPlayer();
        } else {
            ChoseNPCX(turn);
            return WinnerNPC();

    }}
    public static String Game0(boolean turn, int chose) {
        if (turn == true && chose==2) {
            TurnO(turn);
            return WinnerPlayer();
        } else {
            ChoseNPC0(turn);
            return WinnerNPC();

    }}


}
