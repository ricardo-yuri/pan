package junit.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		System.out.println("Somar");
		int n1 = 5;
		int n2 = 5;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 10.0;
		double result = calculadorinhaTeste.aumentar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	@Test
	public void testDiminuir() {
		System.out.println("Subtrair");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 2;
		double result = calculadorinhaTeste.diminuir(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
	@Test
	public void test() {
		System.out.println("Multiplicação");
		int n1 = 5;
		int n2 = 3;
		Calculadora calculadorinhaTeste = new Calculadora();
		double resultadoEsperado = 15;
		double result = calculadorinhaTeste.multiplicar(n1, n2);
		assertEquals(resultadoEsperado, result, 0);
	}
}
