/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package yannik.tjark.candycrush.buisnesslogic;

import com.sun.tools.javac.util.Pair;
import java.awt.List;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import yannik.tjark.candycrush.model.Spielfeld;
import yannik.tjark.candycrush.model.Zahl;
import org.hamcrest.core.
import org.junit.Assert;
/**
 *
 * @author tjark
 */
public class SpielfeldLogicTest {
    
    public SpielfeldLogicTest() {
    }
    
   

   
    /**
     * Test of getNextFields method, of class SpielfeldLogic.
     */
    @Test
    public void testGetNextFields() {
        System.out.println("getNextFields");
       Spielfeld feld = new Spielfeld(4, 4);
       feld.setContentAt(0, 0, new Zahl(1));
       feld.setContentAt(0, 1, new Zahl(4));
       feld.setContentAt(1, 0, new Zahl(4));
       feld.setContentAt(1, 1, new Zahl(3));
       feld.setContentAt(0, 2, new Zahl(3));
       feld.setContentAt(2, 0, new Zahl(4));
       feld.setContentAt(2, 1, new Zahl(3));
       feld.setContentAt(1, 2, new Zahl(1));
       feld.setContentAt(2, 2, new Zahl(2));
       
       System.out.println(feld);
       System.out.println(SpielfeldLogic.getNearbyFields(feld, 1, 1));
       ArrayList<Pair<Integer,Integer>>list=new ArrayList<Pair<Integer,Integer>>();
       list.add(new Pair(0,0));
       list.add(new Pair(0,1));
       list.add(new Pair(1,0));
       list.add(new Pair(1,1));
       list.add(new Pair(0,2));
       list.add(new Pair(2,0));
       list.add(new Pair(1,2));
       list.add(new Pair(2,1));
       list.add(new Pair(2,2));
        Assert.assertThat(SpielfeldLogic.getNearbyFields(feld, 1, 1), 
       IsIterableContainingInOrder.contains(list.toArray()));
       
       
    }
    
}
