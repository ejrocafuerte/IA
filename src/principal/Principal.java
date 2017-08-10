package principal;
import jess.*;

public class Principal {
	public static String ruta =".\\maquina\\prueba.CLP";
	public Ciuda

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rete r = new Rete();
		try {
			DBConn conexion = new DBConn();
			r.batch(ruta);
			r.reset();
			r.run();
			
		} catch (JessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
