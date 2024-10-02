package ej2;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carta c1 = new Carta(36666888);
		Carta c2 = new Carta(36445888);
		Carta c3 = new Carta(36266888);
		Carta c4 = new Carta(77766888);
		Carta c5 = new Carta(36664448);
		Carta c6 = new Carta(36666888);
		c1.addRegalo("osito");
		c1.addRegalo("autito");
		c1.addRegalo("barbie");
		c1.addRegalo("Max Steel");
		c2.addRegalo("osito");
		c2.addRegalo("Revistas Porno");
		c2.addRegalo("compu");
		c2.addRegalo("libro");
		c3.addRegalo("trompo");
		c3.addRegalo("osito");
		c4.addRegalo("pokemon");
		c5.addRegalo("digimon");
		c5.addRegalo("cartas");
		c6.addRegalo("taza");
		
		Buzon b1 = new Buzon();
		b1.addNinioBueno(36666888);
		b1.addNinioBueno(77766888);
		b1.addNinioBueno(36445888);
		b1.addCarta(c1);
		b1.addCarta(c2);
		b1.addCarta(c3);
		b1.addCarta(c4);
		b1.addCarta(c5);
		b1.addCarta(c6);
		
		System.out.println(b1.getCantCartas());
		System.out.println(b1.cantNiniosMalos());
		System.out.println(b1.cantQuePiden("osito"));
	}

}
