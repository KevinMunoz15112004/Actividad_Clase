public class Perro extends Mascota{
    private String nombre;
    private int edad;
    private String raza;

    public Perro(String tipo, String color, int edad, String nombre, int edad1, String raza) {
        super(tipo, color, edad);
        this.nombre = nombre;
        this.edad = edad1;
        this.raza = raza;
    }

    public Perro(String nombre, int edad, String raza) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + ", Raza: " + raza);
    }

    public void mostrarEdadEnAniosPerro() {
        int edadEnAniosPerro = edad * 7;
        System.out.println("Edad en años de perro: " + edadEnAniosPerro);
    }
}
