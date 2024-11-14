public class Conejo extends Mascota {
    private String raza;

    public Conejo(String tipo, int edad, String color, String raza) {
        super(tipo, color, edad);
        this.raza = raza;
    }

    public Conejo(String tipo, String color, int edad) {
        super(tipo, color, edad);
    }

    public String getRaza() {
        return raza;
    }

    public void mostrarDatos1() {
        System.out.println("Raza: " + getRaza());
    }

    public void mostrarDatosConFormato() {
        System.out.printf("Conejo {Raza: %s}%n", raza);
    }

}
