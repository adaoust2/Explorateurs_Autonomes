package data;

public class Monster extends Agent {

	private String type;
	private static String tabOfConsonne[] = {"B","C","D","F","G","J","M","N","P","S","R","L","V"};
	private static String tabOfVoyelle[] = {"A","E","I","O","U"};
	
	

	public Monster(float lifePoint, double posX, double posY, float damage, String type) {
		super(getRandomName(), lifePoint, posX, posY, damage);
		this.type = type;

	}


	private static String getRandomName() {
		String name = "";
		int rand = (int)(Math.random()*100)%4;
		int rand1;
		int rand2;
		for(int i =rand;i<9;i++) {
			if(i%2==0) {
				rand1 = (int)(Math.random()*100)%13;
				name.concat(tabOfConsonne[rand1]);		
			}
			else {
				rand2 = (int)(Math.random()*100)%5;
				name.concat(tabOfVoyelle[rand2]);		
			}	
		}	
		return name;
	}


	public void Attack(Explorer explorer) {
		
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}

}
