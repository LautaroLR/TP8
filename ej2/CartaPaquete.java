package ej2;

public class CartaPaquete extends Envio{
	
	private String destinatario;
	private String destino;
	private String remitente;
	private String retiro;
	private double peso;
	
	public CartaPaquete (String destinatary, String remmit, String destin, String retire, double weight) {
		super();
		this.destinatario = destinatary;
		this.remitente = remmit;
		this.retiro = retire;
		this.peso = weight;
		this.destino = destin;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getRetiro() {
		return retiro;
	}

	public void setRetiro(String retiro) {
		this.retiro = retiro;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public boolean equals(Object obj) {
	    return (this.getTracking()==((Envio)obj).getTracking());
	}
	
	public String toString () {
		return "[Tracking: "+this.getTracking()+" - Remitente: "+this.getRemitente()+" - Peso: "+this.getPeso()+" - Destino: "+this.getDestino()+" - Destinatario: "+this.getDestinatario()+"]";
	}
	
	public String getDestino() {
		return destino;
	}
	
	public void setDestino(String destino) {
		this.destino = destino;
	}
}
