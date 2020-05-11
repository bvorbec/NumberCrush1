/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;

/**
 *
 * @author tjark
 */
public class Zahl {
    private int content;
    

    //konstruktor
    public Zahl(int content) {
        this.content = content;
        
    }

   
    //getter und Setter
    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }
    @Override
    public String toString() {
       return "["+content+"]"; //[1]
    }
}

