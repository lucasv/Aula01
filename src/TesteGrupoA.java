import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TesteGrupoA {
	
	Campeonato copaDoMundo;
	
	ArrayList<Jogo> jogos;

	@Test
	public void primeiroColocado() {		
		assertEquals("Brasil", copaDoMundo.verificaPrimeiroColocado(jogos));
	}
	
	@Test
	public void segundoColocado() {
		//CopaDoMundo copa = new CopaDoMundo();
		//assertEquals("México", copa.verificaSegundoColocado());
	}
	
	@Before
	public void setup() {
		copaDoMundo = new Campeonato();
		Jogo jogo1 = new Jogo("Brasil", "México", 2, 1);
		Jogo jogo2 = new Jogo("Brasil", "Croácia", 3, 0);
		Jogo jogo3 = new Jogo("Brasil", "Camarões", 4, 0);
		Jogo jogo4 = new Jogo("México", "Croácia", 3, 1);
		Jogo jogo5 = new Jogo("México", "Camarões", 2, 1);
		Jogo jogo6 = new Jogo("Croácia", "Camarões", 1, 2);
		
		jogos = new ArrayList<Jogo>();
		jogos.add(jogo1);
		jogos.add(jogo2);
		jogos.add(jogo3);
		jogos.add(jogo4);
		jogos.add(jogo5);
		jogos.add(jogo6);
	}

}
