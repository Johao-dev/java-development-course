/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemmenu_02;

public class main {
    
    public static void main(String[] args) {
        
        // Inicializamos y usamos Restaurante
        Restaurante vegano = new Restaurante(new VeganoFactory());
        vegano.servirComida();
        Restaurante carnivoro = new Restaurante(new CarnivoroFactory());
        carnivoro.servirComida();
        
    }
}
