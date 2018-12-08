/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.JPanel;

abstract public class Tile {

    private int x, y;
   // private ImageView obrazok;
    
    private boolean clicked;
    
   
    public abstract Tile copy();

    public void setCoords(int[] c){
        this.x = c[0];
        this.y = c[1];
       
    }
    public int[] getCoords(){
        int[] c = {x,y};
        return c;
    }
    public void setClicked(boolean clicked){
        this.clicked = clicked;
    }
    