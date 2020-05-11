package jogopalavrasembaralhadas;

import java.util.Random;


public class FabricaEmbaralhadores {
	
	private Embaralhador[] em = new Embaralhador[3];
	private String palavraEmbaralhada;
	
	public FabricaEmbaralhadores() {
		// TODO Auto-generated constructor stub
	}


	// ESCOLHE ALEATORIAMENTE O MÉTODO DE EMBARALHAR
	public void embaralhador(String sorteada) {
		Random gerador = new Random();
		int num = gerador.nextInt(3);
		if(num == 0) {
			em[0] = new QuebraPalavra();
			palavraEmbaralhada = em[0].embaralhar(sorteada);
		} else if(num == 1) {
			em[1] = new InvertePalavra();
			palavraEmbaralhada = em[1].embaralhar(sorteada);
		}else {
			em[2] = new EmbaralhadorAleatorio();
			palavraEmbaralhada = em[2].embaralhar(sorteada);
		}
		
	}

	public String getEmbaralhada() {
		return palavraEmbaralhada;
	}
}
