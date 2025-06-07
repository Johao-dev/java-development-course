package zuzz.test.patronesdediseno.conpatron;

public class FabricaSofaModerno implements FabricaSofas{

    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }
}
