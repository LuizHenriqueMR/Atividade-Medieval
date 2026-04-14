package game.personagens;

public interface Personagem {
    void atacar();
    void defender();
    void exibirInfo();
    void equiparArma(game.armas.Arma arma);
    void guardarArma();
}
