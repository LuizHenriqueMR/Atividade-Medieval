package game.armas;

public class Espada implements Arma {
    @Override
    public void usar() {
        System.out.println("Espada corta o inimigo com precisão!");
    }

    @Override
    public void guardar() {
        System.out.println("Espada foi guardada.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Arma: Espada | Tipo: Corpo a Corpo");
    }

    @Override
    public String getNome() {
        return "Espada";
    }
}
