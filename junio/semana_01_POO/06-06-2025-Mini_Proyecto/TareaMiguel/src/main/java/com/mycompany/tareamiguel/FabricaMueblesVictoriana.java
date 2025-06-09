/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamiguel;

/**
 *
 * @author migue
 */
public class FabricaMueblesVictoriana implements FabricaMuebles{

    @Override
    public Silla crearSilla() {
        return new SillaVictoriana();
    }

    @Override
    public Sofa crearSofa() {
        return new SofaVictoriano();
    }

    @Override
    public MesaDeCentro crearMesaDeCentro() {
        return new MesaDeCentroVictoriana();
    }
}
