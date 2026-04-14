package game.factory;

import game.armas.Arma;
import game.armas.Cajado;
import game.personagens.Mago;
import game.personagens.Personagem;
import game.transportes.Dragao;
import game.transportes.Transporte;

public class TemaFantasiaFactory implements TemaFactory {
    @Override
    public Personagem criarPersonagem() {
        return new Mago();
    }

    @Override
    public Arma criarArma() {
        return new Cajado();
    }

    @Override
    public Transporte criarTransporte() {
        return new Dragao();
    }

    @Override
    public String getTemaNome() {
        return "Fantasia";
    }
}
