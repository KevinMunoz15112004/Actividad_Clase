public class Ardilla extends Mascota {
    private String color;
    private double tamaño;

    public Ardilla() {
    }

    public void mostrarDatos() {
        System.out.println("Color: " + color);
    }
    public void imprimirDatos() {
        System.out.println("Tamaño: " + tamaño);
    }
}