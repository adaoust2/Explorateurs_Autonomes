package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import data.GParameter;

public class SelectionMenu extends JPanel implements ActionListener{
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
	private Image parchemin;
	private Dimension dimension;
	private int heigh;
	private int width;
	
	public SelectionMenu() {
		try {
			back=ImageIO.read(new File("src/Pictures/fond2.jpg"));
			parchemin=ImageIO.read(new File("src/Pictures/Parchemin.png"));
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	    dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    heigh=(int) dimension.getHeight();
	    width=(int) dimension.getWidth();
		initback();
		selectPersonnage();
		
	}
	public void initback() {
		content=this;
		content.setBounds(0,0 , width, heigh);
		content.setLayout(null);
		content.setVisible(true);
		content.setBackground(GParameter.BLACK);
	}
	public void paintComponent(Graphics g) {
		g.drawImage(back, 0, 0, width, heigh, content);
		g.drawImage(parchemin, width/10, heigh/2+heigh/20,width/2,heigh/3+heigh/20,content);
		Font fonttitle = new Font("Title", Font.BOLD, 100);
	    g.setFont(fonttitle);
	    g.setColor(GParameter.WHITE);
	    g.drawString("Choose your explorer", 250, 150);

	}
	
	public void selectPersonnage() {
		Random m = new Random();
		ArrayList<Integer> perso = new ArrayList<Integer>();
		int n=0;
		int i=0;
		int x=width/10+width/10;
		while(i<4) {
			n=m.nextInt(9);
			while(perso.contains(n)) {
				n=m.nextInt(9);
			}
			switch (n) {
			case 0:
				arya.setBounds(x, 700, 136, 200);
				arya.setVisible(true);
				arya.setOpaque(false);
				arya.setBorder(null);
				arya.setIcon(new ImageIcon("src/Pictures/Arya_button.png"));
				arya.setBackground(GParameter.SABLE);
				arya.addActionListener(this);
				x=x+136;
				perso.add(0);
				content.add(arya);
				break;
			case 1:
				bob.setBounds(x, 700, 136,200);
				bob.setVisible(true);
				bob.setOpaque(false);
				bob.setBorder(null);
				bob.setIcon(new ImageIcon("src/Pictures/Bob_button.png"));
				bob.setBackground(GParameter.SABLE);
				bob.addActionListener(this);
				x=x+136;
				perso.add(1);
				content.add(bob);
				break;
			case 2:
				babouche.setBounds(x, 700, 136,200);
				babouche.setVisible(true);
				babouche.setOpaque(false);
				babouche.setBorder(null);
				babouche.setIcon(new ImageIcon("src/Pictures/Babouche_button.png"));
				babouche.setBackground(GParameter.SABLE);
				babouche.addActionListener(this);
				x=x+136;
				perso.add(2);
				content.add(babouche);

				break;
			case 3:
				daryl.setBounds(x, 700, 136,200);
				daryl.setVisible(true);
				daryl.setOpaque(false);
				daryl.setBorder(null);
				daryl.setIcon(new ImageIcon("src/Pictures/Daryl_button.png"));
				daryl.setBackground(GParameter.SABLE);
				daryl.addActionListener(this);
				x=x+136;
				perso.add(3);
				content.add(daryl);

				break;
			case 4:
				faroudja.setBounds(x, 700, 136,200);
				faroudja.setVisible(true);
				faroudja.setOpaque(false);
				faroudja.setBorder(null);
				faroudja.setIcon(new ImageIcon("src/Pictures/Farouja_button.png"));
				faroudja.setBackground(GParameter.SABLE);
				faroudja.addActionListener(this);
				x=x+136;
				perso.add(4);
				content.add(faroudja);

				break;
			case 5:
				patrick.setBounds(x, 700, 136,200);
				patrick.setVisible(true);
				patrick.setOpaque(false);
				patrick.setBorder(null);
				patrick.setIcon(new ImageIcon("src/Pictures/Patrick_button.png"));
				patrick.setBackground(GParameter.SABLE);
				patrick.addActionListener(this);
				x=x+136;
				perso.add(5);
				content.add(patrick);

				break;
			case 6:
				rocky.setBounds(x, 700, 136,200);
				rocky.setVisible(true);
				rocky.setOpaque(false);
				rocky.setBorder(null);
				rocky.setIcon(new ImageIcon("src/Pictures/Rocky_button.png"));
				rocky.setBackground(GParameter.SABLE);
				rocky.addActionListener(this);
				x=x+136;
				perso.add(6);
				content.add(rocky);

				break;
			case 7:
				rosa.setBounds(x, 700, 136,200);
				rosa.setVisible(true);
				rosa.setOpaque(false);
				rosa.setBorder(null);
				rosa.setIcon(new ImageIcon("src/Pictures/Rosa_button.png"));
				rosa.setBackground(GParameter.SABLE);
				rosa.addActionListener(this);
				x=x+136;
				perso.add(7);
				content.add(rosa);

				break;
			case 8:
				sonic.setBounds(x, 700, 136,200);
				sonic.setVisible(true);
				sonic.setOpaque(false);
				sonic.setBorder(null);
				sonic.setIcon(new ImageIcon("src/Pictures/Sonic_button.png"));
				sonic.setBackground(GParameter.SABLE);
				sonic.addActionListener(this);
				x=x+136;
				perso.add(8);
				content.add(sonic);
				break;
			default:
				break;
			}

			i=i+1;
		}
	}
	public void actionPerformed(ActionEvent e) {
		int persoskill=0;
		if(e.getSource()==bob) {
			persoskill=1;
		}else if(e.getSource()==babouche) {
			persoskill=2;
		}else if(e.getSource()==daryl) {
			persoskill=3;
		}else if(e.getSource()==faroudja) {
			persoskill=4;
		}else if(e.getSource()==patrick) {
			persoskill=5;
		}else if(e.getSource()==rocky) {
			persoskill=6;
		}else if(e.getSource()==rosa) {
			persoskill=7;
		}else if(e.getSource()==sonic) {
			persoskill=8;
		}

		SkillsMenu sm = new SkillsMenu(persoskill);
		this.remove(sm);
		this.add(sm);
		repaint();
	}
}
