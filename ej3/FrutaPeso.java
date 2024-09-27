package ej3;

public class FrutaPeso extends FrutaDelDiablo {
//atts
	private int valorMultiplo;
	private double peso;
//builder
	public FrutaPeso (int valorMultiplo, Personaje p1) {
		this.valorMultiplo=valorMultiplo;
		this.peso=p1.getPeso();
	}
	@Override
	public int calcularFuerza() {
		// TODO Auto-generated method stub
		return (int)this.peso*this.valorMultiplo;
	}
	
	public void setPeso(int peso) {
		this.peso = peso;
	}

}
