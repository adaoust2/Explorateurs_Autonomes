package data.elements;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;

public class SimulationUtility {

	public static Image readImage(String filePath) {
		try {
			return ImageIO.read(new File(filePath));
		} catch (IOException e) {
			System.err.println("-- Can not read the image file ! --");
			return null;
		}
	} 
	
	public static int randomPoint(int min, int max){
		Random rand = new Random(); 
		int stat = rand.nextInt((max - min) + 1) + min;
		return stat;
	}
}
