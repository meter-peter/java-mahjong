package mahjong;



import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.GridLayout;

public class Mahjong extends JFrame{
	JPanel p=new JPanel();
	BabuTile buttons[]=new BabuTile[144];
	
	public static void main(String args[]){
		new Mahjong();
	}
	
	public Mahjong(){
		super("TicTacToe");
		setSize(1000,1000);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setLayout(new GridLayout(12,12));
           
		for(int i=0;i<144;i++){
			buttons[i]=new BabuTile();
			p.add(buttons[i]);
		}
		add(p);
		
		setVisible(true);
	}
}