//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong.TileTypes;

import mahjong.Tile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Petros
 */
public class SeasonTile extends Tile {
  // List<String> chars = new ArrayList<String>();
   List<String> seasons = Arrays.asList("S1", "S2", "S3" ,"S4"); //oi 4 diaforetikes kartes pou periexontai sta seasons
  String C=new String();

    public SeasonTile(int i) {
        this.C=seasons.get(i);
        
    }
    
  
  
  
        public List<String> getSeasons(){
        return seasons;
        
    }
   
   
    
}
