
package com.mycompany.tareamiguel;

public class FabricaMueblesModerna implements FabricaMuebles{

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaModerno();
    }

    @Override
    public MesaDeCentro crearMesaDeCentro() {
        return new MesaDeCentroModerna();
    }
    
    
}
