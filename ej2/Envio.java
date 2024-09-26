package ej2;

public abstract class Envio {
	
	private static int ID=0;
	private int tracking;
	
	public Envio () {
		ID ++;
		this.tracking=ID;
	}
	
	public abstract double getPeso();
	public abstract String getDestinatario();
	public abstract void setDestinatario(String destinatario);
	public abstract String getRemitente();
	public abstract String getDestino();
	public abstract void setDestino(String destino); 
	
	public void setTracking (int track) {
		this.tracking=track;
	}
	
	public int getTracking () {
		return tracking;
	}
}
