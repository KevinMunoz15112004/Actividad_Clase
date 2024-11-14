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

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void imprimirDatos() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Color: " + color);
        System.out.println("Edad: " + edad);
    }

    public void detallar(){
        System.out.println(tipo + " " + color + " " + " " + edad);

    }
}
