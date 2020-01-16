package gui;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JButton;

public class Button extends JButton implements MouseListener{

	private Image but ;

	
	public Button() {

		try {
			but = ImageIO.read(new File("src/Pictures/button.jpg")); 
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.addMouseListener(this);
	}
	
	@Override
	public void paintComponents(Graphics g) {
		g.drawImage(but, 0, 0, this.getWidth(), this.getHeight(), this);
	}
	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
