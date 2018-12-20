//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020

package mahjong;
import mahjong.TileTypes.*;
/**
 *
 * @author Petros
 */
public class Block {
    public Tile tile;
    int x , y ;
    private boolean containsTile;
    
    public Block(Object tile, int x , int y){
        this.tile=(Tile)tile;
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
