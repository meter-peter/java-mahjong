//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mahjong;

import mahjong.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mahjong.TileTypes.BabuTile;
import mahjong.TileTypes.CharTile;
import mahjong.TileTypes.CircleTile;
import mahjong.TileTypes.FlowerTile;
import mahjong.TileTypes.SeasonTile;

/**
 *
 * @author Petros
 */
public final class Board {
    //CircleTile circletile=new CircleTile();
    public List<Tile> allTiles=new ArrayList<>();
    public Tile map[][];
    public Board(){
        map=new Tile[12][12];
        for (int i=0;i<map.length;i++){
            for(int j=0;j<map[i].length;j++)
                map[i][j]=new Tile() {};
        }
        
    }
    
     
      public void buildDeck(){
          
      //gemisma tou deck me tis kartes twn flowrs 4*9=36
          for (int j=0;j<4;j++){
          for(int i = 0; i < 9; i++){
                   
           allTiles.add(new CircleTile(i));
               }
      }
           //gemisma tou deck me tis kartes twn babu 4*9=36
          for (int j=0;j<4;j++){
          for(int i = 0; i < 9; i++){
                   
           allTiles.add(new BabuTile(i));
               }
          }
             //gemisma tou deck me tis kartes twn cicles 4*9=36
          for (int j=0;j<4;j++){
          for(int i = 0; i < 9; i++){
                   
           allTiles.add(new CharTile(i));
               }
          
          }
              //gemisma tou deck me tis kartes twn babu 2*4
          for (int j=0;j<2;j++){
          for(int i = 0; i < 4; i++){
                   
           allTiles.add(new SeasonTile(i));
               }
}
              //gemisma tou deck me tis kartes twn flowers 2*4
          for (int j=0;j<2;j++){
          for(int i = 0; i < 4; i++){
                   
           allTiles.add(new FlowerTile(i));
               }
}
}
      public void displayDeck(){
          for(int i=0;i>allTiles.size();i++){
               System.out.println(allTiles.get(i));
          }
          
          
      }
}

      

