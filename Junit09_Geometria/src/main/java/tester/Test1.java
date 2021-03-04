package tester;

import static org.junit.jupiter.api.Assertions.*;
//import JUnit.Junit09_Geometria.dto.*;
import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class Test1 {

	@Test
	void testConstructor() {
		//fail("Not yet implemented");
		
		Geometria testeo = new Geometria();
		int resultado = testeo.areacuadrado(5);
		assertEquals(25, resultado);
		
		Geometria testeo1 = new Geometria();
		double resultado1 = testeo1.areaCirculo(5);
		double delta = 1.0;
		assertEquals(78.54, resultado1,delta);
		
		Geometria testeo2 = new Geometria();
		int resultado2 = testeo2.areatrapecio(5,10,12);
		assertEquals(25, resultado2);
		
		Geometria testeo3 = new Geometria();
		int resultado3 = testeo3.areatriangulo(5,10);
		assertEquals(25, resultado3);
		
		Geometria testeo4 = new Geometria();
		int resultado4 = testeo4.areapentagono(5,20);
		assertEquals(25, resultado4);
		
		Geometria testeo5 = new Geometria();
		int resultado5 = testeo5.arearombo(5,30);
		assertEquals(25, resultado5);
		
		Geometria testeo6 = new Geometria();
		int resultado6 = testeo6.arearomboide(5,25);
		assertEquals(25, resultado6);
		
		Geometria testeo7 = new Geometria();
		String resultado7 = testeo7.figura(3);
		assertEquals(25, resultado7);
		
	}

}
