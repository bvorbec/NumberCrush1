/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spielfeldtest;

import Buisnesslogic.SpielfeldLogic;
import Model.Point;
import Model.Spielfeld;
import java.util.List;
import org.junit.Test;

/**
 *
 * @author tjark
 */
public class Spielfeldtest {
      public Spielfeldtest() {
    }
    Spielfeld feld = new Spielfeld(10, 10);
    SpielfeldLogic logic = new SpielfeldLogic(10,10);

    @Test
    public void toString1() {

        Spielfeld spielfeld = SpielfeldLogic.generateNewFeld(10,10);
        System.out.println(spielfeld);
        
      
    }
   @Test
    public void testTjark(){
        logic.searchAllCollections();
        for(List<Point> list: logic.getCollections()){
            System.out.println(list);
        }
    }
    
    
   
}
