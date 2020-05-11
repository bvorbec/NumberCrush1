/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisnesslogic;

import Model.Spielfeld;
import Model.Zahl;
import java.util.Random;

/**
 *
 * @author tjark
 */
public class SpielfeldLogic {
    
    private SpielfeldLogic() {
    }  
    public static Spielfeld generateNewFeld(int hoehe, int breite) {
        Spielfeld spielfeld = new Spielfeld(breite, hoehe);
        for (int x = 0; x < breite; x++) {
            for (int y = 0; y < hoehe; y++) {
                Random r = new Random();
                int i = r.nextInt(5);
                spielfeld.setContentAt(x, y, new Zahl(i));
                
            }
        }

        return spielfeld;
    }
    
}
