package principal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import jess.*;

public class Principal {
	public static String ruta =".\\maquina\\prueba.CLP";
	public static ArrayList<Ciudad> ciudadesEC = null;
	public static ArrayList<Ruta> rutasEC=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rete r = new Rete();
		ciudadesEC = new ArrayList<>();
		rutasEC = new ArrayList<>();
		try {
			DBConn conexion = new DBConn();
			ResultSet paradas = conexion.getQuery("select * from parada"); 
			while(paradas.next()){
				ciudadesEC.add(new Ciudad(paradas.getString("id_parada"),paradas.getString("nombre_parada")));
			}
			ResultSet rutas = conexion.getQuery("select * from ruta");
			while(rutas.next()){
				rutasEC.add(new Ruta(
						rutas.getInt("id_ruta"),
						buscarCiudad(rutas.getString("id_parada_origen")),
						buscarCiudad(rutas.getString("id_parada_destino")),
						rutas.getFloat("distancia"),
						rutas.getString("via")));
			}
			r.batch(ruta);
			r.reset();
			r.run();
		} catch (JessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Ciudad c: ciudadesEC){
			System.out.println(c);
		}

	}
	public static Ciudad buscarCiudad(String nC){
		Ciudad ciudad=null;
		for(Ciudad c : ciudadesEC){
			if(c.getNombre().equals(nC)){
				ciudad=c;
			}
		}
		return ciudad;
	}

}
