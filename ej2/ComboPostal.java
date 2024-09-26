package ej2;

import java.util.ArrayList;

public class ComboPostal extends Envio{
	ArrayList <Envio> elementos;
	
	public ComboPostal () { 
		super();
		this.elementos=new ArrayList<>();
	}
	
	public double getPeso() {
		double peso=0.0;
		for(Envio aa:elementos) {
			peso+=aa.getPeso();
		}
		return peso;
	}
	
	public String getDestinatario () {
		return elementos.get(0).getDestinatario();
	}
	public void setDestinatario (String dd) {
		for (Envio ee:elementos) {
			ee.setDestinatario(dd);
		}
	}

	public String getRemitente() {
		return elementos.get(0).getRemitente();
	}
	
	public void setTracking (int tracking) {
		for (Envio ee:elementos) {
			ee.setTracking(tracking);
		}
	}
	
	public void add(Envio aa) {
		if(!elementos.contains(aa)) {
			if(!elementos.isEmpty()) {
				aa.setDestino(elementos.get(0).getDestino());
			}
			aa.setTracking(this.getTracking());
			this.elementos.add(aa);
		}
	}
	
	public String toString () {
		return this.elementos.toString();
	}
	public void setDestino(String destino) {
		for (Envio ee:elementos) {
			ee.setDestino(destino);
		}
	}
	public String getDestino() {
		if (!elementos.isEmpty()) {
			return elementos.get(0).getDestino();
		}
		return null;
	}
}
