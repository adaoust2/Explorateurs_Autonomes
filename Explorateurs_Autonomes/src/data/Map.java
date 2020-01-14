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
		this.width = 600;
		this.height = 600;
	}
	
	public Map(double width, double height) { // 2nd with possibility to change the size of map
		super();
		this.width = width;
		this.height = height;
	}
	
	public void generateNewMap() {
		tabOfMap = new double[(int)width][(int)height];
		//implementation of each box of the table
		
		int type =(int)(Math.random()%1) + 1; // determine the type of the isle 
		int value;
		double margeLeft=0;
		double margeRight=0;
		
		switch (type) { // initialize value in function of the type 
			case 1:
				margeLeft = width*0.33;
				margeRight = width *0.66;
				
				
				
				break;
			
			default:System.out.println("type of make not recognized, you should check in class Map.java at the method generateNewMap ");
			System.out.println("type is :" + type);break;
		}
		
		
		
		for (int y=0; y<height; y++) { 
			for (int x=0; x<width; x++) {
				value = -1;
				if(x<width*0.02||y<height*0.02||x>width*0.98||y>height*0.98) {
					value=0; // water
				}
				else {
					switch (type) {
						case 1:
							if (x>margeLeft && x< margeRight) {
									value = 1; // land	
							}
							else { 
								value = 0; // water
							}
							
							
							break;
							
						default:System.out.println("type of make not recognized, you should check in class Map.java at the method generateNewMap ");
						System.out.println("type is :" + type);break;
					}
				}
				tabOfMap[x][y]=value; 

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
