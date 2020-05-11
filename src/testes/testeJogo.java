package testes;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import jogopalavrasembaralhadas.BancoDePalavras;
import jogopalavrasembaralhadas.Embaralhador;
import jogopalavrasembaralhadas.EmbaralhadorAleatorio;
import jogopalavrasembaralhadas.FabricaEmbaralhadores;
import jogopalavrasembaralhadas.InvertePalavra;
import jogopalavrasembaralhadas.QuebraPalavra;

public class testeJogo {

	BancoDePalavras bp = new BancoDePalavras();
	private Embaralhador[] em = new Embaralhador[3];
	String palavra = "LIMA";
	String palavraEmbaralhada;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Test
	public void testeEmbaralhaAleatorio() {
		em[0] = new EmbaralhadorAleatorio();
		palavraEmbaralhada = em[0].embaralhar(palavra);
		String resultado = "";
		String[] retorno = {"LIMA","LIAM","LMIA","LMAI","LAMI","LAIM","ILMA","ILAM","IAML","IALM","IMLA","IMAL",
				"MLIA","MLAI","MILA","MIAL","MAIL","MALI","ALIM","ALMI","AILM","AIML","AMLI","AMIL"};
		for(String cada : retorno) {
			if(cada.equals(palavraEmbaralhada)) {
				resultado = cada;
			}
		}
		assertEquals(palavraEmbaralhada, resultado);
	}
	
	@Test
	public void testeInvertePalavra() {
		em[1] = new InvertePalavra();
		palavraEmbaralhada = em[1].embaralhar(palavra);
		assertEquals(palavraEmbaralhada,"AMIL");
	}
	
	@Test
	public void testeQuebraPalavra() {
		em[2] = new QuebraPalavra();
		palavraEmbaralhada = em[2].embaralhar(palavra);
		assertEquals(palavraEmbaralhada,"MALI");
	}
}
