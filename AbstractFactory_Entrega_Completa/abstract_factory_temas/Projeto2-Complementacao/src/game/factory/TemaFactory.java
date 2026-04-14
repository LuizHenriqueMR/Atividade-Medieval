package game.factory;

import game.armas.Arma;
import game.personagens.Personagem;
import game.transportes.Transporte;

public interface TemaFactory {
    Personagem criarPersonagem();
    Arma criarArma();
    Transporte criarTransporte();
    String getTemaNome();
}
