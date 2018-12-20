//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong;


abstract public class Tile {

    private int x, y;
    
    private boolean clicked;
    
    

    public void setCoords(int[] c){
        this.x = c[0];
        this.y = c[1];
       
    }
    public int[] getCoords(){
        int[] c = {x,y};
        return c;
    }
    public void Clicked(boolean clicked){
        this.clicked = clicked;
    }
    

     public boolean Check(Tile other){
        if(this.getClass() == other.getClass())
            return true;

        return false;
    }
}
