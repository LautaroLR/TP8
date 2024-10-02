package ej2;

import java.util.ArrayList;

public class Lugar extends Almacenable{
	
	ArrayList <Almacenable> elementos;
	
	public Lugar () {
		this.elementos=new ArrayList<>();
	}
	
	@Override
	public int cantQuePiden(String regalo) {
		int cantidad=0;
		for(Almacenable aa:elementos) {
			cantidad+=aa.cantQuePiden(regalo);
		}
		return cantidad;
	}

	@Override
	public int getCantCartas() {
		int cantidad=0;
		for(Almacenable aa:elementos) {
			cantidad+=aa.getCantCartas();
		}
		return cantidad;
	}
	
	@Override
	public int cantNiniosMalos() {
			int cantidad=0;
			for(Almacenable aa:elementos) {
				cantidad+=aa.cantNiniosMalos();
			}
			return cantidad;
		}

}
