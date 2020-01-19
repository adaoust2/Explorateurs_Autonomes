package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import data.GParameter;
/* @author antoine
 * @author bjmeo
 * this class is for grafical display 
 */
public class Gui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public double mapTab[][];
	
	
	// constant of color 
	public Color DARKGREEN = new Color(0,100,0);
	public Color BLUE = new Color(0,0,255);
	public Color GOLDSAND = new Color(255,215,0);
	
	private double sizeX;
	private double sizeY;
	
	private double tab[][];
	
	private Dimension dimension;
	
	private int screenHeight;
	private int screenWidth;
	
	private DashbordPanel dashbordPanel;
	private JPanel container;
	
	public Gui(double tab[][],double sizeX, double sizeY) {
		
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.tab = tab;
		
	    //allow to get the computer screen dimension 	
	    dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    screenHeight = (int)dimension.getHeight();
	    screenWidth  = (int)dimension.getWidth();
	    
	    dashbordPanel = new DashbordPanel(screenWidth);
	    container = new JPanel();
		
		setLayout();
	    add();
	}
	
	public void setLayout() {
		//For the mainFrame
		setTitle(" Explorateur ");
	    setSize((int)(sizeX*1.04), (int)(sizeY*1.07));
	    setLayout(null);
	    
	    container.setLayout(null);
	    container.setBounds(100, 100, 100, 100);
	    container.setBackground(new Color(255,255,255));
	}
	
	//method for display the map
	public void Display(){
		
		mapTab = tab;
	    JPanel panneau = new JPanel(){
	        /**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			protected void paintComponent(Graphics g){
	            super.paintComponent(g);
	            g.setColor(Color.black);
	            int y,x;
	            for (y=0; y<sizeX; y++){  
	            	for (x=0; x<sizeY; x++){
	            		if(mapTab[x][y]==2) { // sand 
	     					g.setColor(GOLDSAND);
	     				}
	            		else if(mapTab[x][y]==1){ //land
	     					g.setColor(DARKGREEN);
	            		}
	     				else if (mapTab[x][y]==0){ //water
	     					g.setColor(BLUE);
	     				}
	     				else{ // if the value is not recognized 
	     					System.out.println("Error ocured in Gui.java: \n Unknow value of map box :" + mapTab[x][y] );
	     					g.setColor(Color.PINK);
	     				}
	     	  			g.fillRect(x, y, 1, 1);
	     			}
	     		}
	        }
	    };
	    
	    //to center the map regardless of computer screen resolution
	    panneau.setBounds((int)((screenWidth/2)-sizeX/2),95,GParameter.mapWidth,GParameter.mapHeight);
	    container.add(panneau);
	}
	
	public void add(){
	    
	    container.add(dashbordPanel);
	    this.setContentPane(container);
	    setVisible(true);
	}
	
}
