public class Gato extends Mascota {
    private String nombre;
    private double peso;
    private boolean esterilizado;

    public Gato(String tipo, String color, int edad, String nombre, double peso, boolean esterilizado) {
        super(tipo, color, edad);
        this.nombre = nombre;
        this.peso = peso;
        this.esterilizado = esterilizado;
    }

    public Gato(String nombre, double peso, boolean esterilizado){
        this.nombre = nombre;
        this.peso = peso;
        this.esterilizado = esterilizado;
    }

    public Gato(String tipo, String color, int edad){
        super(tipo, color, edad);
    }

    public void imprimirDatos2() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Peso: " + peso);
        System.out.println("Esterilizado: " + (esterilizado ? "Sí" : "No"));
    }

    public void imprimirSaludo() {
        System.out.println("Miau! Soy " + nombre + " y peso " + peso + " kg.");
    }
}
