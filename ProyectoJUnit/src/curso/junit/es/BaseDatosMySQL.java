package curso.junit.es;

public class BaseDatosMySQL {
/**
 * vamos a aplicar los test parametrizados
 * se crea un insert intro
 */
	
//	metodo que recibe los datos de la bd
	public String AgregarRegistros(String nombres, String apellidos, String correo, String telefono)
	{
		String Query="Insert intro tblcontactos (nombres, apellidos, correo, telefono) values ("+nombres+ "," +apellidos+","+correo+", "+telefono+")";
	
		return Query;
	}
}
