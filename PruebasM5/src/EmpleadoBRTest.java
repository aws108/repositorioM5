import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Test;

public class EmpleadoBRTest {
	EmpleadoBR emple=new EmpleadoBR();

	@Test
	public void testCalculaSalarioBruto1() {
		float resultado = emple.calculaSalarioBruto(0, 2000, 8); //vendedor
        assertEquals(1360,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto2() {
		float resultado = emple.calculaSalarioBruto(0, 1500, 3); //vendedor
        assertEquals(1260,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto3() {
		float resultado = emple.calculaSalarioBruto(0, 1499.99, 0); //vendedor
        assertEquals(1100,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto4() {
		float resultado = emple.calculaSalarioBruto(1, 1250, 8); //encargado
        assertEquals(1760,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto5() {
		float resultado = emple.calculaSalarioBruto(1, 1000, 0); //encargado
        assertEquals(1600,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto6() {
		float resultado = emple.calculaSalarioBruto(1, 999.99, 3); //encargado
        assertEquals(1560,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto7() {
		float resultado = emple.calculaSalarioBruto(1, 500, 0); //encargado
        assertEquals(1500,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioBruto8() {
		float resultado = emple.calculaSalarioBruto(1, 0, 8); //encargado
        assertEquals(1660,resultado,1e6);
	}
	//----------------------------------------------------------------------
	@Test
	public void testCalculaSalarioNeto1() {
		double resultado = emple.calculaSalarioNeto(2000);
	    assertEquals(1640,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto2() {
		double resultado = emple.calculaSalarioNeto(1500);
	    assertEquals(1230,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto3() {
		double resultado = emple.calculaSalarioNeto(1499.99);
	    assertEquals(1259.9916,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto4() {
		double resultado = emple.calculaSalarioNeto(1250);
	    assertEquals(1050,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto5() {
		double resultado = emple.calculaSalarioNeto(1000);
	    assertEquals(840,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto6() {
		double resultado = emple.calculaSalarioNeto(999.99);
	    assertEquals(999.99,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto7() {
		double resultado = emple.calculaSalarioNeto(500);
	    assertEquals(500,resultado,1e6);
	}
	@Test
	public void testCalculaSalarioNeto8() {
		double resultado = emple.calculaSalarioNeto(0);
	    assertEquals(0,resultado,1e6);
	}

}
