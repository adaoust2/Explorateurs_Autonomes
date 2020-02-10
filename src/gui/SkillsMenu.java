package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

import data.GParameter;

public class SkillsMenu extends JPanel{
	private Button butadd = new Button();
	private Dimension dimension;
	private int width;
	private int heigh;
	private int perso;
	private int verysmall;
	private int small;
	private int medium;
	private int tall;
	private String vs,s,m,t;
	private Image arya,bob,babouche,daryl,faroudja,patrick,rocky,rosa,sonic;
	private String name;
	private String particularskill ="";

	public SkillsMenu(int perso) {
		this.perso=perso;
		init();
		choice(perso);
	    
	}
	public void choice(int perso) {
		if(perso==0) {
			name="Arya";
			try {
				arya=ImageIO.read(new File("src/Pictures/Arya_button.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(perso==1) {
			name="Bob";
			try {
				bob=ImageIO.read(new File("src/Pictures/Bob_button.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			particularskill="can repare one item during the adventure";
		}else if(perso==2) {
			name="Babouche";
			try {
				babouche=ImageIO.read(new File("src/Pictures/Babouche_button.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			particularskill="he will always flee the fight but you have a hudge reduction at the market";
		}else if(perso==3) {
			name="Daryl";
			try {
				daryl=ImageIO.read(new File("src/Pictures/Daryl_button.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			particularskill="he is solitary, he have trouble to communicate with others";
		}else if(perso==4) {
			name="Faroudja";
			try {
				faroudja=ImageIO.read(new File("src/Pictures/Farouja_button.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else if(perso==5) {
			name="Patrick";
			try {
				patrick=ImageIO.read(new File("src/Pictures/Patrick_button.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			particularskill="he is unconscious, he will always attack monster";
		}else if(perso==6) {
			name="Rocky";
			try {
				rocky=ImageIO.read(new File("src/Pictures/Rocky_button.png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
			particularskill="he is very noisy,\n monster will spot from further away";
		}else if(perso==7) {
			name="Rosa";
			try {
				rosa=ImageIO.read(new File("src/Pictures/Rosa_button.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			particularskill="she is a leader,\n she can communicate from further away";
		}else {
			name="Sonic";
			try {
				sonic=ImageIO.read(new File("src/Pictures/Sonic_button.png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void paintComponent(Graphics g) {
	    int t1=0,t2=0,t3=0,t4=0,t5=0; 
	    String c1="",c2="",c3="",c4="",c5="";
		Font fonttitle = new Font("Title", Font.BOLD, 40);
	    g.setFont(fonttitle);
	    g.setColor(GParameter.BLACK);
	    g.drawString(name, width/15, heigh/20);
		Font power = new Font("Name", Font.BOLD, 20);
		g.setFont(power);
	    g.drawString("Strengh", width/6-width/100, heigh/7);
	    g.drawString("Agility", width/6-width/100, heigh/7+heigh/15);
	    g.drawString("Vitality", width/6-width/100, heigh/7+(heigh/15)*2);
	    g.drawString("Intelligence", width/6-width/100, heigh/7+(heigh/15)*3);
	    g.drawString("Luck", width/6-width/100, heigh/7+(heigh/15)*4);
	    g.drawString("Particular skill", width/6-width/100, heigh/7+(heigh/15)*5);
	    g.drawString(particularskill , width/50, heigh/7+(heigh/15)*6+heigh/30);
		Graphics2D g1 = (Graphics2D) g;
		BasicStroke line = new BasicStroke(10);
		g1.setStroke(line);
		if (perso==0) {
			g.drawImage(arya, 0, heigh/20, width/6, heigh/2, this);
			t1=verysmall;
			t2=tall;
			t3=medium;
			t4=tall;
			t5=small;
			c1=s;
			c2=t;
			c3=m;
			c4=t;
			c5=s;
		}else if(perso==1) {
			g.drawImage(bob, 0, heigh/20, width/6, heigh/2, this);
			t1=verysmall;
			t2=t3=t4=medium;
			t5=tall;
			c1=vs;
			c2=c3=c4=m;
			c5=t;
		}else if(perso==2) {
			g.drawImage(babouche, 0, heigh/20, width/6, heigh/2, this);
			t1=verysmall;
			t2=small;
			t3=t5=tall;
			t4=medium;
			c1=vs;
			c2=s;
			c3=c5=t;
			c4=m;
		}else if(perso==3) {
			g.drawImage(daryl, 0, heigh/20, width/6, heigh/2, this);
			t1=t2=t3=tall;
			t4=t5=medium;
			c1=c2=c3=t;
			c4=c5=m;
		}else if(perso==4) {
			g.drawImage(faroudja, 0, heigh/20, width/6, heigh/2, this);
			t1=t3=medium;
			t2=small;
			t4=tall;
			t5=verysmall;
			c1=c3=m;
			c2=s;
			c4=t;
			c5=vs;
		}else if(perso==5) {
			g.drawImage(patrick, 0, heigh/20, width/6, heigh/2, this);
			t1=t3=tall;
			t2=t4=verysmall;
			t5=medium;
			c1=c3=t;
			c2=c4=vs;
			c5=m;
		}else if(perso==6) {
			g.drawImage(rocky, 0, heigh/20, width/6, heigh/2, this);
			t1=t3=t5=tall;
			t2=t4=verysmall;
			c1=c3=c5=t;
			c2=c4=vs;
		}else if(perso==7) {
			g.drawImage(rosa, 0, heigh/20, width/6, heigh/2, this);
			t1=small;
			t2=t5=verysmall;
			t3=t4=medium;
			c1=s;
			c2=c5=vs;
			c3=c4=m;
		}else {
			g.drawImage(sonic, 0, heigh/20, width/6, heigh/2, this);
			t1=t4=small;
			t2=t3=tall;
			t5=medium;
			c1=c4=s;
			c2=c3=t;
			c5=m;
		}
	    g.drawString(c1, width/4-width/500, heigh/7);
	    g.drawString(c2, width/4-width/500, heigh/7+heigh/15);
	    g.drawString(c3, width/4-width/500, heigh/7+(heigh/15)*2);
	    g.drawString(c4, width/4-width/500, heigh/7+(heigh/15)*3);
	    g.drawString(c5, width/4-width/500, heigh/7+(heigh/15)*4);
		g1.setColor(Color.RED);
		g1.drawLine(width/6, heigh/6, t1, heigh/6);
	    g1.setColor(GParameter.BLEUCOBALT);
		g1.drawLine(width/6, heigh/6+heigh/15, t2, heigh/6+heigh/15);
		g1.setColor(GParameter.AVOCADO);
		g1.drawLine(width/6, heigh/6+(heigh/15)*2, t3, heigh/6+(heigh/15)*2);
		g1.setColor(GParameter.VIOLET);
		g1.drawLine(width/6, heigh/6+(heigh/15)*3, t4, heigh/6+(heigh/15)*3);
		g1.setColor(GParameter.BANANA);
		g1.drawLine(width/6, heigh/6+(heigh/15)*4, t5, heigh/6+(heigh/15)*4);
	}
	public void init() {
		dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    heigh=(int) dimension.getHeight();
	    width=(int) dimension.getWidth();
		this.setBounds(width/2+width/8,heigh/4 , width/2, heigh);
		this.setLayout(null);
		this.setVisible(true);
		this.setBackground(GParameter.BLACK);
	    butadd.setBounds(width/30, heigh/2+heigh/10, width/4, heigh/10);
	    butadd.setVisible(true);
	    butadd.setText("click to add explorer");
	    butadd.setLayout(null);
	    butadd.setOpaque(false);
	    butadd.setBackground(GParameter.SABLE);
		this.add(butadd);
		verysmall=width/5-width/40;
		small=width/5;
		medium=width/4;
		tall=width/4+width/25;
		vs="10";
		s="25";
		m="50";
		t="90";
	}	
}
