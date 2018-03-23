import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class principal extends JFrame{
	
	private panelCuadro PnlCuadro;
	
	public principal(){
		
		setTitle("Examen Unidad 1");
		setSize(600,350);
		//setResizable(false);
		setBackground(Color.GRAY);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		PnlCuadro = new panelCuadro(null);
		add(PnlCuadro);
	}
	
	public static void main (String[] args){
		principal vnt = new principal();
		vnt.setVisible(true);
	}

}
