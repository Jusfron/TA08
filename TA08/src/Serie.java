
public class Serie {

	private String titulo;
	private int numTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		titulo="";
		numTemporadas = 3;
		entregado = false;
		genero = "";
		creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		numTemporadas = 3;
		entregado = false;
		genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		entregado = false;
		this.genero = genero;
		this.creador = creador;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumTemporadas() {
		return numTemporadas;
	}

	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	
	
}
