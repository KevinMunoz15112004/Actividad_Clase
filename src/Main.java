public class Main {
    public static void main(String[] args) {
        //Clase 1
        System.out.println("--- CLASE 1: ARDILLA ---");
        Ardilla ardilla = new Ardilla();
        ardilla.mostrarDatos();
        ardilla.imprimirDatos();
        //Clase 2
        System.out.println("--- CLASE 2: CONEJO ---");
        Conejo conejo = new Conejo("Conejo", "Blanco", 3);
        conejo.imprimirDatos();
        conejo.mostrarDatos();
        conejo.mostrarDatosConFormato();
        //Clase 3
        System.out.println("--- CLASE 3: PERRO ---");
        Perro perro = new Perro("Lucas", 4, "Pitbull");
        perro.mostrarDetalles();
        perro.mostrarEdadEnAniosPerro();
        //Clase 4
        System.out.println("--- CLASE 4: GATO ---");
        Gato gato = new Gato("Jose", 6, true);
        Gato gato2  = new Gato("Gato", "Negro", 8);
        gato.imprimirDatos();
        gato.imprimirSaludo();
        //Clase 5
        System.out.println("--- CLASE 5: TORTUGA ---");
        Tortuga tortuga = new Tortuga();
        tortuga.setTamanioCaparazon(20.0);
        tortuga.setEdad(10);
        tortuga.setEspecie("Tortuga");
        tortuga.imprimirDatos();
        tortuga.imprimirSaludo();

    }
}