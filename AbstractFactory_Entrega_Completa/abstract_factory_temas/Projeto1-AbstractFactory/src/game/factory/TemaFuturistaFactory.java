package game.factory;

import game.armas.Arma;
import game.armas.Laser;
import game.personagens.Androide;
import game.personagens.Personagem;

public class TemaFuturistaFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Androide();
    }

    @Override
    public Arma criarArma() {
        return new Laser();
    }
}
