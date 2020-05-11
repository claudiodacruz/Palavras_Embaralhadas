package jogopalavrasembaralhadas;


import java.util.Scanner;

public class ComChances extends FabricaMecanicaDoJogo implements MecanicaDoJogo {

	private int tentativa;
	private static int pontos;
	private String sorteada;

	@Override
	public void oJogoAcabou() {
		System.out.println("O jogo acabou.");
		System.out.println("Pontuação Final = " + pontuacaoFinal(0));
	}
		

	@Override
	public void acertouPalavra(String palavra, String sorteada) {
		this.sorteada = sorteada;
		int pontosGanhos;
		if(palavra.equalsIgnoreCase(sorteada)) {
			if(tentativa ==0) {
				pontosGanhos = 5;
			} else if (tentativa == 1){
				pontosGanhos = 3;
			} else {
				pontosGanhos = 1;
			}
			this.pontuacaoFinal(pontosGanhos);
			System.out.println("Você acertou na " + (tentativa + 1) + "º tentativa.");
			tentativa = 0;
		} else {
			this.tentarNovamente();
		}
	}

	public void tentarNovamente() {
		if (tentativa < 2) {
			System.out.println("Você ainda tem " + (2 - tentativa) + " chance(s).");
			tentativa++;
			Scanner sct = new Scanner(System.in);
		    System.out.print("Digite qual é a palavra: ");
		    String tentativa = sct.next();
		    this.acertouPalavra(tentativa, sorteada);
		    
		} else {
			System.out.println("Numero de tentativas excedido!");
		}
		tentativa = 0;
	}

	@Override
	public int pontuacaoFinal(int pontosGanhos) {
		pontos += pontosGanhos;
		return pontos;	
	}


}
