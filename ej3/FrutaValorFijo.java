package ej3;

public class FrutaValorFijo extends FrutaDelDiablo {
	//atts
	private int valorFijo;
	//builder
	public FrutaValorFijo(int valorFijo) {
		this.valorFijo=valorFijo;
	}
	//instance method
	@Override
	public int calcularFuerza() {
		return valorFijo;
	}

}
