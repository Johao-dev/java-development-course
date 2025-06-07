package zuzz.test.patronesdediseno.sinpatron;

public class Fabrica {

    // modificar de acceso - tipo de retorno - nombre del metodo (parametros)
    public Silla getSilla(String variante) {
        if (null == variante) {
            return new Silla("Sin variante");
        } else return switch (variante) {
            case "moderna" -> new Silla("moderna");
            case "victoriana" -> new Silla("victoriana");
            case "artDeco" -> new Silla("artDeco");
            case "rustica" -> new Silla("rustica");
            default -> new Silla("Sin variante");
        };
    }
}
