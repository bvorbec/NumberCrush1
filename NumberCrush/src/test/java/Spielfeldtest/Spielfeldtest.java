/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Spielfeldtest;

import Buisnesslogic.SpielfeldLogic;
import Model.Spielfeld;
import org.junit.Test;

/**
 *
 * @author tjark
 */
public class Spielfeldtest {
    @Test
    public void toString1() {

        Spielfeld spielfeld = SpielfeldLogic.generateNewFeld(10,10);
        System.out.println(spielfeld);


    }
}
