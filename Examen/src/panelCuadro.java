import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelCuadro extends JPanel  {
	
	private principal Principal;
	
	//Atributos
	private JButton btnConvertir;
    private JTextField txtSegundos;
    private JTextField txtResultado;
 
    private JLabel lblResultado; 
    private JLabel lblNumero;
    
    public panelCuadro(principal p){
    	
    	Principal = p;
    	setLayout(new GridLayout(3,3));
    	setPreferredSize(new Dimension(0,350));
		setBackground(Color.GRAY);
		
		TitledBorder border = BorderFactory.createTitledBorder("Ingrese la cantidad de segundos que quieres convertir");
		border.setTitleColor(Color.BLACK);
		setBorder(border);
		
		
		lblResultado = new JLabel("Equivale a: ");
		lblNumero = new JLabel ("Numero: ");
		btnConvertir = new JButton("Convertir");
		txtSegundos = new JTextField();
		txtResultado = new JTextField();
		
		txtResultado.setEditable(false);
		
		
		add(lblNumero);add(txtSegundos);add(new JLabel(""));	
		add(new JLabel(""));add(btnConvertir);add(new JLabel(""));
	
		add(lblResultado);
		add(txtResultado);
		
		//Creacion de oyente
		Accionbtn oyentebtnAceptar = new Accionbtn();
		
		//vincular oyente al componente
		btnConvertir.addActionListener(oyentebtnAceptar);
    	
    }
    
    class Accionbtn implements ActionListener{

        @Override
        //Método controlador del evento actionPerformed
        public void actionPerformed(ActionEvent e) {        	
        	//String Resultado= Double.toString();
            JOptionPane.showMessageDialog(null, "Conversion Resuelta", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }


}
