package ej3;

public class FrutaAnd extends FrutaDelDiablo {
//atts 
	private FrutaDelDiablo f1;
	private FrutaDelDiablo f2;
	
	public FrutaAnd (FrutaDelDiablo f1,FrutaDelDiablo f2) {
		this.f1=f1;
		this.f2=f2;
	}

	@Override
	public int calcularFuerza() {
		// TODO Auto-generated method stub
		return f1.calcularFuerza()+f2.calcularFuerza();
	}
	
}
