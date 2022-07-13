
public class Password {
	
	private int longitud;
	private String contrasena;
	
	public Password() {
		longitud = 8;
		contrasena = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		generarContr();
	}
	
	private void generarContr() {
		char rand;
		String contrasena = "";
		for(int i = 0; i < longitud; i++) {
			rand = (char) (33+Math.random()*94);	//crear caracteres ASCII de 33 a 126 para evitar caracteres como [BACKSPACE]
			contrasena = contrasena + Character.toString(rand);
		}
		this.contrasena = contrasena;
	}

}
