package ej2;

import java.util.ArrayList;

public class Carta {
	//ATT DE INSTANCIA
	private int remitente;
	private ArrayList<String> regalos;
	
	//BUILDER
	public Carta (int remit) {
		this.remitente=remit;
		this.regalos=new ArrayList<>();
	}
	//INSTANCE METHODS :)
	public int getRemitente() {return this.remitente;};
	
	public void setRemitente(int remit) {this.remitente=remit;};
	
	public void addRegalo(String regalo) {this.regalos.add(regalo);};
	
	public ArrayList<String> getRegalos() {return new ArrayList<>(regalos);};
	
	public void vaciarRegalos() {this.regalos=new ArrayList<>();};
	
	public boolean pidioRegalo(String regalo) {return this.regalos.contains(regalo);};
	
}
