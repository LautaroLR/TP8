package ej5;

import java.util.ArrayList;

public class UnidadEvaluativaSecuencial extends UnidadEvaluacion {

	
	public UnidadEvaluativaSecuencial() {
		super();
	}
	@Override
	public int getPuntaje() {
		int puntaje=0;
		for(Evaluacion ee:elementos) {
			puntaje+=ee.getPuntaje();
		}
		return puntaje;
	}

	@Override
	public int getTiempoEstimado() {
		int tiempoEstimado=0;
		for(Evaluacion ee:elementos) {
			tiempoEstimado+=ee.getTiempoEstimado();
		}
		return tiempoEstimado;
	}

}
