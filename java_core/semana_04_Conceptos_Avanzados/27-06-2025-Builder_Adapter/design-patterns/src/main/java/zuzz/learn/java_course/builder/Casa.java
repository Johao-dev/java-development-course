package zuzz.learn.java_course.builder;

import java.util.List;

@SuppressWarnings("unused")
public class Casa {

    private List<Pared> paredes;
    private Piso piso;
    private Puerta puerta;
    private Jardin jardin;
    private Piscina piscina;
    private Estatua estatua;

    public Casa(Casa.Builder builder) {
        this.paredes = builder.paredes;
        this.piso = builder.piso;
        this.puerta = builder.puerta;
        this.jardin = builder.jardin;
        this.piscina = builder.piscina;
        this.estatua = builder.estatua;
    }

    public static class Builder {

        private List<Pared> paredes;
        private Piso piso;
        private Puerta puerta;
        private Jardin jardin;
        private Piscina piscina;
        private Estatua estatua;

        public Builder construirParedes(List<Pared> paredes) {
            this.paredes = paredes;
            return this;
        }

        public Builder construirPiso(Piso piso) {
            this.piso = piso;
            return this;
        }

        public Builder construirPuerta(Puerta puerta) {
            this.puerta = puerta;
            return this;
        }

        public Builder construirJardin(Jardin jardin) {
            this.jardin = jardin;
            return this;
        }

        public Builder construirPiscina(Piscina piscina) {
            this.piscina = piscina;
            return this;
        }

        public Builder construirEstatua(Estatua estatua) {
            this.estatua = estatua;
            return this;
        }

        public Casa build() {
            Casa casa = new Casa(this);
            return casa;
        }
    }
}
