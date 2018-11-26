/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong;

/**
 *
 * @author Petros
 */
public class Block {
    public Tile tile;
    int x , y ;
    private boolean containsTile;
    
    public Block(Object tile, int x , int y){
        this.tile= (Tile)tile;
        this.x=x;
        this.y=y;
        containsTile=true;
        
        
    }

    public Tile getTile() {
        return tile;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean ContainsTile() {
        return containsTile;
    }
        
  
    
    
    
}
