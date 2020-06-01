/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buisnesslogic;

import java.awt.Color;

/**
 *
 * @author tjark
 */
public class Zahllogic {
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


