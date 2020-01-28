package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Random;

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
public class Menu extends JPanel implements ActionListener{
	private JFrame menu = new JFrame() ;
	private JPanel pan = new JPanel();
	private Image back;
	private JPanel content = this;
	private Font font;
	private Font fonttitle;
	private Icon icon;
	private Button game = new Button();
	private Button high = new Button();
	private Button arya = new Button();
	private Button bob = new Button();
	private Button babouche = new Button();
	private Button daryl = new Button();
	private Button faroudja = new Button();
	private Button patrick = new Button();
	private Button rocky = new Button();
	private Button rosa = new Button();
	private Button sonic = new Button();
	
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
	public void mouseClicked(MouseEvent arg0) {
		refresh();
		
	}
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, GParameter.WIDTH, GParameter.HEIGH, content);
		fonttitle = new Font("Title", Font.BOLD, 100);
	    g.setFont(fonttitle);
	    g.setColor(GParameter.WHITE);
	    g.drawString("Explorer", 700, 150);
	    g.setFont(font);

	}
	public void update(Graphics g) {
		g.setColor(GParameter.BLACK);
	}
       
	public void setBack() {
		content.setSize(GParameter.WIDTH, GParameter.HEIGH);
		content.setVisible(true);
		game.setBounds(400, 550, 450, 200);
		game.setVisible(true);
		game.setIcon(new ImageIcon("src/Pictures/button_new.jpg"));

		high.setBounds(950, 550, 450, 200);
		high.setVisible(true);
		high.setIcon(new ImageIcon("src/Pictures/button2.jpg"));
		game.addActionListener(this);
		pan.setBounds(0, 0, 500, 500);
		pan.setBackground(GParameter.ORANGE);
		menu.add(high);
		menu.add(game);
		menu.add(content);


	}
	public JFrame getMenu() {
		return menu;
	}
	public void refresh() {

	}
	public void actionPerformed(ActionEvent evt) {
		setBack2();
		remove();
		menu.setBackground(GParameter.BLACK);
		SelectionMenu sm = new SelectionMenu();
		menu.setContentPane(sm);
		//selectPersonnage();
	};
	public void setBack2() {
		menu.remove(high);
	}
	public void remove() {
		menu.remove(game);
	}
	public void selectPersonnage() {
		Random m = new Random();
		int n=0;
		int i=0;
		int x=200;
		while(i<4) {
			n=m.nextInt(9);
			System.out.println(x);
			System.out.println(n);
			switch (n) {
			case 0:
				arya.setBounds(x, 200, 68, 100);
				arya.setVisible(true);
				arya.setIcon(new ImageIcon("src/Pictures/Arya_button.png"));
				x=x+68;
				menu.add(arya);
				break;
			case 1:
				bob.setBounds(x, 200, 68,100);
				bob.setVisible(true);
				bob.setIcon(new ImageIcon("src/Pictures/Bob_button.png"));
				x=x+68;
				menu.add(bob);
				break;
			case 2:
				babouche.setBounds(x, 200, 68,100);
				babouche.setVisible(true);
				babouche.setIcon(new ImageIcon("src/Pictures/Babouche_button.png"));
				x=x+68;
				menu.add(babouche);

				break;
			case 3:
				daryl.setBounds(x, 200, 68,100);
				daryl.setVisible(true);
				daryl.setIcon(new ImageIcon("src/Pictures/Daryl_button.png"));
				x=x+68;
				menu.add(daryl);

				break;
			case 4:
				faroudja.setBounds(x, 200, 68,100);
				faroudja.setVisible(true);
				faroudja.setIcon(new ImageIcon("src/Pictures/Farouja_button.png"));
				x=x+68;
				menu.add(faroudja);

				break;
			case 5:
				patrick.setBounds(x, 200, 68,100);
				patrick.setVisible(true);
				patrick.setIcon(new ImageIcon("src/Pictures/Patrick_button.png"));
				x=x+68;
				menu.add(patrick);

				break;
			case 6:
				rocky.setBounds(x, 200, 68,100);
				rocky.setVisible(true);
				rocky.setIcon(new ImageIcon("src/Pictures/Rocky_button.png"));
				x=x+68;
				menu.add(rocky);

				break;
			case 7:
				rosa.setBounds(x, 200, 68,100);
				rosa.setVisible(true);
				rosa.setIcon(new ImageIcon("src/Pictures/Rosa_button.png"));
				x=x+68;
				menu.add(rosa);

				break;
			case 8:
				sonic.setBounds(x, 200, 68,100);
				sonic.setVisible(true);
				sonic.setIcon(new ImageIcon("src/Pictures/Sonic_button.png"));
				x=x+68;
				menu.add(sonic);

				break;
			default:
				break;
			}

			i=i+1;
		}
	}

}
