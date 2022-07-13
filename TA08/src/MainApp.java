
public class MainApp {

	public static void main(String[] args) {
		Persona persona1 = new Persona();
		Persona persona2 = new Persona("Paul",34,'H');
		Persona persona3 = new Persona("Susy",28,"32783182F",'M',162.2,57.5);
		
		Password password1 = new Password();
		Password password2 = new Password(4);
		
		Electrodomestico electrodomestico1 = new Electrodomestico();
		Electrodomestico electrodomestico2 = new Electrodomestico(53.2, 10.5);
		Electrodomestico electrodomestico3 = new Electrodomestico(200.0,"rojo", 'A', 25.5);
		
		Serie serie1 = new Serie();		
		Serie serie2 = new Serie("The Last Evening", "Jerry Jackson");		
		Serie serie3 = new Serie("The First Afternoon", 5, "Horror", "Perry the Platypus");		
		
		System.out.println("Persona1: nombre: "+persona1.getNombre()+" edad: "+persona1.getEdad()+" dni: "+persona1.getDni()+" sexo: "+persona1.getSexo()+
				" altura: "+persona1.getAltura()+" peso: "+persona1.getPeso());
		System.out.println("Persona2: nombre: "+persona2.getNombre()+" edad: "+persona2.getEdad()+" dni: "+persona2.getDni()+" sexo: "+persona2.getSexo()+
				" altura: "+persona2.getAltura()+" peso: "+persona2.getPeso());
		System.out.println("Persona3: nombre: "+persona3.getNombre()+" edad: "+persona3.getEdad()+" dni: "+persona3.getDni()+" sexo: "+persona3.getSexo()+
				" altura: "+persona3.getAltura()+" peso: "+persona3.getPeso());
		
		System.out.println("Password1: longitud: "+password1.getLongitud()+" contrasena: "+password1.getContrasena());
		System.out.println("Password2: longitud: "+password2.getLongitud()+" contrasena: "+password2.getContrasena());
		
		System.out.println("Electrodomestico1: precio: "+electrodomestico1.getPrecioBase()+" color: "+electrodomestico1.getColor()+" consumo: "+
		electrodomestico1.getConsumoEnergetico()+" peso: "+electrodomestico1.getPeso());
		System.out.println("Electrodomestico2: precio: "+electrodomestico2.getPrecioBase()+" color: "+electrodomestico2.getColor()+" consumo: "+
		electrodomestico2.getConsumoEnergetico()+" peso: "+electrodomestico2.getPeso());
		System.out.println("Electrodomestico3: precio: "+electrodomestico3.getPrecioBase()+" color: "+electrodomestico3.getColor()+" consumo: "+
		electrodomestico3.getConsumoEnergetico()+" peso: "+electrodomestico3.getPeso());
		
		System.out.println("Serie1: title: "+serie1.getTitulo()+" temporadas: "+serie1.getNumTemporadas()+" genero: "+serie1.getGenero()+" autor: "+serie1.getCreador());
		System.out.println("Serie2: title: "+serie2.getTitulo()+" temporadas: "+serie2.getNumTemporadas()+" genero: "+serie2.getGenero()+" autor: "+serie2.getCreador());
		System.out.println("Serie3: title: "+serie3.getTitulo()+" temporadas: "+serie3.getNumTemporadas()+" genero: "+serie3.getGenero()+" autor: "+serie3.getCreador());

	}

}
