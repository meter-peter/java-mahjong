//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong.TileTypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mahjong.Tile;

/**
 *
 * @author Petros
 */
public class CircleTile extends Tile{
     List<String> circles = Arrays.asList("C1", "C2", "C3","C4","C5","C6","C7","C8","C9"); //oi 9 diaforetikes kartes pou periexontai sta circles
     String C=new String();
     
    public CircleTile(int i) {
        
        this.C=circles.get(i);
    }

    
     public String getCircles(int i){
         return circles.get(i);
     }



}
