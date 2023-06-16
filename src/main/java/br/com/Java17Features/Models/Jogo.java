package br.com.Java17Features.Models;

public sealed class Jogo permits Tabuleiro {

    public String iniciarJogo() {
        return "Iniciando Jogo!";
    };
    
}
