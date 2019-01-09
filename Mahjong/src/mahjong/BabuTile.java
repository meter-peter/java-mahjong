package mahjong;




//Petros Evangelos Triantafyllis icsd17193 - Panteleimon Vadolas icsd13020
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;


/**
 *
 * @author Petros
 */
   public class BabuTile extends JButton implements ActionListener{
       ImageIcon b1,b2,b3,b4,b5,b6,b7,b8,b9;
       
       
       public BabuTile(){
            
           b1=new ImageIcon(this.getClass().getResource("B1.png"));
           b2=new ImageIcon(this.getClass().getResource("B2.png"));
           b3=new ImageIcon(this.getClass().getResource("B3.png"));
           b4=new ImageIcon(this.getClass().getResource("B4.png"));
           b5=new ImageIcon(this.getClass().getResource("B5.png"));
           b6=new ImageIcon(this.getClass().getResource("B6.png"));
           b7=new ImageIcon(this.getClass().getResource("B7.png"));
           b8=new ImageIcon(this.getClass().getResource("B8.png"));
           b9=new ImageIcon(this.getClass().getResource("B9.png"));
           this.addActionListener(this);
           }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   }

    

