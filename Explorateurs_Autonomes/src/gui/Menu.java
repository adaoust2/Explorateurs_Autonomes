package gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import data.GParameter;


/**
* @author adaoust
* This class contain the menu generation 
* 
*/
public class Menu extends JPanel{
	JFrame menu = new JFrame() ;
	private Image back ;
	JPanel content = this;
	public Menu() {
		menu.setSize(GParameter.WIDTH, GParameter.HEIGH);
		menu.setTitle("Exploreur");
		//menu.setBackground(GParameter.MENU_BACKGROUND);


		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			back=ImageIO.read(new File("src/Pictures/explo1.jpg"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		setBack();
		menu.setVisible(true);


		
	}
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, GParameter.WIDTH, GParameter.HEIGH, content);
		Font font = new Font("Title", Font.BOLD, 60);
	    g.setFont(font);
	    g.setColor(GParameter.BLACK);
	    g.drawString("Explorer", 775, 100);   
	}
       
	public void setBack() {
		content.setSize(GParameter.WIDTH, GParameter.HEIGH);
		content.setVisible(true);
		menu.add(content);

	}
	public JFrame getMenu() {
		return menu;
	}

}
