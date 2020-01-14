package data;
/**
 * @author Bjmeo
 */
public class Communication extends Item {

	private int nbPerson;
	private double distance;
	 
	/**constructors from superclass**/
	
	public Communication() {   
		super(); 
		// TODO Auto-generated constructor stub
	}
	public Communication(String type, int price) {
		super(type, price);
		// TODO Auto-generated constructor stub
	}
	
	public Communication(int nbPerson, double distance) {
		super();
		this.nbPerson = nbPerson;
	}
	public int getNbPerson() {
		return nbPerson;
	}
	public void setNbPerson(int nbPerson) {
		this.nbPerson = nbPerson;
	}
	public double getDistance() {
		return distance;
	}
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	
}
