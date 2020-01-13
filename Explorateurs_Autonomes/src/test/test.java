package test;

import data.Map;
import java.util.*;

public class test {
	public static void main(String[] argv) {
		System.out.println("Test Started");
		// if you want to make your own test just comment my line testMap and create your own fonction for your test
		testMap();
		
		
		
	}
	public static void testMap() {
		Map map = new Map();
		System.out.println("map size x=" + map.getWidth() + " and y= " + map.getHeight());
		double tab[][] = map.getTabOfMap();
		
		
	}

	
	
}
