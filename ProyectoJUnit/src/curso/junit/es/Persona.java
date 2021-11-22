package curso.junit.es;

public class Persona 
{
	// se crea el evento
	public String saludo(String nombre, String apellido)
	{
		if(nombre != null && apellido != null)
		{
			return "Buenos dias " + nombre.toLowerCase() + " " + apellido.toLowerCase();
			
		}
		return null;
		
		
	}

}
