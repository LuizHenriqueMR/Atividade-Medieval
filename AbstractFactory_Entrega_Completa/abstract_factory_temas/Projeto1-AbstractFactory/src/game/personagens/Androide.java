package game.personagens;

import game.armas.Arma;

public class Androide implements Personagem {
    private Arma arma;

    @Override
    public void atacar() {
        System.out.println("Androide ataca disparando seu Laser!");
    }

    @Override
    public void defender() {
        System.out.println("Androide ativa seu escudo de energia.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Personagem: Androide | Tema: Futurista");
    }

    @Override
    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void guardarArma() {
        System.out.println("Android guarda " + arma.getNome() + ".");
    }
}
