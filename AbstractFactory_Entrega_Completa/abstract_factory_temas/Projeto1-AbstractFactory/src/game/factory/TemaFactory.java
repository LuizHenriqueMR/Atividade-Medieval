package game.factory;

import game.armas.Arma;
import game.personagens.Personagem;

public interface TemaFactory {
    Personagem criarPersonagem();
    Arma criarArma();
}
