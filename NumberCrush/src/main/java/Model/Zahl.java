/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;
import java.util.Objects;

/**
 *
 * @author tjark
 */
public class Zahl {
    private int content;
    private Color color;

    //konstruktor
    public Zahl(int content, Color color) {
        this.content = content;
        this.color = color;
    }

    public Zahl(int content){
        this.content = content;
    }
    //getter und Setter
    public int getContent() {
        return content;
    }

    public void setContent(int content) {
        this.content = content;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
       return "["+content+"]"; //[1]
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zahl)) return false;
        Zahl zahl = (Zahl) o;
        return content == zahl.content &&
                Objects.equals(color, zahl.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(content, color);
    }
}


