package ejercicio4;

public class Coche {
    private String marca;
    private double precio;

    public Coche() {
        marca = "";
        precio = 0;
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double CalcularPrecioIva() {
        return getPrecio() * 1.21;
    }

    public static String empezar_conducir(String empezar) {
        empezar = "1.Arrancar coche \n2.Meter marcha \n3.Acelerar coche";
        return empezar;
    }

    public int CompararPrecioCoche(Coche coche3) {
        if (this.precio == coche3.getPrecio()) {
            return 0;
        } else if (this.precio > coche3.getPrecio()) {
            return 1;
        } else {
            return -1;
        }
    }
}
