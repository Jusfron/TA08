import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Electrodomestico {
	
	protected static final double PRECIO_BASE_DEFECTO = 100.0;
	protected static final String COLOR_DEFECTO = "blanco";
	protected static final char CONSUMO_ENERGETICO_DEFECTO = 'F';
	protected static final double PESO_DEFECTO = 5.0;
	protected static final String[] COLORES_DISPONIBLES = {"blanco","negro","rojo","azul","gris"};
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected double peso;
	
	public Electrodomestico() {
		precioBase = PRECIO_BASE_DEFECTO;
		color = COLOR_DEFECTO;
		consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		peso = PESO_DEFECTO;
	}
	
	public Electrodomestico(double precioBase, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		color = COLOR_DEFECTO;
		consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
	}
	
	public Electrodomestico(double precioBase,String color, char consumoEnergetico, double peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		List<String> coloresList = new ArrayList<String>(Arrays.asList(COLORES_DISPONIBLES));
		if(coloresList.contains(color)) {
			this.color = color;
		} else {
			this.color = COLOR_DEFECTO;
		}
		if(consumoEnergetico >= 'A' && consumoEnergetico <= 'F') {
			this.consumoEnergetico = consumoEnergetico;
		} else {
			this.consumoEnergetico = CONSUMO_ENERGETICO_DEFECTO;
		}
	}
	
}
