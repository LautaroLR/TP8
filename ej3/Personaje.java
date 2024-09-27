package ej3;

public class Personaje extends Miembro{
	private int edad;
	private double peso;
	private FrutaDelDiablo fruta;
	
	public Personaje (String nombre, int edad, double peso, FrutaDelDiablo fruta) {
		super(nombre);
		this.edad=edad;
		this.peso=peso;
		this.fruta=fruta;
	}

	@Override
	public int getFuerza() {
		if (fruta==null) {
			return 145;
		}else {
		return fruta.calcularFuerza();
		}
	}

	@Override
	public double getPeso() {
		return this.peso;
	}

	@Override
	public int getEdad() {
		return this.edad;
	}

}
