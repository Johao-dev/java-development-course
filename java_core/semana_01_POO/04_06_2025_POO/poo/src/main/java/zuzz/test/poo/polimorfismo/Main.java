package zuzz.test.poo.polimorfismo;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        
        PagoEfectivo metodoPago1 = new PagoEfectivo();
        PagoTarjeta metodoPago2 = new PagoTarjeta();
        PagoMovil metodoPago3 = new PagoMovil();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Elige metodo de pago:\n1.Efectivo.\n2.Tarjeta\n3.Yape");
        String metodoPago = sc.nextLine();
        
        switch (metodoPago) {
            case "efectivo" -> {
                metodoPago1.pagar();
            }
            case "tarjeta" -> {
                metodoPago2.pagar();
            }
            case "yape" -> {
                metodoPago3.pagar();
            }
        }
    }
}
