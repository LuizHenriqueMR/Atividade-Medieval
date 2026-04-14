package game;

import java.util.Scanner;

import game.armas.Arma;
import game.factory.RegistroTemas;
import game.factory.TemaFactory;
import game.personagens.Personagem;
import game.transportes.Transporte;

public class MainProjeto2 {

    private static void executarTema(TemaFactory factory) {
        Personagem personagem = factory.criarPersonagem();
        Arma arma = factory.criarArma();
        Transporte transporte = factory.criarTransporte();

        System.out.println();
        System.out.println("=== Tema " + factory.getTemaNome() + " ===");

        personagem.equiparArma(arma);
        personagem.exibirInfo();
        arma.exibirInfo();
        transporte.exibirInfo();
        personagem.atacar();
        arma.usar();
        personagem.guardarArma();
        transporte.mover();
        transporte.estacionar();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temas disponíveis: " + RegistroTemas.temasDisponiveis());
        System.out.print("Digite o tema desejado: ");

        try {
            String escolha = scanner.nextLine();
            TemaFactory factory = RegistroTemas.criar(escolha);
            executarTema(factory);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
