package principal;

public class Ruta {
	private int id;
	private Ciudad idParadaInicio;
	private Ciudad idParadaFin;
	private float distancia;
	private String via;
	public Ruta(){
		super();
	}
	public Ruta(int id, Ciudad ciudadInicio, Ciudad ciudadFin, float distancia, String via){
		this.id= id;
		this.idParadaInicio = ciudadInicio;
		this.idParadaFin = ciudadFin;
		this.distancia=distancia;
		this.via=via;
	}

}
