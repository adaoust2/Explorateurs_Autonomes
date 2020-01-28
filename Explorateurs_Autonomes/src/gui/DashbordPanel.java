package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Stroke;

import javax.swing.JPanel;

import data.GParameter;
import data.elements.SimulationUtility;
import process.actions.InfoActions;
/**
 * @bjmeo
 */
public class DashbordPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Integer minutes = 0,secondes = 0;
	
	private int width;
	
	private int height;
	
	private int lastX;
	
	private RenderingThread renderingThread = new RenderingThread(); 
	
	private Image type;
	
	private InfoActions infoActions;
	
	public DashbordPanel(int width){
		
		this.width = width;
		height = 90;
		initLayout();
		renderingThread.start();
	}
	
	public void initLayout(){
		this.setDoubleBuffered(true);
		this.setLayout(null);
		this.setBounds(0, 0, width, height);
		this.setBackground(new Color(48, 48, 48));
		//this.setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		int start_X = this.width/2+(GParameter.mapWidth)/2;
		drawTime(g2);
		drawAllCaptions(g2);
		g2.drawLine(start_X,0, start_X, this.height);
		if(GParameter.updateInfos)
			//System.out.println("true");
			drawExplorerInfos(g2);
		g.dispose();
	}
	/**
	 * Simulates the unit time (for an iteration) defined for the game. 
	 */
	public void drawExplorerInfos(Graphics g){
		int start_X = this.width/2+(GParameter.mapWidth)/2;
		int start_Y = 12;
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(GParameter.WHITE);
		g2.setStroke(new BasicStroke(2));	

		g2.drawString("name:"+GParameter.currentExp.getName(),start_X+10,start_Y);
		g2.drawString("lifePoint:"+GParameter.currentExp.getLifePoint(),start_X+10,start_Y+20);
		g2.drawString("damage:"+GParameter.currentExp.getDamage(),start_X+10,start_Y+40);
		
		g2.drawString("talkie-walkie:",start_X+10,start_Y+60);
		g2.drawString("radio:",start_X+10,start_Y+75);
		
		g2.drawString("spear:",start_X+120,start_Y);
		g2.drawString("bow:",start_X+120,start_Y+20);
		g2.drawString("gun:",start_X+120,start_Y+40);


	}
	/**
	 * Simulates the unit time (for an iteration) defined for the game. 
	 */
	public void drawAllCaptions(Graphics g){
		drawExploCaptions(g);
		drawIsleCaptions(g);
		drawMonstersCaptions(g);
	}
	/**
	 * allow to draw on the dashBord all explorers captions
	 */
	public void drawExploCaptions(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		int x=0,y=0,k=0;
		 
		//draw explorer caption
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++){
				
				type = SimulationUtility.readImage("src/Pictures/"+GParameter.EXPLO_NAME[k]+".png");
				g2.drawImage(type, x,y,GParameter.DIM_X,GParameter.DIM_Y,this);
				g2.drawString("->"+GParameter.EXPLO_NAME[k],x+GParameter.DIM_X,(y+GParameter.DIM_Y)-10);
				x+=GParameter.DIM_X*3+30;
				k++;  
			}
			lastX=x;
			y+=GParameter.DIM_Y;
			x=0;
		}
	}
	/**
	 * allow to draw on the dashBord all isle captions
	 */
	public void drawIsleCaptions(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		int x=lastX,y=0,k=0;
		
		//draw isle captions
		for(int i=0;i<3;i++) {
			for(int j=0;j<2;j++) {
				
				g2.setColor(GParameter.ISLE_COLOR[k]);
				g2.fillRect(x, y, GParameter.DIM_X, GParameter.DIM_Y);
				g2.setColor(GParameter.WHITE);
				g2.drawString("->"+GParameter.ISLE_NAME[k],x+GParameter.DIM_X,(y+GParameter.DIM_Y)-10);
				x+=GParameter.DIM_X*3+30;
				k++;  
			}
			y+=GParameter.DIM_Y;
			x=lastX;
		}
	}
	/**
	 * allow to draw on the dashBord all monsters captions
	 */
	public void drawMonstersCaptions(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		int x=lastX*2,y=0,k=0;
		
		//draw monsters caption
		for(int i=0;i<3;i++) {
			type = SimulationUtility.readImage("src/Pictures/"+GParameter.MOSTERS_NAME[k]+".png");
			g2.drawImage(type, x,y,GParameter.DIM_X,GParameter.DIM_Y,this);
			g2.drawString("->"+GParameter.MOSTERS_NAME[k],x+GParameter.DIM_X,(y+GParameter.DIM_Y)-10);
			y+=GParameter.DIM_Y;
			k++;
		}
	}
	/**
	 * Simulates the unit time (for an iteration) defined for the game. 
	 */
	public void unifiedTime(){
		secondes++;
		if(secondes==59){
			minutes++;
			secondes=0;
		}
		if(minutes==59){
			secondes=0;
			minutes=0;
		}
	}
	/**
	 * Simulates the unit time (for an iteration) defined for the game. 
	 */
	public void drawTime(Graphics g2){
		g2.setColor(Color.white);
		g2.drawString(minutes+" : "+secondes, (width/2)-5, 45);
	}
	
	/**
	 * sleepTime allows to sleep the time every values mills
	 */
	public void sleepTime(int value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
	}
	/** 
	 * RenderingThread to launch the time 
	 */
	class RenderingThread extends Thread { 
	      public void run(){ 
	         while(!GParameter.endSimulation || !GParameter.quitSimulation){ 
	        	 unifiedTime();
	        	 sleepTime(100);
	        	 repaint();
	         } 
	      } 
	}

	/**
	 * getters and setters
	 */
	public Integer getMinutes() {
		return minutes;
	}

	public Integer getSecondes() {
		return secondes;
	}

	public int getWidth() {
		return width;
	}

	public RenderingThread getRenderingThread() {
		return renderingThread;
	}
}
