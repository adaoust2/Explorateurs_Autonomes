package process.actions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import data.DataRepository;
import data.Explorer;
import data.GParameter;

public class InfoActions implements MouseListener, MouseMotionListener {
	
	
	private DataRepository dataRepository = DataRepository.getInstance();
	private ArrayList<Explorer> listOfExplorer;
	private Explorer exp;
	
	public InfoActions(){
		listOfExplorer =  dataRepository.getListOfExplorer();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent e) {

		if(!listOfExplorer.isEmpty()){
			for(int i=0;i<listOfExplorer.size();i++){
				exp = listOfExplorer.get(i);
				System.out.println(exp.getName());
				System.out.println(exp.getPosX());
				System.out.println(exp.getPosY());
				if((e.getX()>=(int)exp.getPosX() && e.getX()<=(int)exp.getPosX()+GParameter.DIM_X) && (e.getY()>=(int)exp.getPosY() && e.getY()<=(int)exp.getPosY()+GParameter.DIM_Y)){
					System.out.println("true");
					GParameter.updateInfos = true;
					GParameter.currentExp = exp;
				}
			}
		}
	}

	@Override
	public void mousePressed(MouseEvent e){}

	@Override
	public void mouseReleased(MouseEvent e){}

	@Override
	public void mouseEntered(MouseEvent e){}

	@Override
	public void mouseExited(MouseEvent e){}

}
