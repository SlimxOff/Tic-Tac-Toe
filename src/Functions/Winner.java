package Functions;
import static Main.Main.*;
public class Winner {
    public static String WinnerPlayer() {
        if ((pole[0][0] == "X" && pole[1][0] == "X" && pole[2][0] == "X") ||
                (pole[0][0] == "0" && pole[1][0] == "0" && pole[2][0] == "0")) {
            return "1";
        } else if ((pole[0][1] == "X" && pole[1][1] == "X" && pole[2][1] == "X") ||
                (pole[0][1] == "0" && pole[1][1] == "0" && pole[2][1] == "0")){
            return "1";
        } else if ((pole[0][2] == "X" && pole[1][2] == "X" && pole[2][2] == "X")||
                (pole[0][2] == "0" && pole[1][2] == "0" && pole[2][2] == "0")){
            return "1";
        } else if ((pole[0][0] == "X" && pole[0][1] == "X" && pole[0][2] == "X")||
                (pole[0][0] == "0" && pole[0][1] == "0" && pole[0][2] == "0")) {
            return "1";
        } else if ((pole[1][0] == "X" && pole[1][1] == "X" && pole[1][2] == "X")||
                (pole[1][0] == "0" && pole[1][1] == "0" && pole[1][2] == "0")) {
            return "1";
        } else if ((pole[2][0] == "X" && pole[2][1] == "X" && pole[2][2] == "X")||
                (pole[2][0] == "0" && pole[2][1] == "0" && pole[2][2] == "0")) {
            return "1";
        } else if ((pole[0][2] == "X" && pole[1][1] == "X" && pole[2][0] == "X")||
                (pole[0][2] == "0" && pole[1][1] == "0" && pole[2][0] == "0")) {
            return "1";
        } else if ((pole[0][0] == "X" && pole[1][1] == "X" && pole[2][2] == "X")||
                (pole[0][0] == "0" && pole[1][1] == "0" && pole[2][2] == "0")){
            return "1";
        } else {
            return "0";
        }
    }
    public static String WinnerNPC() {
        if (pole[0][0] == "0" && pole[1][0] == "0" && pole[2][0] == "0") {
            return "2";
        } else if (pole[0][1] == "0" && pole[1][1] == "0" && pole[2][1] == "0"){
            return "2";
        } else if (pole[0][2] == "0" && pole[1][2] == "0" && pole[2][2] == "0"){
            return "2";
        } else if (pole[0][0] == "0" && pole[0][1] == "0" && pole[0][2] == "0") {
            return "2";
        } else if (pole[1][0] == "0" && pole[1][1] == "0" && pole[1][2] == "0") {
            return "2";
        } else if (pole[2][0] == "0" && pole[2][1] == "0" && pole[2][2] == "0") {
            return "2";
        } else if (pole[0][2] == "0" && pole[1][1] == "0" && pole[2][0] == "0") {
            return "2";
        } else if (pole[0][0] == "0" && pole[1][1] == "0" && pole[2][2] == "0"){
            return "2";
        } else {
            return "0";
        }
    }
}
