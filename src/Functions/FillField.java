package Functions;
import static Main.Main.*;

public class FillField {
    public static void Fill() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                pole[i][j] = " ";
            }
        }
    }
}
