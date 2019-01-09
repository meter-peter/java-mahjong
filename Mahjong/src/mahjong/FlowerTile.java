package mahjong;

//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Arrays;
import java.util.List;
import mahjong.Tile;

/**
 *
 * @author Petros
 */
public class FlowerTile extends Tile{
     List<String> flowers = Arrays.asList("F1", "F2", "F3" ,"F4"); //oi 4 diaforetikes kartes pou periexontai sta flowers
     String C=new String();
    
        public FlowerTile(int i) {
        this.C=flowers.get(i);
    }


    
    public List<String> getFlowers(){
        return flowers;
        
    }

     
}
