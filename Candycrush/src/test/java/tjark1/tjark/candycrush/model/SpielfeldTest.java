package yannik.tjark.candycrush.model;


import org.junit.Test;
import org.junit.runner.RunWith;
import yannik.tjark.candycrush.buisnesslogic.SpielfeldLogic;

import static org.junit.Assert.*;


public class SpielfeldTest {
    @Test
    public void toString1() {

        Spielfeld spielfeld = SpielfeldLogic.generateNewFeld(5,10);
        System.out.println(spielfeld);


    }
}
