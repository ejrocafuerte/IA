package principal;
import jess.*;

public class Principal {
	public static String ruta ="C:\\users\\erick\\workspace\\AI\\src\\maquina\\prueba.CLP";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rete r = new Rete();
		try {
			DBConn conexion = new DBConn();
			r.batch(ruta);
			
		} catch (JessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
