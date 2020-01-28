package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

import data.DataRepository;
import data.Explorer;
import data.GParameter;
import data.Monster;
import data.elements.SimulationUtility;
import data.generation.GenerateAgents;
import process.actions.InfoActions;

/* @author DeAntoine
 * @author bjmeo
 * this class is for grafical display 
 */
public class Gui extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	// constant of color 
	public Color DARKGREEN = new Color(0,100,0);
	public Color BLUE = new Color(0,0,255);
	public Color GOLDSAND = new Color(255,215,0);
	public Color STEELGREY = new Color(175, 175, 175); // new color 
	public Color IMPERIALGREEN = new Color(0, 86, 27);
	public Color DARKCHOCOLATE = new Color(90,58,34);
	private double sizeX;
	private double sizeY;
	private Image type;
	
	public double tab[][];
	
	private Dimension dimension;
	
	private int screenHeight;
	private int screenWidth;
	
	private DashbordPanel dashbordPanel;
	private JPanel container;
	private ArrayList<Monster> listOfMonster ;
	private DataRepository dataRepository = DataRepository.getInstance();
	private ArrayList<Explorer> listOfExplorer ;
	private GenerateAgents gen ;
	
	private InfoActions infoActions;
 
	
	public Gui(double tab[][],double sizeX, double sizeY) {
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.tab = tab;
		
	}

	public Gui(double tab[][],double sizeX, double sizeY,int test,ArrayList<Monster> listOfMonster) { // don't delete, this constructor is for @DeAntoine Test
		this.listOfMonster = listOfMonster;
		this.tab = tab;
	    this.sizeX = sizeX;
	    this.sizeY = sizeY;
	    
	    //allow to get the computer screen dimension 	
	    dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    screenHeight = (int)dimension.getHeight();
	    screenWidth  = (int)dimension.getWidth();
	    
	    dashbordPanel = new DashbordPanel(screenWidth);
	    container = new JPanel();
	    gen = new GenerateAgents();
	    gen.generateExplorer();
	    infoActions = new InfoActions();
	    
	    
	    
		setLayout();
	    add();

	}
	
	public void setLayout() {
		//For the mainFrame
		setTitle(" Explorateur ");
	    setSize((int)(sizeX*1.04), (int)(sizeY*1.07));
	    setLayout(null);
	    
	    container.setLayout(null);
	    container.setBounds(0, 0, screenWidth, screenHeight);
	    container.setBackground(new Color(0,0,0));
	}
	
	//method for display the map
	public void Display(){
		setSize((int)(sizeX*1.1),(int)(sizeY*1.1));
	    JPanel panneau = new JPanel(){
			private static final long serialVersionUID = 1L;
			protected void paintComponent(Graphics g){
	            super.paintComponent(g);
	            g.setColor(Color.black);
	            int y,x,posX=0,posY=0;
	            for (y=0; y<sizeY; y++){  
	            	for (x=0; x<sizeX; x++){
	            		if(tab[x][y]==5) { // mountain 
	            			//type = SimulationUtility.readImage("src/Pictures/moutain.png");
	            			g.setColor(DARKCHOCOLATE);
	            		}
	            		else if(tab[x][y]==4) { // mountain 
	            			//type = SimulationUtility.readImage("src/Pictures/moutain.png");
	            			
	            			g.setColor(STEELGREY);
	     				}
	            		else if(tab[x][y]==3) { // forest 
	            			//type = SimulationUtility.readImage("src/Pictures/forest.png");
	            			g.setColor(IMPERIALGREEN);
	     				}
	            		else if(tab[x][y]==2) { // sand 
	            			//type = SimulationUtility.readImage("src/Pictures/sand.png");
	            			g.setColor(GOLDSAND);
	     				}
	            		else if(tab[x][y]==1){ //land
	            			//type = SimulationUtility.readImage("src/Pictures/land.png");
	            			g.setColor(DARKGREEN);
	            		}
	     				else if (tab[x][y]==0){ //water
	     					//type = SimulationUtility.readImage("src/Pictures/water.png");
	            			g.setColor(BLUE);
	     				}
	     				else{ // if the value is not recognized 
	     					//System.out.println("Error ocured in Gui.java: \n Unknow value of map box :" + tab[x][y] );
	     					g.setColor(Color.PINK);
	     				}
	     	  			g.fillRect(x, y, 1, 1);
	     			}
	     		}
	            displayExplorer(g);
	            g.setColor(Color.RED);
	            for(int z = 0;z < listOfMonster.size() ; z++){
	            	
	            	type = SimulationUtility.readImage("src/Pictures/bear.png");
        			g.drawImage(type, (int)(listOfMonster.get(z).getPosX())-10,(int)(listOfMonster.get(z).getPosY())-10,GParameter.DIM_X,GParameter.DIM_Y,this);
	            	//g.fillOval((int)(listOfMonster.get(z).getPosX())-10,(int)(listOfMonster.get(z).getPosY())-10, 20, 20);
	            }
	            
	        }
	    };
	    
	    //to center the map regardless of computer screen resolution
	    panneau.setBounds((int)((screenWidth/2)-sizeX/2),95,GParameter.mapWidth,GParameter.mapHeight);
	    //add(panneau);
	    panneau.addMouseListener(infoActions);
	    panneau.addMouseMotionListener(infoActions);
	    container.add(panneau);
	    setVisible(true);
	}
	
	public void add(){
	    container.add(dashbordPanel);
	    this.setContentPane(container);
	    setVisible(true);
	}
	
	public void displayExplorer(Graphics g){
		
		listOfExplorer = dataRepository.getListOfExplorer();
		
		for(int i=0;i<5;i++){
			type = SimulationUtility.readImage(listOfExplorer.get(i).getImage());
			g.drawImage(type, (int)listOfExplorer.get(i).getPosX(),(int)listOfExplorer.get(i).getPosY(),GParameter.DIM_X,GParameter.DIM_Y,this);			
		}
	}
	
}
