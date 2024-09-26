package ej2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaPaquete e1 = new CartaPaquete("Juan Gomez","Pablo Rodríguez","Tandil","Sucursal", 0.80);
		CartaPaquete e2 = new CartaPaquete("Ana Pérez", "Carlos Sánchez","Vela", "Domicilio", 1.20);
		CartaPaquete e3 = new CartaPaquete("Lucía Gómez", "María Fernández","Olavarria", "Sucursal", 0.50);
		CartaPaquete e4 = new CartaPaquete("Pedro López", "Andrés Ramírez","Juarez", "Domicilio", 2.50);
		CartaPaquete e5 = new CartaPaquete("Sofía García", "Luis Martínez","Mar del Plata", "Sucursal", 0.95);
		
	
		
		ComboPostal c1 = new ComboPostal();
		ComboPostal c2 = new ComboPostal();
		c2.add(e5);
		c1.add(e1);
		c1.add(e2);
		c2.add(c1);
		c2.add(e3);
		//System.out.println();
		System.out.println(c2);
		System.out.println(c2.getPeso());
		
	}

}
