package test;

import data.DataRepository;
import data.Explorer;
import data.Map;
import gui.Gui;
import gui.Menu;
import gui.SelectionMenu;

import java.awt.Container;
import java.util.*;


/*
 * this class contain the main
 * this class is for launch the app and make unit test
 */
public class Test {
	
	private static ArrayList<Explorer> listOfExplorer = new ArrayList<Explorer>();

	public static void main(String[] argv) {
		System.out.println("Test Started");
		// if you want to make your own test just comment my line testMap and create your own fonction for your test
		testMap();
		//testMenu();
	}
	public static void testMap() {
		Map map = new Map(); // default constructor
		map.generateNewMap();
		Explorer e1 = new Explorer("Arya",80,map.getWidth()*0.78,map.getHeight()*0.85,15,map.getWidth(), map.getHeight());e1.setPersonnalMap();
		Explorer e2 = new Explorer("Jane",80,map.getWidth()*0.73,map.getHeight()*0.85,15,map.getWidth(), map.getHeight());e2.setPersonnalMap();
		Explorer e3 = new Explorer("Daryl",80,map.getWidth()*0.68,map.getHeight()*0.85,15,map.getWidth(), map.getHeight());e3.setPersonnalMap();
		listOfExplorer.add(e1);listOfExplorer.add(e2);listOfExplorer.add(e3);
		Gui gui = new Gui(map.getTabOfMap(),map.getWidth(),map.getHeight(),3,map.getListOfMonster(),listOfExplorer);
					
		while(true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			map.getListOfMonster().get(0).move();
			map.getListOfMonster().get(1).move();
			map.getListOfMonster().get(2).move();
			listOfExplorer.get(0).action(map.getTabOfMap());
			listOfExplorer.get(1).action(map.getTabOfMap());
			listOfExplorer.get(2).action(map.getTabOfMap());
			gui.Display();
		}

		
	}
	public static void testMenu() {
		Menu menu = new Menu();
		//menu.refresh();
		//SelectionMenu sm= new SelectionMenu();
		//sm.selectPersonnage();
	}

	
	
}
