public class Tortuga extends Mascota{
    private double tamanioCaparazon;
    private String especie;

    public Tortuga(String tipo, String color, int edad, double tamanioCaparazon, String especie) {
        super(tipo, color, edad);
        this.tamanioCaparazon = tamanioCaparazon;
        this.especie = especie;
    }

    public Tortuga() {
    }

    public Tortuga(String tipo,String color,int edad){
        super(tipo,color,edad);
    }

    public Tortuga(String especie, double tamanioCaparazon){
        this.especie = especie;
        this.tamanioCaparazon = tamanioCaparazon;
    }

    public void setTamanioCaparazon(double tamanioCaparazon) {
        this.tamanioCaparazon = tamanioCaparazon;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void imprimirDatos2() {
        System.out.println("Especie: " + getEspecie());
        System.out.println("Tamaño del Caparazon: " + tamanioCaparazon);
    }

    public void imprimirSaludo1() {
        System.out.println("Hola, soy una tortuga de la especie " + especie);
    }
}
