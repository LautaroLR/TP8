package ej5;

import java.util.ArrayList;

public abstract class UnidadEvaluacion extends Evaluacion {
	protected ArrayList<Evaluacion> elementos;

	public UnidadEvaluacion () {
		this.elementos=new ArrayList<Evaluacion>();
	}
	@Override
	public abstract int getPuntaje();
	
	public void add(Evaluacion ee) {
		if (!elementos.contains(ee)) {
			elementos.add(ee);
		}
	}

	@Override
	public abstract int getTiempoEstimado();

	@Override
	public ArrayList<String> getConceptos() {
		ArrayList<String> conceptosTotales = new ArrayList<>();
		for (Evaluacion ee:elementos) {
			ArrayList<String> cc = ee.getConceptos();
			for (String concepto:cc) {
				if (!conceptosTotales.contains(concepto)) {
					conceptosTotales.add(concepto);
				}
			}
		}
		return conceptosTotales;
	}

}
