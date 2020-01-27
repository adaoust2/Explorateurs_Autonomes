package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.JPanel;

import data.GParameter;
import elements.SimulationUtility;



public class DashbordPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	
	private Integer minutes = 0,secondes = 0;
	
	private int width;
	
	private RenderingThread renderingThread = new RenderingThread(); 
	
	private Image type;
	
	public DashbordPanel(int width){
		
		this.width = width;
		initLayout();
		renderingThread.start();
	}
	
	public void initLayout(){
		this.setDoubleBuffered(true);
		this.setLayout(null);
		this.setBounds(0, 0, width, 90);
		this.setBackground(new Color(48, 48, 48));
		//this.setBackground(Color.LIGHT_GRAY);
		this.setVisible(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		drawTime(g2);
		drawExplo(g2);
		g.dispose();
	}
	
	public void drawExplo(Graphics g){
		//Sonic
		Graphics2D g2 = (Graphics2D) g;
		int x=0,y=0,k=0;
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				
				type = SimulationUtility.readImage("src/Pictures/"+GParameter.exploName[k]+".png");
				g2.drawImage(type, x,y,GParameter.DIM_X,GParameter.DIM_Y,this);
				g2.drawString("->"+GParameter.exploName[k],x+GParameter.DIM_X,(y+GParameter.DIM_Y)-10);
				x+=GParameter.DIM_X*3+30;
				k+=1;
			}
			y+=GParameter.DIM_Y;
			x=0;
		}
	}
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
	
	public void drawTime(Graphics g2){
		g2.setColor(Color.white);
		g2.drawString(minutes+" : "+secondes, (width/2)-5, 45);
	}
	
	/**
	 * Simulates the unit time (for an iteration) defined for the game. 
	 */
	public void sleepTime(int value) {
		try {
			Thread.sleep(value);
		} catch (InterruptedException e) {
			System.err.println(e.getMessage());
		}
	}
	
	class RenderingThread extends Thread { 
	      public void run(){ 
	         while(!GParameter.endSimulation || !GParameter.quitSimulation){ 
	        	 unifiedTime();
	        	 sleepTime(100);
	        	 repaint();
	         } 
	      } 
	}

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
