package ej5;

public class UnidadEvaluativaOptativa extends UnidadEvaluacion {

	public UnidadEvaluativaOptativa() {
		super();
	}
	@Override
	public int getPuntaje() {
		int mayor=0;
		for(Evaluacion ee:elementos) {
			if (ee.getPuntaje()>mayor) {
				mayor=ee.getPuntaje();
			}
		}
		return mayor;
	}

	@Override
	public int getTiempoEstimado() {
		int tiempoMayor=0;
		for(Evaluacion ee:elementos) {
			if (ee.getTiempoEstimado()>tiempoMayor) {
				tiempoMayor=ee.getTiempoEstimado();
			}
		}
		return tiempoMayor;
	}

}
