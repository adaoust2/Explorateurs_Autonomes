package data;

import java.util.ArrayList;

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
	
	// objects instantiation (EXPLORER) 
	
	private ArrayList<Item> items = new ArrayList<Item>();
	private ArrayList<Bonus> bonus = new ArrayList<Bonus>();
	Explorer Ex1 = new Explorer("Patrick","image",0,0,0,4,items,bonus);
	
	Explorer Ex2 = new Explorer("Bob","image",0,0,0,3,items,bonus);
	
	Explorer Ex3 = new Explorer("Farouja","image",0,0,0,5,items,bonus);
	
	Explorer Ex4 = new Explorer("babouche","image",0,0,0,4,items,bonus);
	
	Explorer Ex5 = new Explorer("Daryl","image",0,0,0,1,items,bonus);
	
	Explorer Ex6 = new Explorer("Sonic","image",0,0,0,2,items,bonus);
	
	Explorer Ex7 = new Explorer("Arya","image",0,0,0,4,items,bonus);
	
	Explorer Ex8 = new Explorer("Rocky","image",0,0,0,5,items,bonus);
	
	Explorer Ex9 = new Explorer("Rosa","image",0,0,0,3,items,bonus);
	
	Explorer Ex10 = new Explorer("Jane","image",0,0,0,2,items,bonus);
	
	// Objects instantiation ( MONSTER )
	
	Monster mons1 = new Monster("Lion","image",0,0,0,5,"Félins");
	
	Monster mons2 = new Monster("Serpent","image",0,0,0,4,"reptiles");
	
	Monster mons3 = new Monster("Serpent","image",0,0,0,4,"Ursidés");

	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
