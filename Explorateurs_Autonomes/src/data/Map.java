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
	private ArrayList<Monster> listOfMonster = new ArrayList<Monster>();
	
	
	
	
	
	public Map() { //default constructor 
		super();
		this.width = GParameter.mapWidth;
		this.height = GParameter.mapHeight;
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
		boolean isSand = false;
		double margeLeft=0;
		double margeRight=0;
		
		switch (type) { // initialize value in function of the type 
			case 1:
				margeLeft = width*0.48;
				margeRight = width*0.52;			
				break;
			default:System.out.println("type is not recognized, you should check in class Map.java at the method generateNewMap ");
			System.out.println("type is :" + type);break;
		}
		for (int y=0; y<height; y++) { 
			if(y>height*0.05&&y<height*0.95) {
				switch (type) { // initialize value in function of the type 
					case 1:
						if (y<height/2){
							margeLeft = margeLeft*0.99;
							margeRight = margeRight+(width-margeRight)*0.011;
						}
						else {
							if(margeLeft<width/2) {
								margeLeft = margeLeft*1.01;
							}
							if(margeRight>width/2) {
								margeRight = margeRight-(width-margeRight)*0.011;
							}
						}
						break;
					default:
						System.out.println("type is not recognized, you should check in class Map.java at the method generateNewMap ");
						System.out.println("type is :" + type);break;
				}
			}
			if(isSand==false && y>height*0.8) {
				 if((Math.random()*100)%100<4) {
					 isSand=true;
				 }
			}
			for (int x=0; x<width; x++) {
				value = -1;
				if(x<width*0.05||y<height*0.05||x>width*0.95||y>height*0.95) {
					value=0; // water
				}
				else {
					switch (type) {
						case 1:
							if (x>margeLeft && x< margeRight) {
								if(isSand==true) {
									value = 2; // land
								}
								else {
									value = 1; // land	
								}
							}
							else { 
								value = 0; // water
							}
							break;
						default:System.out.println("type is not recognized, you should check in class Map.java at the method generateNewMap ");
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
