package game.factory;

import game.armas.Arma;
import game.armas.Laser;
import game.personagens.Androide;
import game.personagens.Personagem;
import game.transportes.NaveEspacial;
import game.transportes.Transporte;

public class TemaFuturistaFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Androide();
    }

    @Override
    public Arma criarArma() {
        return new Laser();
    }

    @Override
    public Transporte criarTransporte() {
        return new NaveEspacial();
    }

    @Override
    public String getTemaNome() {
        return "Futurista";
    }
}
