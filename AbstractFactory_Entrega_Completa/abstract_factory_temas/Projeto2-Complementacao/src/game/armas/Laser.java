package game.armas;

public class Laser implements Arma {
    @Override
    public void usar() {
        System.out.println("Laser destrói o inimigo com energia pura!");
    }

    @Override
    public void guardar() {
        System.out.println("Laser foi guardado.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Arma: Laser | Tipo: Longa Distância");
    }

    @Override
    public String getNome() {
        return "Laser";
    }
}
