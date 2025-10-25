package zuzz.test.patronesdediseno.conpatron;

public class FabricaSillaVictoriana implements FabricaSillas {
    
    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }
}
