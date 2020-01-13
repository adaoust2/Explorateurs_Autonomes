package data;

import java.util.ArrayList;

/**
* @author antoine
* This class contain the map generation 
* 
*/


public class Map {
	private double width; // X value 
	private double height; // Y value
	private double tabOfMap[][];
	//private ArrayList<Monster> listOfMonster = new ArrayList<Monster>();
	
	
	
	
	
	public Map() { //default constructor 
		super();
		this.width = 5000;
		this.height = 5000;
	}
	
	public Map(double width, double height) { // 2nd with possibility to change the size of map
		super();
		this.width = width;
		this.height = height;
	}
	
	public void generateNewMap() {
		
		
		//implementation of each box of the table
		for (int y=0; y<height; y++) { 
			for (int x=0; x<width; x++) {
				if(x>5&&y>5&&x<width-5&&y<height-5) {
					
					tabOfMap[x][y]=1;
				}
				tabOfMap[x][y]=0;	
			}
		}

	}

	
	
	
	
	// after this their is all the AUTO-generate getter and setter
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double[][] getTabOfMap() {
		return tabOfMap;
	}
	
	
	
	
}
