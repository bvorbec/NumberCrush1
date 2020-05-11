/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author tjark
 */
public class Spielfeld {
   
    
    private Zahl[][] content;


    public Spielfeld (int breite, int hoehe) {
     content = new Zahl [hoehe] [breite];
     for (int x =0; x< breite; x++){
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

