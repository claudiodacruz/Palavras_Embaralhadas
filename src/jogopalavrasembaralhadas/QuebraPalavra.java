package jogopalavrasembaralhadas;

public class QuebraPalavra extends FabricaEmbaralhadores implements Embaralhador {

	private String palavraEmbaralhada = "";
	
	public String getNova() {
		return palavraEmbaralhada;
	}


	public QuebraPalavra() {
		// TODO Auto-generated constructor stub
	}

	// QUEBRA A PALAVRA NO MEIO E RETORNA AS PARTES INVERTIDAS
	@Override
	public String embaralhar(String sorteada) {
		int tamanho = sorteada.length();
		int meio = (int) tamanho / 2;
		String parte1 = sorteada.substring(0, meio);;
		String parte2 = sorteada.substring(meio, tamanho);
		this.palavraEmbaralhada = parte2 + parte1;
		return palavraEmbaralhada;
	}
	

}