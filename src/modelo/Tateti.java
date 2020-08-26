package modelo;

import javax.swing.JButton;

public class Tateti {

	/**
     * @author Perez Martin
     * Github: https://github.com/MartinPerez23
     * 
     */
	
	//variables
	public int turno = 0;
	//metodos
	public void reiniciarTurnos() {
		
		turno = 0;
	}
	
	public int getTurno() {
		return turno;
	}
	
	public void sumarTurno() {
		turno++;
	}
	
	//un metodo que verifica si hay ganador
	public boolean hayGanador(JButton botones[])

	{
		if((botones[0].getText() == botones[1].getText()) && ((botones[0].getText() == botones[2].getText())) && (botones[0].getText() != "_"))
		{
			return true;
		}
		
		if((botones[3].getText() == botones[4].getText()) && ((botones[4].getText() == botones[5].getText())) && (botones[5].getText() != "_"))
		{
			return true;
		}
		
		if((botones[6].getText() == botones[7].getText()) && ((botones[7].getText() == botones[8].getText())) && (botones[8].getText() != "_"))
		{
			return true;
		}
		
		if((botones[0].getText() == botones[3].getText()) && ((botones[3].getText() == botones[6].getText())) && (botones[6].getText() != "_"))
		{
			return true;
		}
		
		if((botones[1].getText() == botones[4].getText()) && ((botones[4].getText() == botones[7].getText())) && (botones[7].getText() != "_"))
		{
			return true;
		}
		
		if((botones[2].getText() == botones[5].getText()) && ((botones[5].getText() == botones[8].getText())) && (botones[8].getText() != "_"))
		{
			return true;
		}
		
		if((botones[0].getText() == botones[4].getText()) && ((botones[4].getText() == botones[8].getText())) && (botones[8].getText() != "_"))
		{
			return true;		
		}
		if((botones[2].getText() == botones[4].getText()) && ((botones[4].getText() == botones[6].getText())) && (botones[6].getText() != "_"))
		{
			return true;
		}
		
		return false;
		
	}
}
