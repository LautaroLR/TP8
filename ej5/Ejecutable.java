package ej5;

import java.util.ArrayList;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pregunta p1= new Pregunta ("¿Cuáles son los valores posibles de una variable boolean?",5,10);
		p1.addConceptos("Programación estructurada");
		p1.addConceptos("Programación básica");
		p1.addConceptos("tipos de variables");
		p1.addConceptos("tipos de datos en programación");
		ArrayList<String> pp = p1.getConceptos();
		System.out.println(pp);
		Pregunta p2 = new Pregunta("¿Qué es una clase en Java?", 6, 12);
		p2.addConceptos("POO");
		p2.addConceptos("clases y objetos");
		p2.addConceptos("Java");
		p2.addConceptos("programación orientada a objetos");
		ArrayList<String> pp2 = p2.getConceptos();
		System.out.println(pp2);

		Pregunta p3 = new Pregunta("¿Cómo se implementa un bucle for en Java?", 5, 8);
		p3.addConceptos("estructuras de control");
		p3.addConceptos("bucles");
		p3.addConceptos("Java");
		p3.addConceptos("for");
		ArrayList<String> pp3 = p3.getConceptos();
		System.out.println(pp3);

		Pregunta p4 = new Pregunta("¿Qué es la herencia en programación?", 7, 15);
		p4.addConceptos("POO");
		p4.addConceptos("herencia");
		p4.addConceptos("clases");
		p4.addConceptos("Java");
		ArrayList<String> pp4 = p4.getConceptos();
		System.out.println(pp4);

		Pregunta p5 = new Pregunta("¿Cuál es la diferencia entre un ArrayList y un arreglo en Java?", 8, 14);
		p5.addConceptos("Java");
		p5.addConceptos("colecciones");
		p5.addConceptos("ArrayList");
		p5.addConceptos("arreglos");
		ArrayList<String> pp5 = p5.getConceptos();
		System.out.println(pp5);
		
		UnidadEvaluacion e1 = new UnidadEvaluativaOptativa();
		e1.add(p1);
		e1.add(p2);
		e1.add(p3);
		e1.add(p4);
		e1.add(p5);
		System.out.println(e1.getConceptos());
		System.out.println(e1.getPuntaje());
		System.out.println(e1.getTiempoEstimado());
		
	}

}
