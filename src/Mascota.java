public class Mascota {
    String tipo;
    String color;
    int edad;

    public Mascota() {

    }

    public Mascota(String tipo, String color, int edad) {
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
    }
}
