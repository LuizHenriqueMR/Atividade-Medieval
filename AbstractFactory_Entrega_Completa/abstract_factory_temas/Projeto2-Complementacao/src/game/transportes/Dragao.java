package game.transportes;

public class Dragao implements Transporte {
    @Override
    public void mover() {
        System.out.println("Dragão voa pelos céus soltando faíscas mágicas.");
    }

    @Override
    public void estacionar() {
        System.out.println("Dragão pousa próximo ao mago.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Transporte: Dragão | Tipo: Voador Místico");
    }
}
