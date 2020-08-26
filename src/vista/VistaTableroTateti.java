package vista;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VistaTableroTateti extends javax.swing.JFrame{
	private static final long serialVersionUID = 1L;

	/**
     * @author Perez Martin
     * Github: https://github.com/MartinPerez23
     * 
     */
	
	public VistaTableroTateti(String titulo) {
        super(titulo);
        initComponents();
        setLocationRelativeTo(null);
        // Para centrar la ventana con respecto a la pantalla
	}
	
	public void reiniciarTablero() {
		for (JButton boton : botones) {
			boton.setText("_");
		}
    }
    
    public void clickEnBoton(ActionListener al) {
        for (JButton boton : botones) {
        	boton.addActionListener(al);	
		}
        
    }

    public String lecturaTextoEnBoton(ActionEvent ae){
    	
    	for (JButton boton : botones) {
    		if(ae.getSource() == boton) {
    			return boton.getText();
    		}
		}
    	this.mostrarMensajeError("Error!");
    	return null;
    }
    
    public void escrituraTextoEnBoton(ActionEvent ae, String letra){
    	for (JButton boton : botones) {
    		if(ae.getSource() == boton) {
    			boton.setText(letra);
    		}
		}
    }
    
    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje);
    }

    public void mostrarMensajeError(String mensaje) {
        JOptionPane.showMessageDialog(this, mensaje, "ERROR", JOptionPane.ERROR_MESSAGE);
    }
    
    public JButton[] getBotones() {
    	return botones;
    }
	
	private void initComponents() {
		
		//creo el tablero del tateti
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        
        Container cp = getContentPane();
        
        cp.setLayout(new GridLayout(3,3));
        
        //creo botones y los agrego al tablero
        for(int i=0;i<botones.length;i++)
        {
        botones[i] = new JButton();
        botones[i].setBackground(new Color(0,255,0));
        botones[i].setFont(new java.awt.Font("Tahoma", 0, 70));

        	botones[i].setText("_");
             
        cp.add(botones[i]);
        }
	}
	
	//variables
	JButton botones[] = new JButton[9]; 
}



