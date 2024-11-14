public class Tortuga extends Mascota{
    private double tamanioCaparazon;
    private int edad;
    private String especie;

    public Tortuga(double tamanioCaparazon, int edad, String especie) {
        this.tamanioCaparazon = tamanioCaparazon;
        this.edad = edad;
        this.especie = especie;
    }

    public Tortuga() {

    }
    public double getTamanioCaparazon() {
        return tamanioCaparazon;
    }

    public void setTamanioCaparazon(double tamanioCaparazon) {
        this.tamanioCaparazon = tamanioCaparazon;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void imprimirDatos() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Edad: " + edad);
        System.out.println("Tamaño del Caparazon: " + tamanioCaparazon);
    }

    public void imprimirSaludo() {
        System.out.println("Hola, soy una tortuga de la especie " + especie + " y tengo " + edad + " años.");
    }
}
