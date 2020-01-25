package data;
import java.util.ArrayList;


public class Explorer extends Agent{

	private ArrayList<Item> items = new ArrayList<Item>();
    private ArrayList<Bonus> bonus = new ArrayList<Bonus>();
    
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
	
	public void Attack(Monster monster) {
	        
    }
	    
	public void move() {
	        
	}
	    
	public boolean communicate() {
	        return true;
	}
	    
	public boolean runAway() {
	        return true;
	}
	    

	public Explorer(String name,String image,float lifePoint, double posX, double posY,float damage,ArrayList<Item> items, ArrayList<Bonus> bonus) {
		super();
		this.items = items;
		this.bonus = bonus;
	}

}
