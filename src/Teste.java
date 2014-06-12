import static org.junit.Assert.*;

import org.junit.Test;


public class Teste {

	@Test
	public void test() {
		Carro carro = new Carro();
		Float a = new Float(2);
		Float b = new Float(4);
		Float c = new Float(4);
		
		assertEquals(new Float(3), carro.m1(a, b, c), 0.01);
	}

}
