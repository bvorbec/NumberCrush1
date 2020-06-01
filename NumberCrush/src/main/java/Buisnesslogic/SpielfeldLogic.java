/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisnesslogic;

import static Buisnesslogic.Zahllogic.getColorForNumber;
import Model.Point;
import Model.Spielfeld;
import Model.Zahl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Stack;

/**
 *
 * @author tjark
 */
public class SpielfeldLogic {
    //FÃ¼rs Durchsuchen
    List<Point> searched = new ArrayList<>();
    List<List<Point>> collections = new ArrayList<>();
    Stack<Point> pointsToSearch = new Stack<>();
    private Spielfeld spielfeld;

    private SpielfeldLogic() {

    }

    public SpielfeldLogic(int hoehe, int breite) {
        this.spielfeld = generateNewFeld(hoehe, breite);
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
     * Füge hinzu wenn die @Zahl im Punkt start gleich den Nachbarfeld ist und dieses noch nicht durchsucht wurde.
     *
     * @param start der Startpunkte
     * @return
     */
    public List<Point> getNextFields(Point start) {
        Zahl zpoint = spielfeld.getContentAt(start.getX(), start.getY());
        List<Point> next = new ArrayList<Point>();
        for (int x = -1; x < 2; x++) {
            if (x == 0) continue;
            try {
                Point nextPoint = new Point(start.getX() + x, start.getY());
                Zahl onNextPoint = spielfeld.getContentAt(start.getX() + x, start.getY());
                if (onNextPoint.equals(zpoint) && !searched.contains(nextPoint)) {
                    next.add(nextPoint);
                }

            } catch (ArrayIndexOutOfBoundsException ex) {
                //Mache nichts
            }
        }
        for (int y = -1; y < 2; y++) {
            if (y == 0) continue;
            try {
                Point nextPoint = new Point(start.getX(), start.getY() + y);
                Zahl onNextPoint = spielfeld.getContentAt(start.getX(), start.getY() + y);
                if (onNextPoint.equals(zpoint) && !searched.contains(nextPoint)) {
                    next.add(nextPoint);
                }

            } catch (ArrayIndexOutOfBoundsException ex) {
                //Mache nichts
            }
        }
        return next;
    }


    public List<Point> createOneCollection(Point start) {
        List<Point> myCollec = new ArrayList<Point>();
        myCollec.add(start);
        searched.add(start);
        pointsToSearch.remove(start);
        Stack<Point> toSearch = new Stack<>();
        toSearch.addAll(getNextFields(start));
        while (!toSearch.isEmpty()) {
            Point next = toSearch.pop();
            pointsToSearch.remove(next);
            searched.add(next);
            myCollec.add(next);
            toSearch.addAll(getNextFields(next));
        }


        return myCollec;
    }

    public void searchAllCollections() {
        pointsToSearch.addAll(getAllPointsOfField());
        while (!pointsToSearch.isEmpty()) {//alle Felder durchsuchen
            List<Point> list = createOneCollection(pointsToSearch.pop());
           if(list.size()>2) collections.add(list);
        }

    }

    public Spielfeld getSpielfeld() {
        return spielfeld;
    }

    public void setSpielfeld(Spielfeld spielfeld) {
        this.spielfeld = spielfeld;
    }

    public List<List<Point>> getCollections() {
        return collections;
    }

    private List<Point> getAllPointsOfField() {
        List<Point> result = new ArrayList<>();
        for (int x = 0; x < spielfeld.getWidth(); x++) {
            for (int y = 0; y < spielfeld.getHigth(); y++) {
                result.add(new Point(x, y));

            }


        }
        return result;
    }

}

