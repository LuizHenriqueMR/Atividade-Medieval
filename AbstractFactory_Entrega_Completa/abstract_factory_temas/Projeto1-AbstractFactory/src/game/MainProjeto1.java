package game;

import game.armas.Arma;
import game.factory.TemaFactory;
import game.factory.TemaFuturistaFactory;
import game.factory.TemaMedievalFactory;
import game.personagens.Personagem;

public class MainProjeto1 {

    public static void executarTema(String titulo, TemaFactory factory) {
        System.out.println("=== " + titulo + " ===");
        Personagem personagem = factory.criarPersonagem();
        Arma arma = factory.criarArma();

        personagem.equiparArma(arma);
        personagem.exibirInfo();
        arma.exibirInfo();
        personagem.atacar();
        arma.usar();
        personagem.guardarArma();
        System.out.println();
    }

    public static void main(String[] args) {
        executarTema("Tema Medieval", new TemaMedievalFactory());
        executarTema("Tema Futurista", new TemaFuturistaFactory());
    }
}
