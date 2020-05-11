package jogopalavrasembaralhadas;

import java.util.Random;

public class EmbaralhadorAleatorio extends FabricaEmbaralhadores implements Embaralhador {
	
	private String palavraEmbaralhada = "";
	
	public String getNova() {
		return palavraEmbaralhada;
	}

	public EmbaralhadorAleatorio() {
		// TODO Auto-generated constructor stub
	}

	// RETORNA AS STRINGS COM AS LETRAS EMBARALHADAS ALEATORIAMENTE
	@Override
	public String embaralhar(String sorteada) {
		int tamanho = sorteada.length();
		String[] vetor = new String[tamanho];
		vetor = sorteada.split("");
		Random gerador = new Random();

		while(this.palavraEmbaralhada.length() <= tamanho-1) {
			int num = gerador.nextInt(tamanho);
			if(vetor[num] != null) {
				this.palavraEmbaralhada += vetor[num];
				vetor[num] = null;
			}
		}
		return palavraEmbaralhada;
	
	}

}
