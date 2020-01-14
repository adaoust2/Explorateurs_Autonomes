package data;
/**
 * @author Bjmeo
 */
public class Weapon extends Item {

	private String effect;
	private float damage;
	
	/**constructors from superclass**/
	
	public Weapon() {
		super();
	}
	public Weapon(String type, int price) {
		super(type, price);
	}
	public Weapon(String effect, float damage) {
		super();
		this.effect = effect;
		this.damage = damage; 
	}
	 
	/**Getters and setters**/
	public String getEffect() {
		return effect;
	}
	public void setEffect(String effect) {
		this.effect = effect;
	}
	public float getDamage() {
		return damage;
	}
	public void setDamage(float damage) {
		this.damage = damage;
	}
	
}
