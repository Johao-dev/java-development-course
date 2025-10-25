/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tareamiguel;

/**
 *
 * @author migue
 */
public class SofaModerno implements Sofa{

    @Override
    public void describir() {
        System.out.println("Sofá moderno: tapizado minimalista y estructura metálica.");
    }

    @Override
    public String obtenerNombre() {
        return "Sofá Moderno";
    }
    
}
