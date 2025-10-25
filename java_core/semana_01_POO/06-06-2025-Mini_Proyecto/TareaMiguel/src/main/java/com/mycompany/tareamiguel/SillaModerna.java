
package com.mycompany.tareamiguel;

/**
 *
 * @author migue
 */
public class SillaModerna implements Silla{

    @Override
    public void describir() {
        System.out.println("Silla moderna: líneas limpias, metal y cuero.");
    }

    @Override
    public String obtenerNombre() {
         return "Silla Moderna";
    }
    
}
