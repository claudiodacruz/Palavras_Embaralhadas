package jogopalavrasembaralhadas;



public class FabricaMecanicaDoJogo {
	
	private MecanicaDoJogo[] mecanicaEscolhida = new MecanicaDoJogo[3];
	
	public FabricaMecanicaDoJogo() {
		// TODO
	}
	
	// VINCULA A ESCOLHA DO TIPO DE JOGO ESCOLHIDO PELO PARTICIPANTE
	public void escolherMecanica(String tipo, String palavra, String sorteada) {
		
		if(tipo.equals("1")) {
			mecanicaEscolhida[0] = new ComChances();
			mecanicaEscolhida[0].acertouPalavra(palavra, sorteada);
				
		} else if(tipo.equals("2")) {
			mecanicaEscolhida[1] = new SemChances();
			mecanicaEscolhida[1].acertouPalavra(palavra, sorteada);
	
		}
	}
	
	public void finaliza(String tipo) {

		if(tipo.equals("1")) {
			mecanicaEscolhida[0] = new ComChances();
			mecanicaEscolhida[0].oJogoAcabou();
				
		} else if(tipo.equals("2")) {
			mecanicaEscolhida[1] = new SemChances();
			mecanicaEscolhida[1].oJogoAcabou();
	
		}
	}
	
	
}
