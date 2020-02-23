package gui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

import data.Explorer;
import data.GParameter;

public class SkillsMenu extends JPanel implements ActionListener{
	private Button butadd = new Button();
	private Button butsuiv = new Button();
	private Dimension dimension;
	private int width,heigh,perso,persos,verysmall,small,medium,tall,money;
	private String vs,s,m,t;
	private Image arya,bob,babouche,daryl,faroudja,patrick,rocky,rosa,sonic;
	private String name;
	private String particularskill ="";
	private ArrayList<Explorer> explo = new ArrayList<Explorer> ();
	private Explorer exarya,exbob,exBabouche,exDaryl,exFaroudja,exPatrick,exRocky,exRosa,exSonic ;
	private ItemMenu it;


	public SkillsMenu(int perso) {
		this.perso=perso;
		money=1000;
		init();
		choice(perso);
	    
	}
	public void choice(int perso) {
		if(perso==0) {
			name="Arya";
			persos=0;
			particularskill="";
			arya=Menu.getHashBuffImage().get("Arya_button.png");
		}else if(perso==1) {
			name="Bob";
			persos=1;
			bob=Menu.getHashBuffImage().get("Bob_button.png");
			particularskill="can repare one item during the adventure";
		}else if(perso==2) {
			name="Babouche";
			persos=2;
			babouche=Menu.getHashBuffImage().get("Babouche_button.png");
			particularskill="he will always flee the fight but have a hudge reduction at the market";
		}else if(perso==3) {
			name="Daryl";
			persos=3;
			daryl=Menu.getHashBuffImage().get("Daryl_button.png");
			particularskill="he is solitary, he have trouble to communicate with others";
		}else if(perso==4) {
			name="Faroudja";
			persos=4;
			particularskill="";
			faroudja=Menu.getHashBuffImage().get("Farouja_button.png");
		}else if(perso==5) {
			name="Patrick";
			persos=5;
			particularskill="";
			patrick=Menu.getHashBuffImage().get("Patrick_button.png");
			particularskill="he is unconscious, he will always attack monster";
		}else if(perso==6) {
			name="Rocky";
			persos=6;
			particularskill="";
			rocky=Menu.getHashBuffImage().get("Rocky_button.png");
			particularskill="he is very noisy, monster will spot from further away";
		}else if(perso==7) {
			name="Rosa";
			persos=7;
			particularskill="";
			rosa=Menu.getHashBuffImage().get("Rosa_button.png");
			particularskill="she is a leader, she can communicate from further away";
		}else {
			name="Sonic";
			persos=8;
			particularskill="";
			sonic=Menu.getHashBuffImage().get("Sonic_button.png");
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
		g.drawString("Money left : "+money, width/5, heigh/20);
	    g.drawString("Strengh", width/6-width/100, heigh/7);
	    g.drawString("Agility", width/6-width/100, heigh/7+heigh/15);
	    g.drawString("Vitality", width/6-width/100, heigh/7+(heigh/15)*2);
	    g.drawString("Intelligence", width/6-width/100, heigh/7+(heigh/15)*3);
	    g.drawString("Luck", width/6-width/100, heigh/7+(heigh/15)*4);
	    g.drawString("Particular skill", width/6-width/100, heigh/7+(heigh/15)*5);
	    g.drawString(particularskill , 0, heigh/7+(heigh/15)*6+heigh/30);
		Graphics2D g1 = (Graphics2D) g;
		BasicStroke line = new BasicStroke(10);
		g1.setStroke(line);
		if (persos==0) {
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
			exarya = new Explorer("Arya", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==1) {
			g.drawImage(bob, 0, heigh/20, width/6, heigh/2, this);
			t1=verysmall;
			t2=t3=t4=medium;
			t5=tall;
			c1=vs;
			c2=c3=c4=m;
			c5=t;
			exbob = new Explorer("Bob", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==2) {
			g.drawImage(babouche, 0, heigh/20, width/6, heigh/2, this);
			t1=verysmall;
			t2=small;
			t3=t5=tall;
			t4=medium;
			c1=vs;
			c2=s;
			c3=c5=t;
			c4=m;
			exBabouche = new Explorer("Babouche", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==3) {
			g.drawImage(daryl, 0, heigh/20, width/6, heigh/2, this);
			t1=t2=t3=tall;
			t4=t5=medium;
			c1=c2=c3=t;
			c4=c5=m;
			exDaryl = new Explorer("Daryl", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==4) {
			g.drawImage(faroudja, 0, heigh/20, width/6, heigh/2, this);
			t1=t3=medium;
			t2=small;
			t4=tall;
			t5=verysmall;
			c1=c3=m;
			c2=s;
			c4=t;
			c5=vs;
			exFaroudja = new Explorer("Faroudja", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==5) {
			g.drawImage(patrick, 0, heigh/20, width/6, heigh/2, this);
			t1=t3=tall;
			t2=t4=verysmall;
			t5=medium;
			c1=c3=t;
			c2=c4=vs;
			c5=m;
			exPatrick = new Explorer("Patrick", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==6) {
			g.drawImage(rocky, 0, heigh/20, width/6, heigh/2, this);
			t1=t3=t5=tall;
			t2=t4=verysmall;
			c1=c3=c5=t;
			c2=c4=vs;
			exRocky = new Explorer("Rocky", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else if(persos==7) {
			g.drawImage(rosa, 0, heigh/20, width/6, heigh/2, this);
			t1=small;
			t2=t5=verysmall;
			t3=t4=medium;
			c1=s;
			c2=c5=vs;
			c3=c4=m;
			exRosa= new Explorer("Rosa", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
		}else {
			g.drawImage(sonic, 0, heigh/20, width/6, heigh/2, this);
			t1=t4=small;
			t2=t3=tall;
			t5=medium;
			c1=c4=s;
			c2=c3=t;
			c5=m;
			exSonic = new Explorer("Sonic", t3, GParameter.mapWidth*0.78, GParameter.mapHeight*0.85, t1, GParameter.mapWidth, GParameter.mapHeight);
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
	    butadd.setBounds(width/30, heigh/2+heigh/10, width/5, heigh/10);
	    butadd.setVisible(true);
	    butadd.setText("click to add explorer");
	    butadd.setLayout(null);
	    butadd.setOpaque(false);
	    butadd.setBackground(GParameter.SABLE);
	    butadd.addActionListener(this);
	    butsuiv.setBounds(width/4, heigh/2+heigh/10, width/10, heigh/10);
	    butsuiv.setVisible(true);
	    butsuiv.setBorder(null);
	    butsuiv.setOpaque(false);
	    butsuiv.setBackground(GParameter.SABLE);
	    butsuiv.setIcon(new ImageIcon(Menu.getHashBuffImage().get("suivant.png")));
	    butsuiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				ItemMenu it = new ItemMenu(money);
				Menu.getMenu().setContentPane(it);
				
			}
		});
	    this.add(butsuiv);
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
	public void setMoney(int n) {
		money=money-n;
	}
	public void actionPerformed(ActionEvent e) {
		this.setVisible(false);
		this.repaint();
		this.setVisible(true);
		setMoney(200);

		
		switch (persos) {
		case 0:
			explo.add(exarya);
			break;
		case 1:
			explo.add(exbob);
			break;
		case 2:
			explo.add(exBabouche);
			break;
		case 3:
			explo.add(exDaryl);
			break;
		case 4:
			explo.add(exFaroudja);
			break;
		case 5:
			explo.add(exPatrick);
			break;
		case 6:
			explo.add(exRocky);
			break;
		case 7:
			explo.add(exRosa);
			break;
		case 8:
			explo.add(exSonic);
			break;
		default:
			break;
		}

	}
	public ItemMenu getIt() {
		return it;
	}
	
}
