package game.personagens;

import game.armas.Arma;

public interface Personagem {
    void atacar();
    void defender();
    void exibirInfo();
    void equiparArma(Arma arma);
    void guardarArma();
}
