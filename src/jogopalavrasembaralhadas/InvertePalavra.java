package jogopalavrasembaralhadas;


public class InvertePalavra extends FabricaEmbaralhadores implements Embaralhador {

	private String palavraEmbaralhada = "";
	
	public String getNova() {
		return palavraEmbaralhada;
	}

	public InvertePalavra() {
		// TODO Auto-generated constructor stub
	}

	// ESCREVE A PALAVRA DE TRÁS PRA FRENTE
	@Override
	public String embaralhar(String sorteada) {
		int tamanho = sorteada.length();
		String[] vetor = new String[tamanho];
		vetor = sorteada.split("");
		//String nova = "";
		for(int i = tamanho - 1; i >= 0; i--) {
			this.palavraEmbaralhada += vetor[i];
		}
		return palavraEmbaralhada;
	}

}
