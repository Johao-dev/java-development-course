package zuzz.test.patronesdediseno.sinpatron;

public class Problema {

    public static void main(String[] args) {
        Fabrica fabricaSillas = new Fabrica();
        Cliente cliente1 = new Cliente();
        
        // el cliente pide una silla
        cliente1.pedirSilla("moderna");
        
        // representa la silla que pidio el cliente
        String variante = "moderna";
        
        // obtenemos la silla del cliente
        Silla sillaCliente = fabricaSillas.getSilla(variante);
        System.out.println(sillaCliente.toString());
    }
}
