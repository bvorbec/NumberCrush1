package yannik.tjark.candycrush.model;

import java.awt.*;

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
}
