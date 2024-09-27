package ej3;

import java.util.ArrayList;

public class Barco extends Miembro {
	// atts
	ArrayList<Miembro> tripulacion;

	// builder
	public Barco(String nombre) {
		super(nombre);
		this.tripulacion = new ArrayList<>();
	}

	@Override
	public int getFuerza() {
		int fuerza = 0;
		for (Miembro mm : tripulacion) {
			fuerza += mm.getFuerza();
		}
		return fuerza;
	}

	@Override
	public double getPeso() {
		if (!tripulacion.isEmpty()) {
			return tripulacion.get(0).getPeso();
		}
		return 0;
	}

	@Override
	public int getEdad() {
		int mayor=0;
		for (Miembro mm:tripulacion){
			if (mm.getEdad()>mayor) {
				mayor=mm.getEdad();
			}
		}
		return mayor;
	}

}
