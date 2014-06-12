
public class Jogo {
	
	String time1;
	
	String time2;
	
	int golsTime1;
	
	int golsTime2;

	
	public Jogo(String time1, String time2, int golsTime1, int golsTime2) {
		this.time1 = time1;
		this.time2 = time2;
		this.golsTime1 = golsTime1;
		this.golsTime2 = golsTime2;
	}

	public String vencedor() {
		String vencedor = "";
		
		if (golsTime1 > golsTime2)  {
			vencedor = time1;
		} else if (golsTime2 > golsTime1) {
			vencedor = time2;
		} else if (golsTime1 == golsTime2) {
			vencedor = "Empate";
		}
		
		return vencedor;
	}
	
	public boolean empate() {
		return true;
	}
	
}
