package gui;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
/*
 * this class is for grafical display 
 * 
 */
public class Gui extends Frame {
	public double mapTab[][];
	public void Display(double tab[][]) {
		mapTab = tab;
		double sizeX = 300;
		double sizeY = 300;
		setTitle(" Explorateur ");
	    setSize(600, 600);
	    JPanel panneau = new JPanel(){
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.setColor(Color.black);
	            int y,x;
	            for (y=0; y<sizeX; y++) { 
	            	for (x=0; x<sizeY; x++) {
	            		if(mapTab[x][y]==1) { //land
	     					g.setColor(Color.GREEN);
	     				}
	     				else if (mapTab[x][y]==0) { // water
	     					g.setColor(Color.BLUE);
	     				}
	     	  			g.fillRect(x, y, 1, 1);

	     			}
	     		}
  				g.fillRect(50, 50, 10, 10);

	        }
	    };
	    add(panneau);
	    setVisible(true);
	    show(); // affiche la fenetre


	}
	
	
	
	
	

}
