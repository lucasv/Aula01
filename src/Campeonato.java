import java.util.ArrayList;


public class Campeonato {

	int pontosBrasil;
	
	int pontosMexico;
	
	int pontosCroacia;
	
	int pontosCamaroes;
	
	
	String verificaClassificacao() {
		return "";
	}
	
	String verificaPrimeiroColocado(ArrayList<Jogo> jogos) {
		String primeiroColocado = "";
		
		for (Jogo jogo : jogos) {
			if (jogo.vencedor().equals("Brasil")) {
				pontosBrasil += 3;
			} else if (jogo.vencedor().equals("México")) {
				pontosMexico += 3;
			} else if (jogo.vencedor().equals("Croácia")) {
				pontosCroacia += 3;
			} else if (jogo.vencedor().equals("Camarões")) {
				pontosCamaroes += 3;
			}
		}
		
		
		
		return primeiroColocado;
	}
	
	String verificaSegundoColocado(ArrayList<Jogo> jogos) {
		return "";
	}
	
}
