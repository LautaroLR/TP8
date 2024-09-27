package ej3;

public abstract class Miembro {
//atts
	protected String nombre;
//builder
	public Miembro (String nom) {
		nombre=nom;
	}
//métodos de instancia
	public String getNombre () {
		return nombre;
	}
	
	public void setNombre (String nom) {
		nombre=nom;
	}
//métodos abstractos
	public abstract int getFuerza();
	public abstract double getPeso();
	public abstract int getEdad();
	
	
}
