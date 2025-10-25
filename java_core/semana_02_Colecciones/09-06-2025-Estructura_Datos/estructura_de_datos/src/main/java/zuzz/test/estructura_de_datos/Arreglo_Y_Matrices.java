package zuzz.test.estructura_de_datos;

import java.util.ArrayList;
import java.util.List;

public class Arreglo_Y_Matrices {
    
    public void diferenciaArregloEstructuraDeDatos() {
        // Estructura de datos
        List<Integer> numeros = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            numeros.add(i);
            System.out.println("numero: " + i);
        }
    }
    
    public void arreglo() {
        // arreglo unidireccional
        int[] numeros = new int[15];
        for (int i = 0; i < 20; i++) {
            numeros[i] = i;
            System.out.println("numero: " + i);
        }
        
        // arreglo bidireccional
        int[][] numerosAjedrez = new int[8][8];
    }
    
    public static void main(String[] args) {
        Arreglo_Y_Matrices instancia = new Arreglo_Y_Matrices();
//        instancia.arreglo();
        instancia.diferenciaArregloEstructuraDeDatos();
    }
}
