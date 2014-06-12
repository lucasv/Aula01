import static org.junit.Assert.*;

import org.junit.Test;


public class TesteJogo {

	@Test
	public void vencedor() {
		
		/*Partida partida = new Partida();
		Time time1 = new Time();
		Time time2 = new Time();
		tim1.setNome();
		tim1.setGolsRealizados();
		tim2.setNome();
		tim2.setGolsRealizados();
		assertEquals("V", , actual);*/
		
		Jogo grenal = new Jogo("Inter", "Gremio", 4, 1);
		assertEquals("Inter", grenal.vencedor());
		
	}
	
	@Test
	public void empate() {
		Jogo jogo = new Jogo("Inter", "Gremio", 4, 1);
		//assertTrue(jogo.empate());
		assertTrue(jogo.empate());
	}
	
}
