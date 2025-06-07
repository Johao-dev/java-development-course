package zuzz.test.patronesdediseno.conpatron;

public class FabricaSillaGamer implements FabricaSillas {

    @Override
    public Silla crearSilla() {
        return new SillaGamer();
    }
}
