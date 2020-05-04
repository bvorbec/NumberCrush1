package yannik.tjark.candycrush.buisnesslogic;

import java.awt.*;

public class ZahlLogic {
    public static Color getColorForNumber(int i){
        switch (i){
            case 0:return Color.BLUE;
            case 1:return Color.GREEN;
            case 2: return Color.BLACK;
            case 3: return Color.LIGHT_GRAY;
            case 4: return Color.RED;
        }
        return null;
    }
}
