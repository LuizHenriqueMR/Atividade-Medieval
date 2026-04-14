package game.personagens;

import game.armas.Arma;

public class Cavaleiro implements Personagem {
    private Arma arma;

    @Override
    public void atacar() {
        System.out.println("Cavaleiro ataca brandindo sua Espada!");
    }

    @Override
    public void defender() {
        System.out.println("Cavaleiro ergue sua defesa medieval.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Personagem: Cavaleiro | Tema: Medieval");
    }

    @Override
    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void guardarArma() {
        System.out.println("Cavaleiro guarda " + arma.getNome() + ".");
    }
}
