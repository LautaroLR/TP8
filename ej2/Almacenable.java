package ej2;

public abstract class Almacenable {
	public abstract int cantQuePiden(String regalo); 
	public abstract int getCantCartas();
	public abstract int cantNiniosMalos();
	public double porcentajeQuePide(String regalo) {
		return (double)((this.cantQuePiden(regalo)/this.getCantCartas())*100);
	}
}
