package data;

import java.awt.Color;

public class GParameter {

	public static final Color BLACK=new Color(0,0,0);
	public static final Color WHITE=new Color(255,255,255); 
	public static final Color ORANGE=new Color(255, 140, 0);
	public static final Color DARKGREEN = new Color(0,100,0);
	public static final Color BLUE = new Color(0,0,255);
	public static final Color GOLDSAND = new Color(255,215,0);
	public static final Color STEELGREY = new Color(175, 175, 175); // new color 
	public static final Color IMPERIALGREEN = new Color(0, 86, 27);
	public static final Color DARKCHOCOLATE = new Color(90,58,34);
	public static final Color BLEUCOBALT = new Color(1,49,180);
	public static final Color AVOCADO = new Color(58,156,35);
	public static final Color VIOLET = new Color(156,6,226);
	public static final Color BANANA = new Color(209,182,6);
	public static final Color SABLE = new Color(224,205,169);
	
	public static int WIDTH = 1920;
	public static int HEIGH = 1080;
	public static int mapWidth = 700;
	public static int mapHeight = 700;
	
	public static boolean endSimulation = false;
	public static boolean quitSimulation = false;
	
	public static String root = "src/Pictures/";
	
	public static final String[] EXPLO_NAME = {"Arya","Babouche","Bob","Daryl","Farouja","Jane"
												,"Patrick","Rocky","Sonic"};
	
	public static final String[] ISLE_NAME = {"dMountain","sMountain","forest","sand","land","water"};
	
	public static final String[] MOSTERS_NAME = {"bear","crocodile","snake"};
	
	public static final Color[] ISLE_COLOR = {DARKCHOCOLATE,STEELGREY,IMPERIALGREEN,GOLDSAND,DARKGREEN,BLUE};
	
	public static final int nbExplo  = 9; 
	public static final int DIM_X = 30;
	public static final int DIM_Y = 30;
	
	public static final int DIM_GOLD_X = 10;
	public static final int DIM_GOLD_Y = 10;
	
	public static final int LIFE_POINT  = 100;
	
	public static Explorer currentExp;
	
	public static Monster currentMonst;
	
	public static boolean updateInfos = false;
	
}
