package game.transportes;

public class Cavalo implements Transporte {
    @Override
    public void mover() {
        System.out.println("Cavalo atravessa o caminho em alta velocidade.");
    }

    @Override
    public void estacionar() {
        System.out.println("Cavalo para ao lado do personagem.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Transporte: Cavalo | Terreno: Terrestre");
    }
}
