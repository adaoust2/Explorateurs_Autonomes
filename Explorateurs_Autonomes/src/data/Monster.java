package data;

public class Monster extends Agent {

	private String type;
	
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void Attack(Explorer explorer) {
		
	}

	public Monster(String name,String image,float lifePoint, double posX, double posY,float damage,String type) {
		super();
		this.type = type;
		
	}

	
	
	
}
