package zuzz.test.patronesdediseno.conpatron;

public class FabricaSillaModerna implements FabricaSillas {
    
    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }
}
