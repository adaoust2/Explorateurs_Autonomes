package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
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
	private JFrame menu = new JFrame() ;
	private Image back;
	private JPanel content = this;
	private Font font;
	private Font fonttitle;
	private Icon icon;
	private Button game = new Button();
	private Button high = new Button();

	
	public Menu() {
		menu.setSize(GParameter.WIDTH, GParameter.HEIGH);
		menu.setTitle("Exploreur");


		menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			back=ImageIO.read(new File("src/Pictures/explo1.jpeg"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		setBack();
		menu.setVisible(true);


		
	}
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, GParameter.WIDTH, GParameter.HEIGH, content);


		try {
			File caribbean = new File("src/Caribbean.fon");
			//Font.createFont(95, caribbean);
			fonttitle = new Font("Title", Font.BOLD, 100);
			font = new Font("Title", Font.BOLD, 30);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}

	    g.setFont(fonttitle);
	    g.setColor(GParameter.WHITE);
	    g.drawString("Explorer", 700, 150);
	    g.setFont(font);


	    //g.drawImage(butt, 500,600 , 400, 300, content);
	    g.drawString("New Game", 600, 650);
	}
       
	public void setBack() {
		content.setSize(GParameter.WIDTH, GParameter.HEIGH);
		content.setVisible(true);
		game.setBounds(400, 550, 450, 200);
		game.setVisible(true);
		game.setIcon(new ImageIcon("src/Pictures/button_new.jpg"));
		high.setBounds(950, 550, 450, 200);
		high.setVisible(true);
		high.setIcon(new ImageIcon("src/Pictures/button_high.jpg"));
		menu.add(high);
		menu.add(game);
		menu.add(content);



	}
	public JFrame getMenu() {
		return menu;
	}

}
