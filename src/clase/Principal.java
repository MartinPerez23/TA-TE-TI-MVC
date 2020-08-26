package clase;

import controlador.Controlador;
import modelo.Tateti;
import vista.VistaTableroTateti;

public class Principal {
	public static void main(String[] args) {

		/**
	     * @author Perez Martin
	     * Github: https://github.com/MartinPerez23
	     * 
	     */
		
	VistaTableroTateti vista = new VistaTableroTateti("TA-TE-TI");
    Tateti tateti = new Tateti();
    Controlador c = new Controlador(vista, tateti);
    c.iniciar();
    
	}    
}
