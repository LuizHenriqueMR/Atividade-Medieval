package game.factory;

import game.armas.Arma;
import game.armas.Espada;
import game.personagens.Cavaleiro;
import game.personagens.Personagem;
import game.transportes.Cavalo;
import game.transportes.Transporte;

public class TemaMedievalFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Cavaleiro();
    }

    @Override
    public Arma criarArma() {
        return new Espada();
    }

    @Override
    public Transporte criarTransporte() {
        return new Cavalo();
    }

    @Override
    public String getTemaNome() {
        return "Medieval";
    }
}
