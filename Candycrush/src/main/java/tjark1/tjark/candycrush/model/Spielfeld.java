package yannik.tjark.candycrush.model;

import com.sun.tools.javac.util.Pair;

import java.util.List;

public class Spielfeld {
    private Zahl[][] content;
    private List<List<Pair<Integer,Integer>>> fields;

    public Spielfeld(int breite, int hoehe){
        content = new Zahl[hoehe][breite]; // Größe des Spielfeldes.
        //fülle das Spielfeld mit empty Zahlen
        for(int x = 0; x< breite; x++){
            for(int y =0; y < hoehe ; y++){
                setContentAt(x,y, new Zahl(0));
            }
        }

    }

    public void setContentAt(int x, int y, Zahl zahl){
        content[y][x]= zahl;
    }
    public Zahl getContentAt(int x, int y){
        return content[y][x];
    }

    public Zahl[][] getContent() {
        return content;
    }

    /**
     * zeichnet ein Spielfeld
     * @return gibt das Spielfeld als String zurück
     */
    @Override
    public String toString() {

        String result = "";
        for(Zahl[] zeilen : content){
            for (Zahl zahl : zeilen) {
                result+= zahl.toString();
            }
            result += "\n";
        }
        return result;
    }
}
