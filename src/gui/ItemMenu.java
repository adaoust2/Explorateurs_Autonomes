package gui;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import data.GParameter;

public class ItemMenu extends JPanel implements ActionListener{

	
	private Dimension dimension;
	private int width,heigh,hauteur,largeur,largeur1,largeur2,largeur3,largeur4;
	private int hauteur1,hauteur2,hauteur3,hauteur4,hauteur5;
	private int compteur=0;
	private Image back,marchant,imglance,imgarc,imggun,imgtalkie,imgradio;
	private Image rect;
	private Button lance = new Button();
	private Button arc = new Button();
	private Button pistolet = new Button();
	private Button talkie = new Button();
	private Button radio = new Button();
	private Button butsuiv = new Button();
	private int argent;
	
	
	public ItemMenu(int argent) {
		this.argent=argent;
		init();
	}
	public void init() {
		dimension = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    heigh=(int) dimension.getHeight();
	    width=(int) dimension.getWidth();
		this.setBounds(0,0 , width, heigh);
		this.setLayout(null);
		this.setVisible(true);
		back=Menu.getHashBuffImage().get(GParameter.SELECMENU);
		rect=Menu.getHashBuffImage().get("rectangle.png");
		marchant=Menu.getHashBuffImage().get("marchant2.png");
		imglance=Menu.getHashBuffImage().get("lance.png");
		imgarc=Menu.getHashBuffImage().get("bow2.png");
		imggun=Menu.getHashBuffImage().get("gun.png");
		imgradio=Menu.getHashBuffImage().get("radio.png");
		imgtalkie=Menu.getHashBuffImage().get("talkie2.png");
		Font power = new Font("Name", Font.BOLD, 15);
		lance.setForeground(GParameter.WHITE);
		lance.setBounds(width/7, heigh/3+heigh/70, width/5, heigh/10);
		lance.setFont(power);
	    lance.setVisible(true);
	    lance.setText("Spear : price : 100 Strengh +20");
	    lance.setLayout(null);
	    lance.setBorder(null);
	    lance.setOpaque(false);
	    lance.setBackground(GParameter.SABLE);
	    lance.addActionListener(this);
	    this.add(lance);
	    arc.setBounds(width/7, heigh/3+heigh/9, width/5+width/30, heigh/10);
	    arc.setForeground(GParameter.WHITE);
	    arc.setVisible(true);
	    arc.setText("Bow : price : 200 can attack from distance");
	    arc.setLayout(null);
	    arc.setBorder(null);
	    arc.setOpaque(false);
	    arc.setBackground(GParameter.SABLE);
	    arc.addActionListener(this);
	    this.add(arc);
	    pistolet.setBounds(width/7, heigh/3+heigh/5, width/5, heigh/10);
	    pistolet.setForeground(GParameter.WHITE);
	    pistolet.setVisible(true);
	    pistolet.setText("Gun : price : 600 one shot");
	    pistolet.setLayout(null);
	    pistolet.setBorder(null);
	    pistolet.setOpaque(false);
	    pistolet.setBackground(GParameter.SABLE);
	    pistolet.addActionListener(this);
	    this.add(pistolet);
	    talkie.setBounds(width/8+width/100, heigh/2+heigh/8, width/4, heigh/10);
	    talkie.setForeground(GParameter.WHITE);
	    talkie.setVisible(true);
	    talkie.setFont(power);
	    talkie.setText("Talkie : price : 200 communication between 2 exploreur");
	    talkie.setLayout(null);
	    talkie.setBorder(null);
	    talkie.setOpaque(false);
	    talkie.setBackground(GParameter.SABLE);
	    talkie.addActionListener(this);
	    this.add(talkie);
	    radio.setBounds(width/7, heigh/2+heigh/5+heigh/70, width/4, heigh/10);
	    radio.setForeground(GParameter.WHITE);
	    radio.setVisible(true);
	    radio.setText("Radio : price : 400 communication  all exploreur");
	    radio.setLayout(null);
	    radio.setBorder(null);
	    radio.setOpaque(false);
	    radio.setBackground(GParameter.SABLE);
	    radio.addActionListener(this);
	    this.add(radio);
	    butsuiv.setBounds(width/2+width/3, heigh/2+heigh/3-heigh/50, width/6, heigh/6);
	    butsuiv.setVisible(true);
	    butsuiv.setBorder(null);
	    butsuiv.setOpaque(false);
	    butsuiv.setBackground(GParameter.SABLE);
	    butsuiv.setIcon(new ImageIcon(Menu.getHashBuffImage().get("suivant.png")));
	    butsuiv.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
	    this.add(butsuiv);
		largeur=width/8-width/100;
		largeur1=width/8-width/500;
		largeur2=width/8-width/100;
		largeur3=width/8-width/60;
		largeur4=width/8-width/100;
		hauteur1=heigh/3+heigh/70;
		hauteur2=heigh/3+heigh/9;
		hauteur3=heigh/3+heigh/5;
		hauteur4=heigh/2+heigh/8;
		hauteur5=heigh/2+heigh/5+heigh/70;
	}
	public void paintComponent(Graphics g) {

		g.drawImage(back, 0, 0, width, heigh, this);

		g.drawImage(rect, width/10, heigh/3, width/4+width/20, heigh/2, this);
		g.drawImage(rect, width/2+width/8, heigh/3, width/4+width/20, heigh/2, this);
		g.drawImage(marchant , width/4, heigh/3+heigh/12, width/2, heigh/2+heigh/5, this);
		g.drawImage(imglance, largeur,hauteur1 , width/20, heigh/10, this);
		g.drawImage(imgarc,largeur1 , hauteur2, width/30, heigh/10, this);
		g.drawImage(imggun, largeur2,hauteur3 , width/20, heigh/10, this);
		g.drawImage(imgtalkie, largeur3,hauteur4 , width/20, heigh/12, this);
		g.drawImage(imgradio, largeur4, hauteur5, width/20, heigh/12, this);
		Font fonttitle = new Font("Title", Font.BOLD, 50);
	    g.setFont(fonttitle);
	    g.setColor(GParameter.WHITE);
		g.drawString("Money left :" + argent, width/3, heigh/3);
	    g.drawString("Welcome to the shop my freinds", 500, 150);
	    g.drawString("Take care and choose your item for your adventures", 250, 250);
	    
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		hauteur=countHeigh(compteur);		
	    if (e.getSource()==lance && argent >  99) {
	    	hauteur1=hauteur;
	    	largeur=width/2+width/7;
	    	argent=argent-100;
	    	this.repaint();
		    lance.setVisible(false);
	    	lance.setBounds(width/2+width/6,hauteur , width/5, heigh/10);
	    	lance.setVisible(true);
	    	compteur++;
	    }else if(e.getSource()==arc && argent >  199) {
	    	hauteur2=hauteur;
	    	largeur1=width/2+width/7;
	    	argent=argent-200;
	    	this.repaint();
		    arc.setVisible(false);
	    	arc.setBounds(width/2+width/6,hauteur , width/5, heigh/10);
	    	arc.setVisible(true);
	    	compteur++;
	    }else if(e.getSource()==pistolet && argent >  599) {
	    	hauteur3=hauteur;
	    	largeur2=width/2+width/7;
	    	argent=argent-600;
	    	this.repaint();
		    pistolet.setVisible(false);
	    	pistolet.setBounds(width/2+width/6,hauteur , width/5, heigh/10);
	    	pistolet.setVisible(true);
	    	compteur++;
	    }else if(e.getSource()==talkie && argent >  199) {
	    	hauteur4=hauteur;
	    	largeur3=width/2+width/7;
	    	argent=argent-200;
	    	this.repaint();
		    talkie.setVisible(false);
		    talkie.setBounds(width/2+width/6,hauteur , width/4, heigh/10);
		    talkie.setVisible(true);
	    	compteur++;
	    }else if (e.getSource()==radio && argent >  399) {
	    	hauteur5=hauteur;
	    	largeur4=width/2+width/7;
	    	argent=argent-400;
	    	this.repaint();
		    radio.setVisible(false);
		    radio.setBounds(width/2+width/6,hauteur , width/4, heigh/10);
		    radio.setVisible(true);
	    	compteur++;
	    }
		
	}
	public int countHeigh(int compteur) {
		if (compteur==0) {
			hauteur=heigh/3+heigh/70;
			return hauteur;
		}else if(compteur == 1) {
			hauteur=heigh/3+heigh/9;
			return hauteur;
		}else if(compteur == 2) {
			hauteur=heigh/3+heigh/5;
			return hauteur;
		}else if(compteur == 3) {
			hauteur=heigh/2+heigh/8;
			return hauteur;
		}else {
			hauteur=heigh/2+heigh/5+heigh/70;
			return hauteur;
		}
	}
}
