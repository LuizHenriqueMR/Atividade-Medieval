package game.personagens;

import game.armas.Arma;

public class Mago implements Personagem {
    private Arma arma;

    @Override
    public void atacar() {
        System.out.println("Mago ataca canalizando o poder do seu Cajado!");
    }

    @Override
    public void defender() {
        System.out.println("Mago cria uma barreira arcana para se defender.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Personagem: Mago | Tema: Fantasia");
    }

    @Override
    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void guardarArma() {
        System.out.println("Mago guarda " + arma.getNome() + ".");
    }
}
