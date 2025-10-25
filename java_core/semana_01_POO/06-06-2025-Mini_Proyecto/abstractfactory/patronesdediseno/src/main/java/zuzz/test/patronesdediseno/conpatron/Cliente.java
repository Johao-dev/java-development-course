package zuzz.test.patronesdediseno.conpatron;

public class Cliente {

    public static void main(String[] args) {
        FabricaSofas fabrica = new FabricaSofaModerno();
        Sofa sofa = fabrica.crearSofa();
        sofa.mostrarInfo();
    }
}
