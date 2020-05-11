package jogopalavrasembaralhadas;


public class SemChances extends FabricaMecanicaDoJogo implements MecanicaDoJogo {

	private static int pontos;
	
	@Override
	public void oJogoAcabou() {
		System.out.println("O jogo acabou.");
		System.out.println("Pontuação Final = " + pontuacaoFinal(0));
	}	
	
	@Override
	public void acertouPalavra(String palavra, String sorteada) {
		if(palavra.equalsIgnoreCase(sorteada)) {
			System.out.println("Parabéns você acertou!");
			pontuacaoFinal(5);	
		} else {
			System.out.println("Infelizmente você não acertou!");
			pontuacaoFinal(-2);
		}
		
	}

	@Override
	public int pontuacaoFinal(int pontosGanhos) {
		pontos += pontosGanhos;
		return pontos;	
	}

}
