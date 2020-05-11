package jogopalavrasembaralhadas;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class BancoDePalavras {

	public static HashMap<String, String> dados = new HashMap<String, String>();;
	
	// CRIA UM VETOR DE PALAVRAS A PARTIR DO ARQUIVO DE PALAVRAS
	public void vetorPalavras() {
		File arquivo = new File("/Users/claudiodacruz/palavras.txt");
		Scanner sc;
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				String s = sc.nextLine();
				String[] retorno = s.split("-");
				dados.put(retorno[0], new String(retorno[1]));
			}	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// SORTEIA UMA PALAVRA DO ARQUIVO DE PALAVRAS
	public String sorteiaPalavra() {
		this.vetorPalavras();
		Random gerador = new Random(); 
		int num = gerador.nextInt(20)+1;
		String key = Integer.toString(num);
		String palavra = dados.get(key);
		return palavra;
	}
	
	public static HashMap<String, String> getDados() {
		return dados;
	}

	
}
