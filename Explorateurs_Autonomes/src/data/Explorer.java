package data;
import java.util.ArrayList;


public class Explorer extends Agent{

	private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Bonus> bonus = new ArrayList<Bonus>();
    private double[][] personnalMap;
	private int sizeOfPiwel=20;
	private double width; // X value 
	private double height;
    
    
    
	public Explorer(String name, float lifePoint, double posX, double posY, float damage, ArrayList<Item> items, ArrayList<Bonus> bonus, double width ,double height) {
		super(name, lifePoint, posX, posY, damage);
		this.items = items;
		this.bonus = bonus;
		this.width = width/20;
		this.height = height/20;
	}
	public Explorer(String name, float lifePoint, double posX, double posY, float damage, double width ,double height) {
		super(name, lifePoint, posX, posY, damage);
		this.width = width/20;
		this.height = height/20;
	}
	
	
	public void action(double tabOfMap[][]) {
		move(searchBoxUnknown(tabOfMap));
		addCurrentToMap(tabOfMap);
		Attack();
	}
	    
	public void addCurrentToMap(double tabOfMap[][]) { 
		if(personnalMap[(int)(getPosX()/20)][(int)(getPosY()/20)]==-1) {
			personnalMap[(int)(getPosX()/20)][(int)(getPosY()/20)]=tabOfMap[(int)(getPosX())][(int)(getPosY())];
		}
	}
	public void move(char direction) {
		switch(direction) {
			case 'r' :setPosX(getPosX()+sizeOfPiwel/2); break;
			case 'l' :setPosX(getPosX()-sizeOfPiwel/2); break;
			case 'd' :setPosY(getPosY()+sizeOfPiwel/2); break;
			case 'u' :setPosY(getPosY()-sizeOfPiwel/2); break;
			default:break;
		}
		
		
	}
	
	private char searchBoxUnknown(double tabOfMap[][]) {
		int posX = (int)(getPosX());
		int posY = (int)(getPosX());
		int dirX=0;
		int dirY=0;
		int dst=(int) (Math.pow(getPosX(),2)+Math.pow(getPosY(),2));
		
		for (int y=0; y<height; y++) { 
			for (int x=0; x<width; x++) {
				if(personnalMap[(int)(getPosX()/20)][(int)(getPosY()/20)]==-1) {
					if(Math.pow(getPosX()-x, 2)+Math.pow(getPosY()-y, 2)<dst) {
						dst=(int) (Math.pow(getPosX(),2)+Math.pow(getPosY(),2));
						dirX=x;
						dirY=y;
					}
				}
			}
		}
		int rand = (int)(Math.random()*100)%2;
		System.out.println(getPosX()+getPosY());
		switch(rand) {
		case 0:
			if(getPosX()-dirX<0&&tabOfMap[(int)(getPosX()+sizeOfPiwel)][(int)(getPosY())]!=0&&tabOfMap[(int)(getPosX()+sizeOfPiwel)][(int)(getPosY())]!=6) {
				return 'r'; // right
			}
			else if(getPosX()-dirX>0&&tabOfMap[(int)(getPosX()-sizeOfPiwel)][(int)(getPosY())]!=0&&tabOfMap[(int)(getPosX()-sizeOfPiwel)][(int)(getPosY())]!=6) {
				return 'l';  // left
			}
			else if(getPosY()-dirY<0&&tabOfMap[(int)(getPosX())][(int)(getPosY()+sizeOfPiwel)]!=0&&tabOfMap[(int)(getPosX())][(int)(getPosY()+sizeOfPiwel)]!=6) {
				return 'd'; // down
			}
			else if(getPosY()-dirY>0&&tabOfMap[(int)(getPosX())][(int)(getPosY()-sizeOfPiwel)]!=0&&tabOfMap[(int)(getPosX())][(int)(getPosY()-sizeOfPiwel)]!=6) {
				return 'u'; // up
			}
			else {
				return 'E';
			}
		default:
			if(getPosY()-dirY<0) {
				return 'd'; // down
			}
			else if(getPosY()-dirY>0) {
				return 'u'; // up
			}
			else if(getPosX()-dirX<0) {
				return 'r'; // right
			}
			else if(getPosX()-dirX>0) {
				return 'l';  // left
			}
			else {
				return 'E';
			}
		}
	

		
		
	}
	public void setPersonnalMap() {
		personnalMap = new double[(int)width][(int)height];
		for (int y=0; y<height; y++) { 
			for (int x=0; x<width; x++) {
				personnalMap[x][y]=-1;	
			}
		}
	}
	
	public void Attack() {
        
    }

	public ArrayList<Item> getItems() {
		return items;
	}

	public void setItems(ArrayList<Item> items) {
		this.items = items;
	}

	public ArrayList<Bonus> getBonus() {
		return bonus;
	}

	public void setBonus(ArrayList<Bonus> bonus) {
		this.bonus = bonus;
	}
	
	
	    
	public boolean communicate() {
	        return true;
	}
	    
	public boolean runAway() {
	        return true;
	}
	    


}
