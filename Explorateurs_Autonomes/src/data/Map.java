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
	private int sizeOfPiwel=20;
	int difficultyLevel = 1;
	
	
	
	
	
	public Map() { //default constructor 
		super();
		this.width = GParameter.mapWidth;
		this.height = GParameter.mapHeight;
	}
	
	public Map(double width, double height) { // 2nd with possibility to change the size of map
		super();
		this.width = width-width%sizeOfPiwel;
		this.height = height-width%sizeOfPiwel;
	}
	
	
	
	
	public void generateNewMap() { // new map generation you know
		tabOfMap = new double[(int)width][(int)height];
		int rand;
		//rand = (int) (100*Math.random()%3);
		int type;
		makeZone(tabOfMap,-1,0,0); // pink pixel at left-top 
		generateMonster();
		for (int y=0; y<height; y=y+sizeOfPiwel) { 
			for (int x=sizeOfPiwel; x<width; x=x+sizeOfPiwel) {
				type=-1;
				if(x>width*0.42&&x<width*0.52&&y<height*0.65&&y>height*0.6||x<0.7*width&&x>0.68*width&&y<height*0.35&&y>height*0.25) {/*&&y>height*0.2&&y<height*0.28||x==y+sizeOfPiwel+width/2&&y>height*0.2&&y<height*0.28||x==y+sizeOfPiwel*2+width/2&&y>height*0.2&&y<height*0.28) {*/
					type=5; // bridge
				}
				else if(y<=height*0.08||y>=height*0.9||x<=width*0.08||x>=width*0.9||(x/width+y/height)==1&& x>width*0.5||(x/width+y/height)<1.02&&(x/width+y/height)>0.95 && x>width*0.45||x>width*0.45&&x<width*0.5&&y>height*0.5) {	
					type=0; // water
				}
				else if(y>=height*0.87 || y>=height*0.85&&x>=width*0.15&&x<=width*0.85 || y>=height*0.82&&x>=width*0.25&&x<=width*0.75 || y>=height*0.8&&x>=width*0.35&&x<=width*0.65){
					type=2; // sand 
				}
				else if(y<=height*0.5&&y>=height*0.4&&x>=width*0.65&&x<=width*0.78||y<=height*0.5&&y>=height*0.45&&x>=width*0.55&&x<=width*0.88||y<=height*0.55&&y>=height*0.5&&x>=width*0.5&&x<=width*0.88||y<=height*0.6&&y>=height*0.55&&x>=width*0.58&&x<=width*0.83||y<=height*0.65&&y>=height*0.6&&x>=width*0.65&&x<=width*0.72) {
					type = 3; // forest
				}
				else if(y>=height*0.15&&y<=height*0.4&&x>=width*0.2&&x<=width*0.45) {
					if(y-sizeOfPiwel<height*0.15&&x+sizeOfPiwel>width*0.45||y+sizeOfPiwel>height*0.4&&x+sizeOfPiwel>width*0.45||y-sizeOfPiwel<height*0.15&&x-sizeOfPiwel<width*0.2||y+sizeOfPiwel>height*0.4&&x-sizeOfPiwel<width*0.2) {
						type= 1 ; // land
					}
					else {
						type=4; // mountain
					}
				}
				else {
					type=1; // land 

				}
				
				makeZone(tabOfMap,type,x,y);				
			}
		}
	}
	
	private void generateMonster() {
		Monster m1;
		for(int i=0;i<3*difficultyLevel; i++) {
			m1 = new Monster(20*difficultyLevel, (int)((Math.random()*10000)%width*0.6)+width*0.2, (int)((Math.random()*10000)%height*0.6)+height*0.2, 2*difficultyLevel,"Wolf");
			listOfMonster.add(m1);
		}

		
		
	}

	public void makeZone(double tabOfMap[][],int type,int indiceX, int indiceY) {
		for (int y=indiceY; y<indiceY+sizeOfPiwel; y++) { 
			for (int x=indiceX; x<indiceX+sizeOfPiwel; x++) {
				tabOfMap[x][y]=type;	
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

	public ArrayList<Monster> getListOfMonster() {
		return listOfMonster;
	}

	public void setListOfMonster(ArrayList<Monster> listOfMonster) {
		this.listOfMonster = listOfMonster;
	}

	public int getSizeOfPiwel() {
		return sizeOfPiwel;
	}

	public void setSizeOfPiwel(int sizeOfPiwel) {
		this.sizeOfPiwel = sizeOfPiwel;
	}

	public int getDifficultyLevel() {
		return difficultyLevel;
	}

	public void setDifficultyLevel(int difficultyLevel) {
		this.difficultyLevel = difficultyLevel;
	}

	
	
	
	
}
