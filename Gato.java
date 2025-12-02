package ejercicio7;

System.out.println("Hola");

public class Gato {
    private String nombre;
    private String raza;
    private float altura;
    private float peso;
    private String color;

    public Gato(String nombre, String raza, float altura, float peso, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.altura = altura;
        this.peso = peso;
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", color='" + color + '\'' +
                '}';
    }
}
