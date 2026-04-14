package game.armas;

public class Cajado implements Arma {
    @Override
    public void usar() {
        System.out.println("Cajado lança uma rajada de energia mística!");
    }

    @Override
    public void guardar() {
        System.out.println("Cajado foi guardado.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Arma: Cajado | Tipo: Mágico");
    }

    @Override
    public String getNome() {
        return "Cajado";
    }
}
