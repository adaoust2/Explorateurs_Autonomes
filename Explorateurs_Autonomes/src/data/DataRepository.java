package data;

/**
 * this repository class allow to create and 
 * store all the simulation object 
 * @author Bjmeo
 */
public class DataRepository {

	/**
	 * The unique instance of the class prepared in an eager way (object created
	 * at beginning).
	 */
	private static DataRepository instance = new DataRepository();
	
	/**
	 * Private constructor ensuring no access from outside of the class.
	 */
	private DataRepository() {}
	
	
	/**
	 * Static method allows users to get the unique instance of the class.
	 * 
	 * @return the unique instance of the class.
	 */
	public static DataRepository getInstance() {
		return instance;
	}
}
