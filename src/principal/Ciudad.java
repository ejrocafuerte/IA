package principal;

public class Ciudad {
	private int id;
	private String nombre;
	public Ciudad(){
		super();
	}
	public Ciudad(int id, String nombre){
		this.id=id;
		this.nombre = nombre;
	}
	public Ciudad(String id, String nombre){
		this(Integer.parseInt(id),nombre);
	}
	public void setId(int id){
		this.id=id;
	}
	public int getId(){
		return this.id;
	}
	public void setNombre(String nombre){
		this.nombre=nombre;
	}
	public String getNombre(){
		return this.nombre;
	}
}
