package zuzz.test.colecciones.MiguelTareita;

import java.util.Objects;

/**
 *
 * @author migue
 */
public class Producto {
    private String nombre;
    private double precio;
    
    
    
    public Producto(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    
    @Override
    public String toString(){
        return "Producto: " + this.nombre + "\nPrecio: " + this.precio+"\n";
        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.nombre);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.precio) ^ (Double.doubleToLongBits(this.precio) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (Double.doubleToLongBits(this.precio) != Double.doubleToLongBits(other.precio)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
 
}
