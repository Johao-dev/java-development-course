package zuzz.learn.spring_framework;

import org.springframework.stereotype.Component;

// POJO: Plain Old Java Object
@Component
public class Objeto {

    private String valor;

    public Objeto() {

    }

    public Objeto(String valor) {
        this.valor = valor;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((valor == null) ? 0 : valor.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Objeto other = (Objeto) obj;
        if (valor == null) {
            if (other.valor != null)
                return false;
        } else if (!valor.equals(other.valor))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Objeto [valor=" + valor + "]";
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
