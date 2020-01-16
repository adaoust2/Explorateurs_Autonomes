package gui;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
/* @author antoine
 * this class is for grafical display 
 * 
 */
public class Gui extends Frame {
	public double mapTab[][];
	
	// constant of color 
	public Color DARKGREEN = new Color(0,100,0);
	public Color BLUE = new Color(0,0,255);
	public Color GOLDSAND = new Color(255,215,0);
	
	//method for display the map
	public void Display(double tab[][],double sizeX, double sizeY) {
		mapTab = tab;
		setTitle(" Explorateur ");
	    setSize((int)(sizeX*1.04), (int)(sizeY*1.07));
	    JPanel panneau = new JPanel(){
	        protected void paintComponent(Graphics g) {
	            super.paintComponent(g);
	            g.setColor(Color.black);
	            int y,x;
	            for (y=0; y<sizeX; y++) { 
	            	for (x=0; x<sizeY; x++) {
	            		if(mapTab[x][y]==2) { // sand 
	     					g.setColor(GOLDSAND);
	     				}
	            		else if(mapTab[x][y]==1) { // land
	     					g.setColor(DARKGREEN);
	            		}
	     				else if (mapTab[x][y]==0) { // water
	     					g.setColor(BLUE);
	     				}
	     				else { // if the value is not recognized 
	     					System.out.println("Error ocured in Gui.java: \n Unknow value of map box :" + mapTab[x][y] );
	     					g.setColor(Color.PINK);
	     				}
	     	  			g.fillRect(x, y, 1, 1);

	     			}
	     		}
	        }
	    };
	    add(panneau);
	    setVisible(true);
	    show(); // affiche la fenetre


	}
	
	
	
	
	

}
