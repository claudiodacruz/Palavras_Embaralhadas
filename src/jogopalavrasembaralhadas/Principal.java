package jogopalavrasembaralhadas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		FabricaEmbaralhadores fe = new FabricaEmbaralhadores();
		FabricaMecanicaDoJogo fm = new FabricaMecanicaDoJogo();
		BancoDePalavras bp = new BancoDePalavras();
		
		System.out.println("#### Jogo Advinha palavra #####\n");
		System.out.println("Você tem a possibilidade de advi");
		System.out.println("nhar até 10 palavras por rodada.");
		System.out.println("Boa Sorte!\n");
		
		// VALIDANDO AS OPÇÕES
		String tipoDeJogo;
		do{
			System.out.println("--- Escolha o tipo de Jogo ----");
			System.out.println("1 - Facil");
			System.out.println("2 - Difícil");	
			System.out.println("0 - Sair do Jogo");
			System.out.println("-------------------------------");
			Scanner sc = new Scanner(System.in);
			System.out.print("Digite sua opção: ");
			tipoDeJogo = sc.next();
			if(tipoDeJogo.equals("0")) {
				System.out.println("Você saiu do jogo.");
				break;
			} else if(!tipoDeJogo.equals("1") && !tipoDeJogo.equals("2")) {
				System.out.println("Opção Inválida!\n");
			}
		} while(!tipoDeJogo.equals("1") && !tipoDeJogo.equals("2")); 

		
		// INICIANDO O JOGO
		int jogadas = 0;
		do {
			jogadas++;
			
			// SORTEANDO AS PALAVRAS
			String sorteada = bp.sorteiaPalavra();
			fe.embaralhador(sorteada);
			System.out.println("------------");
			System.out.println(fe.getEmbaralhada());
			System.out.println("------------");
			
			// DIGITANDO A PALAVRA ESCOLHIDA
			String escolhida;
			Scanner scp = new Scanner(System.in);
		    System.out.print("Digite a palavra: ");
		    escolhida = scp.next();
		    fm.escolherMecanica(tipoDeJogo, escolhida, sorteada);
		    if(jogadas == 10) {
		    	System.out.println("\n------------------------------------------");
		    	System.out.println("Você atingiu o número máximo de palavras.");
		    	System.out.println("------------------------------------------");
		    	break;
		    }
		    
		    // POSSIBILITANDO A CONTINUAÇÃO OU FINALIZAÇÃO DO JOGO
		    
		    Scanner scj = new Scanner(System.in);
			System.out.print("Continuar Jogando(S ou N)");
			String continua = scj.next();
			if(continua.equalsIgnoreCase("N")) {
				System.out.println("\n--------------------");
				break;
				
			}
			
		
		}while (jogadas < 10);
		fm.finaliza(tipoDeJogo);
	
	}	
		
}		
		
		

	


