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
		//assertEquals("M�xico", copa.verificaSegundoColocado());
	}
	
	@Before
	public void setup() {
		copaDoMundo = new Campeonato();
		Jogo jogo1 = new Jogo("Brasil", "M�xico", 2, 1);
		Jogo jogo2 = new Jogo("Brasil", "Cro�cia", 3, 0);
		Jogo jogo3 = new Jogo("Brasil", "Camar�es", 4, 0);
		Jogo jogo4 = new Jogo("M�xico", "Cro�cia", 3, 1);
		Jogo jogo5 = new Jogo("M�xico", "Camar�es", 2, 1);
		Jogo jogo6 = new Jogo("Cro�cia", "Camar�es", 1, 2);
		
		jogos = new ArrayList<Jogo>();
		jogos.add(jogo1);
		jogos.add(jogo2);
		jogos.add(jogo3);
		jogos.add(jogo4);
		jogos.add(jogo5);
		jogos.add(jogo6);
	}

}
