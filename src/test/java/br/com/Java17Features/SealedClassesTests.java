package br.com.Java17Features;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.Java17Features.Models.Dama;
import br.com.Java17Features.Models.Jogo;
import br.com.Java17Features.Models.Tabuleiro;
import br.com.Java17Features.Models.Xadrez;

@SpringBootTest
class SealedClassesTests {

	@Test
	void switchExpressions_retornaInicioDoJogoDeXadrez_quandoSucesso() {
		Jogo jogoXadrez = new Xadrez();
		String retorno = jogoXadrez.iniciarJogo();
		assertEquals(String.valueOf("Iniciando jogo de Xadrez!"), retorno);
	}

	@Test
	void switchExpressions_retornaInicioDoJogoDeDama_quandoSucesso() {
		Jogo jogoDama = new Dama();
		String retorno = jogoDama.iniciarJogo();
		assertEquals(String.valueOf("Iniciando jogo de Dama!"), retorno);
	}

	@Test
	void switchExpressions_retornaInicioDeTabuleiro_quandoSucesso() {
		Jogo jogoTabuleiro = new Tabuleiro();
		String retorno = jogoTabuleiro.iniciarJogo();
		assertEquals(String.valueOf("Iniciando Jogo!"), retorno);
	}

}
