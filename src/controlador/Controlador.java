package controlador;	

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Tateti;
import vista.VistaTableroTateti;

public class Controlador {

	/**
     * @author Perez Martin
     * Github: https://github.com/MartinPerez23
     * 
     */
	
	//variables
    private VistaTableroTateti vista;
    private Tateti tateti;
	
    //constructor
	public Controlador(VistaTableroTateti vista, Tateti tateti) {
        this.vista = vista;
        this.tateti = tateti;
    }
	//metodos
	public void iniciar() {
			this.vista.clickEnBoton(new ClickEnBoton());
	        this.vista.setVisible(true);
	    }
	//controla si hay ganador o empate
	private void verificarJuego() {
		
		if(tateti.hayGanador(vista.getBotones()) || tateti.getTurno() == 9) {
			if(tateti.getTurno()==9){
				vista.mostrarMensaje("Empate");
				vista.reiniciarTablero();
				tateti.reiniciarTurnos();
			}
			else if(tateti.getTurno() %2 == 1) {
				vista.mostrarMensaje("Gano X");
				vista.reiniciarTablero();
				tateti.reiniciarTurnos();
			}
			else if(tateti.getTurno() %2 == 0){
				vista.mostrarMensaje("Gano 0");
				vista.reiniciarTablero();
				tateti.reiniciarTurnos();
			}
		
		}
	}
	
////////////////////////LISTENERS ////////////////////////////////
	
	private class ClickEnBoton implements ActionListener {
		
		@Override
		public void actionPerformed(ActionEvent ae) {
			//si el boton no esta ocupado
			if(!vista.lecturaTextoEnBoton(ae).equals("X") && !vista.lecturaTextoEnBoton(ae).equals("O"))
			{
				//si el turno es PAR pone una X sino una O
				if(tateti.getTurno()%2 == 0) {
					vista.escrituraTextoEnBoton(ae, "X");
					tateti.sumarTurno();
				}else {
					vista.escrituraTextoEnBoton(ae, "O");
					tateti.sumarTurno();
				}							
				//controla si hay ganador o empate
				verificarJuego();
				
			}
			else
			{
				//boton ocupado con X o O
				vista.mostrarMensaje("Lugar ocupado!");					
			}
					
		}
	}

} //cierre controlador

