package game.transportes;

public class NaveEspacial implements Transporte {
    @Override
    public void mover() {
        System.out.println("Nave Espacial cruza o espaço com propulsão avançada.");
    }

    @Override
    public void estacionar() {
        System.out.println("Nave Espacial entra em modo de pouso.");
    }

    @Override
    public void exibirInfo() {
        System.out.println("Transporte: Nave Espacial | Tipo: Aéreo/Espacial");
    }
}
