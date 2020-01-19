
/**
 * Clase para generar un objeto de tipo rectangualo, es una subclase de la superclase FiguraGeometrica
 * @author Daniel Guardia Martinez
 * @version 1.2
 */
public class Rectangulo_DGM extends FiguraGeometrica_DGM {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la figura
	 * @param tipoFigura recibe el tipo de figura a crear
	 * @param lG recibe el lado grande del rectangulo
	 * @param lP recibe el lado pequeño del rectangulo
	 */
	public Rectangulo_DGM(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Reescribir el metodo area de la superclase FiguraGeometrica
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Reescribir el metodo perimetro de la superclase FiguraGeometrica 
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
