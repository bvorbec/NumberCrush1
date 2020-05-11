package yannik.tjark.candycrush.buisnesslogic;

import java.awt.*;
import java.util.Random;

import com.sun.tools.javac.util.Pair;
import java.util.ArrayList;
import yannik.tjark.candycrush.model.Spielfeld;
import yannik.tjark.candycrush.model.Zahl;
import static yannik.tjark.candycrush.buisnesslogic.ZahlLogic.getColorForNumber;

public class SpielfeldLogic {

    private SpielfeldLogic() {
    }

    public static Spielfeld generateNewFeld(int hoehe, int breite) {
        Spielfeld spielfeld = new Spielfeld(breite, hoehe);
        for (int x = 0; x < breite; x++) {
            for (int y = 0; y < hoehe; y++) {
                Random r = new Random();
                int i = r.nextInt(5);
                spielfeld.setContentAt(x, y, new Zahl(i, getColorForNumber(i)));
            }
        }

        return spielfeld;
    }
/**
 * 
 * @param spielfeld
 * @param xStart
 * @param yStart
 * @return 
 */
    public static ArrayList<Pair<Integer, Integer>> getNearbyFields(Spielfeld spielfeld, int xStart, int yStart) {
        ArrayList<Pair<Integer, Integer>> nearby = new ArrayList<Pair<Integer, Integer>>();
        for (int dx = -1; dx < 2; dx++) {
            for (int dy = -1; dy < 2; dy++) {
                if (dx != 0 && dy != 0) {
                   
                
                    try {
                        spielfeld.getContentAt(xStart + dx, yStart + dy);
                        nearby.add(new Pair<Integer, Integer>(xStart + dx, yStart + dy));
                    } catch (ArrayIndexOutOfBoundsException ex) {
                    }
                }
            }
        }
        return nearby;
    }

}
