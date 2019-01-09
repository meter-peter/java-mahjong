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
 public class CharTile extends Tile{
   List<String> chars = Arrays.asList("1","2","3","4","5","6","7","8","9"); //oi 9 diaforetikes kartes pou periexontai sta seasons
       String C=new String();

    public CharTile(int i) {
        this.C=chars.get(i);
    }
       
    
   
     public String getChars(int i){
         return chars.get(i);
     }

    @Override
    public String toString() {
        return "CharTile{" + "chars=" + chars + '}';
    }
     
     
  }
