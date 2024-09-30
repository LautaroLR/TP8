package ej5;

import java.util.ArrayList;

public class Pregunta extends Evaluacion {
	//Atts de instancia
	private String enunciado;
	private int puntos;
	private int tiempoEstimado;
	private ArrayList<String> conceptos;
	
	//builder
	public Pregunta(String enunciado, int puntos, int tiempoEstimado) {
		super();
		this.enunciado = enunciado;
		this.puntos = puntos;
		this.tiempoEstimado = tiempoEstimado;
		this.conceptos = new ArrayList<>();
	}

	//accesores y mutadores
	
	
	@Override
	public int getPuntaje() {
		return this.puntos;
	}

	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	public void setTiempoEstimado(int tiempoEstimado) {
		this.tiempoEstimado = tiempoEstimado;
	}

	@Override
	public int getTiempoEstimado() {
		return this.tiempoEstimado;
	}

	@Override
	public ArrayList<String> getConceptos() {
		return new ArrayList<String>(conceptos);
	}
	
	//métodos de instancia
	public void addConceptos (String con) {
		if (!conceptos.contains(con)) {
			conceptos.add(con);
		}
	}
	

}
