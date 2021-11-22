/**
 * 
 */
package curso.junit.es;

import org.junit.*;

/**
 * @author Maria Fernanda Lopez
 *
 */
public class TestPersona 
{

/**
 * 	Metodo que me indica que voy a hacer una prueba
 *  Testeo del metodo saludo
 */
	
	/**
	 * Las anotaciones se hicieron de forma manual
	 * BeforeClass and AfterClass tienen que tener static
	 */
	@BeforeClass
	public static void setUpClass()
	{
		System.out.println("Antes de la clase: Test, ejm: Abrir Conexion a BD");
	}
	
	@AfterClass
	public static void tearDownClass()
	{
		System.out.println("Despues de la clase: Test, ejm: Abrir Conexion a BD");
	}
	
	
	@Before
	public void setUp()
	{
		System.out.println("Antes del Test, ejm: Abrir Conexion a BD");
	}
	
	@After
	public void tearDown()
	{
		System.out.println("Despues del Test: , ejm: Abrir Conexion a BD");
	}
	@Test
	public void testSaludo()
	{
//		fail("Not yet implemented");
		System.out.println("\n \nTest: Saludo");
//		Instancio la clase persona
		Persona person = new Persona();
		String resultado = person.saludo("Maria", "Lopez");
				
// 		Ahora aplico las assert
		Assert.assertEquals("Buenos dias Maria Lopez", resultado);
			
	}
	@Test
	public void testSaludoError()
	{
//		fail("Not yet implemented");
		System.out.println("Test: testSaludoError");
//		Instancio la clase persona
		Persona person = new Persona();
		String resultado = person.saludo("Maria", null);
		try
		{
			resultado = person.saludo("Maria", null);
	//		se hace el condicional para ver que error esta sacando
			if(resultado == null)
			{
				Assert.fail("Dato no valid");
			}
		}
		catch(Exception e) {
		// 		Ahora aplico las assert
			Assert.assertEquals("Dato no valid", resultado);
		}

			
	}
	@Test
	public void testSaludoFallo()
	{
//		fail("Not yet implemented");
		System.out.println("Test: testSaludoFallo");
//		Instancio la clase persona
		Persona person = new Persona();
		String resultado = person.saludo("Maria", "Lopez");
				
// 		Ahora aplico las assert
		Assert.assertEquals("Maria Lopez", resultado);
			
	}

}
