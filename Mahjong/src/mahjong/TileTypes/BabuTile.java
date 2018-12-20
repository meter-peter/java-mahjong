
//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong.TileTypes;

import java.util.Arrays;
import java.util.List;
import mahjong.Tile;

/**
 *
 * @author Petros
 */
   public class BabuTile extends Tile {
    List<String> babus = Arrays.asList("B1", "B2","B3","B4","B5","B6","B7","B8","B9"); //oi 9 diaforetikes kartes pou periexontai sta Babu
     String C=new String();

    public BabuTile(int i) {
        this.C=babus.get(i);
    
    }
        
    
        public String getBabus(int i){
        return babus.get(i);
    }
 
        
    
   
    }


    

