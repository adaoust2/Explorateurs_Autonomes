package data;

public abstract class Agent {

	private String name;
	private String image;
	private float lifePoint;
	private double posX;
	private double posY;
	private float damage;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public float getLifePoint() {
		return lifePoint;
	}


	public void setLifePoint(float lifePoint) {
		this.lifePoint = lifePoint;
	}


	public double getPosX() {
		return posX;
	}


	public void setPosX(double posX) {
		this.posX = posX;
	}


	public double getPosY() {
		return posY;
	}


	public void setPosY(double posY) {
		this.posY = posY;
	}


	public float getDamage() {
		return damage;
	}


	public void setDamage(float damage) {
		this.damage = damage;
	}


	public Agent() {
		// TODO Auto-generated constructor stub
	}

}
