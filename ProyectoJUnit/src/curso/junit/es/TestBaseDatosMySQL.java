package curso.junit.es;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class TestBaseDatosMySQL {
	
	@Parameters
	public static Collection<Object[]> datos()
	{
		return  (Collection<Object[]>) Arrays.asList(new Object[][]
		{
			{"1", "1", "1", "1"},{"2","2","2","2"},{"3","3","3","3"},{"4","4","4","4"},{"5","5","5","5"}
		});
	}
	
	//se crea el constructor
	private String nom;
	private String ape;
	private String cor;
	private String tel;
	private BaseDatosMySQL bd = new BaseDatosMySQL();
	

	public TestBaseDatosMySQL(String nombres, String apellidos, String correo, String telefono) 
	{
		nom = nombres;
		ape = apellidos;
		cor = correo;
		tel = telefono;
		
	}
	@Test
	public void testAgregarRegistros()
	{
//		Instancio la clase persona
		String resultado = bd.AgregarRegistros(nom, ape, cor, tel);				
// 		Ahora aplico las assert
		System.out.println(resultado);
	}

}
