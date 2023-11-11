package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	@Test
	void doisSomaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();

		assertEquals(c.somaInteiros(2, 2), 4);
	}

	@Test
	void tresSomaSeteEsperaDez() {
		Calculadora c = new Calculadora();

		assertEquals(c.somaInteiros(3, 7), 10);
	}

	@Test
	void doisSubtraiDoisEsperaZero() {
		Calculadora c = new Calculadora();

		assertEquals(c.subtraiInteiros(2, 2), 0);
	}

	@Test
	void doisSubtraiTresEsperaMenosUm() {
		Calculadora c = new Calculadora();

		assertEquals(c.subtraiInteiros(2, 3), -1);
	}

	@Test
	void doisMultiplicaDoisEsperaQuatro() {
		Calculadora c = new Calculadora();

		assertEquals(c.multiplicaInteiros(2, 2), 4);
	}

	@Test
	void doisMultiplicaCincoEsperaDez() {
		Calculadora c = new Calculadora();

		assertEquals(c.multiplicaInteiros(2, 5), 10);
	}

	@Test
	void doisDivideDoisEsperaUm() {
		Calculadora c = new Calculadora();

		assertEquals(c.divideInteiros(2, 2), 1);
	}

	@Test
	void dezDivideDoisEsperaCinco() {
		Calculadora c = new Calculadora();

		assertEquals(c.divideInteiros(10, 2), 5);
	}
}
