package ej2;

import java.util.ArrayList;

public class Buzon extends Almacenable{
	//constantes de clase
	private static final String REGALONINIOSMALOS = "Trozo de carbón";
	//attributes
	private ArrayList<Integer> niniosBuenos;
	private ArrayList<Carta> cartas;
	//builder
	public Buzon () {
		this.cartas=new ArrayList<>();
		this.niniosBuenos=new ArrayList<>();
	}
	//métodos de instancia
	public boolean esNinioBueno(int remitente) {
		return this.niniosBuenos.contains(remitente);
	}
	public void addNinioBueno(int dni) {
		if(!niniosBuenos.contains(dni)) {
			this.niniosBuenos.add(dni);
		}
	}
	public boolean haEnviado(int remitente) {
		boolean haEnviado=false;
		for (Carta cc:cartas) {
			if (cc.getRemitente()==remitente) {
				haEnviado=true;
				return haEnviado;
			}
		}
		return haEnviado;
	}
	
	public void addCarta(Carta cc) {
		if(!haEnviado(cc.getRemitente())) {
			if(esNinioBueno(cc.getRemitente())) {
				this.cartas.add(cc);
			}else {
				cc.vaciarRegalos();
				cc.addRegalo(REGALONINIOSMALOS);
				this.cartas.add(cc);
			}
		}
	}

	@Override
	public int cantQuePiden(String regalo) {
		int cantidad=0;
		for (Carta cc:cartas) {
			if (cc.pidioRegalo(regalo)){
				cantidad++;
			}
		}
		return cantidad;
	}

	@Override
	public int getCantCartas() {
		return this.cartas.size();
	}

	@Override
	public double porcentajeQuePide(String regalo) {
		return (double)((this.cantQuePiden(regalo)/this.getCantCartas())*100);
	}

	@Override
	public int cantNiniosMalos() {
		return this.cantQuePiden(REGALONINIOSMALOS);
	}

}
