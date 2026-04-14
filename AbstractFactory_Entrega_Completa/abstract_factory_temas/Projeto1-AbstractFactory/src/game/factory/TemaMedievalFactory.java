package game.factory;

import game.armas.Arma;
import game.armas.Espada;
import game.personagens.Cavaleiro;
import game.personagens.Personagem;

public class TemaMedievalFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Cavaleiro();
    }

    @Override
    public Arma criarArma() {
        return new Espada();
    }
}
