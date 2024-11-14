public class Main {
    public static void main(String[] args) {
        //Clase 1
        System.out.println("----- CLASE 1: ARDILLA -----");
        Ardilla ardilla = new Ardilla();
        System.out.println("Clase Padre");
        ardilla.imprimirDatos();
        ardilla.detallar();
        System.out.println("Clase Hija");
        ardilla.mostrarDatos();
        ardilla.imprimirDatos1();
        //Clase 2
        System.out.println("----- CLASE 2: CONEJO -----");
        System.out.println("Clase Padre");
        Conejo conejo = new Conejo("Conejo", "Blanco", 3);
        conejo.imprimirDatos();
        conejo.detallar();
        System.out.println("Clase Hija");
        conejo.mostrarDatos1();
        conejo.mostrarDatosConFormato();
        //Clase 3
        System.out.println("----- CLASE 3: PERRO -----");
        System.out.println("Clase Hija");
        Perro perro = new Perro("Lucas", 4, "Pitbull");
        perro.mostrarDetalles();
        perro.mostrarEdadEnAniosPerro();
        System.out.println("Clase Padre");
        perro.imprimirDatos();
        perro.detallar();
        //Clase 4
        System.out.println("----- CLASE 4: GATO -----");
        System.out.println("Clase Padre");
        Gato gato2  = new Gato("Gato", "Negro", 8);
        gato2.imprimirDatos();
        gato2.detallar();
        System.out.println("Clase Hija");
        Gato gato = new Gato("Jose", 6, true);
        gato.imprimirSaludo();
        gato.imprimirDatos2();
        //Clase 5
        System.out.println("----- CLASE 5: TORTUGA -----");
        System.out.println("Clase Hija");
        Tortuga tortuga = new Tortuga();
        tortuga.setEspecie( "Tortuga" );
        tortuga.setTamanioCaparazon(2.0);
        tortuga.imprimirSaludo1();
        tortuga.imprimirDatos2();
        System.out.println("Clase Padre");
        Tortuga tortuga2 = new Tortuga();
        tortuga2.setTipo("Tortuga de Mar");
        tortuga2.setColor("Verde");
        tortuga2.setEdad(20);
        tortuga2.imprimirDatos();
        tortuga2.detallar();
    }
}