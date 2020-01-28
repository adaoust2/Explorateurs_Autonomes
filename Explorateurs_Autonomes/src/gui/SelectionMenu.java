package gui;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import data.GParameter;

public class SelectionMenu extends JPanel{
	private Button arya = new Button();
	private Button bob = new Button();
	private Button babouche = new Button();
	private Button daryl = new Button();
	private Button faroudja = new Button();
	private Button patrick = new Button();
	private Button rocky = new Button();
	private Button rosa = new Button();
	private Button sonic = new Button();
	private JPanel content = new JPanel();
	private Image back;
	
	public SelectionMenu() {
		try {
			back=ImageIO.read(new File("src/Pictures/fond2.jpg"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		initback();
		selectPersonnage();
		
	}
	public void initback() {
		content=this;
		content.setBounds(0,0 , GParameter.WIDTH, GParameter.HEIGH);
		content.setLayout(null);
		content.setVisible(true);
		content.setBackground(GParameter.BLACK);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, GParameter.WIDTH, GParameter.HEIGH, content);
		Font fonttitle = new Font("Title", Font.BOLD, 100);
	    g.setFont(fonttitle);
	    g.setColor(GParameter.WHITE);
	    g.drawString("Choose your explorer", 375, 150);

	}
	
	public void selectPersonnage() {
		Random m = new Random();
		int n=0;
		int i=0;
		int x=600;
		while(i<4) {
			n=m.nextInt(9);
			System.out.println(x);
			System.out.println(n);
			switch (n) {
			case 0:
				arya.setBounds(x, 700, 136, 200);
				arya.setVisible(true);
				arya.setIcon(new ImageIcon("src/Pictures/Arya_button.png"));
				x=x+136;
				content.add(arya);
				break;
			case 1:
				bob.setBounds(x, 700, 136,200);
				bob.setVisible(true);
				bob.setIcon(new ImageIcon("src/Pictures/Bob_button.png"));
				x=x+136;
				content.add(bob);
				break;
			case 2:
				babouche.setBounds(x, 700, 136,200);
				babouche.setVisible(true);
				babouche.setIcon(new ImageIcon("src/Pictures/Babouche_button.png"));
				x=x+136;
				content.add(babouche);

				break;
			case 3:
				daryl.setBounds(x, 700, 136,200);
				daryl.setVisible(true);
				daryl.setIcon(new ImageIcon("src/Pictures/Daryl_button.png"));
				x=x+136;
				content.add(daryl);

				break;
			case 4:
				faroudja.setBounds(x, 700, 136,200);
				faroudja.setVisible(true);
				faroudja.setIcon(new ImageIcon("src/Pictures/Farouja_button.png"));
				x=x+136;
				content.add(faroudja);

				break;
			case 5:
				patrick.setBounds(x, 700, 136,200);
				patrick.setVisible(true);
				patrick.setIcon(new ImageIcon("src/Pictures/Patrick_button.png"));
				x=x+136;
				content.add(patrick);

				break;
			case 6:
				rocky.setBounds(x, 700, 136,200);
				rocky.setVisible(true);
				rocky.setIcon(new ImageIcon("src/Pictures/Rocky_button.png"));
				x=x+136;
				content.add(rocky);

				break;
			case 7:
				rosa.setBounds(x, 700, 136,200);
				rosa.setVisible(true);
				rosa.setIcon(new ImageIcon("src/Pictures/Rosa_button.png"));
				x=x+136;
				content.add(rosa);

				break;
			case 8:
				sonic.setBounds(x, 700, 136,200);
				sonic.setVisible(true);
				sonic.setIcon(new ImageIcon("src/Pictures/Sonic_button.png"));
				x=x+136;
				content.add(sonic);

				break;
			default:
				break;
			}

			i=i+1;
		}
	}
}
