
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{

    private JButton btnConvertir;
    private JTextField txtSegundos;
    private JTextField txtResultado;
   

    public Main(String titulo) {
        this.setTitle(titulo);
        this.setResizable(false);
        this.setLayout(null);

        Container panel = this.getContentPane();
        panel.setBackground(Color.GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JLabel lblMensaje = new JLabel("Ingrese la cantidad de segundos que quieres convertir");
        lblMensaje.setBounds(10,0,320,30);
        panel.add(lblMensaje);
        
        JLabel lblResultado = new JLabel("Equivale a: ");
        lblResultado.setBounds(30,150,100,30);
        panel.add(lblResultado);

        
        JLabel lblNumero = new JLabel("Número: ");
        lblNumero.setBounds(30, 30, 100, 30);
        panel.add(lblNumero);

        txtSegundos = new JTextField();
        txtSegundos.setBounds(120, 30, 100, 30);
        panel.add(txtSegundos);
        
        txtResultado = new JTextField();
        txtResultado.setBounds(120, 150, 100, 30);
        txtResultado.setEditable(false);
        panel.add(txtResultado);

      

        

        //Creación de objetos que generan eventos
        btnConvertir = new JButton("Convertir");
        btnConvertir.setBounds(100, 90, 95, 30);
        panel.add(btnConvertir);

        

        //Creación de oyentes
        AccionBoton oyenteBtnAceptar = new AccionBoton();
        

        //Vincular oyente al componente
        btnConvertir.addActionListener(oyenteBtnAceptar);
        
    }


    public static void main(String[] args)
    {
        Main E = new Main("Examen Unidad 1");
        E.setSize(350,300);
        E.setLocation(200,100);
        

        E.setVisible(true);
    }

    class AccionBoton implements ActionListener{

        @Override
        //Método controlador del evento actionPerformed
        public void actionPerformed(ActionEvent e) {
            System.out.println("Presionaste un botón " + ((JButton) e.getSource()).getText());
            JOptionPane.showMessageDialog(null, "Conversion Resuelta", "Resultado", JOptionPane.INFORMATION_MESSAGE);
            
        }
    }
    
   // class
} 





