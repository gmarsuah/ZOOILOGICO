package Ave;

import java.util.Random;

/**
 * La clase Colibri representa a un colibri, un tipo de ave pequeña y rapida que se alimenta principalmente de nectar.
 * Extiende la clase Ave e implementa comportamientos especificos para el colibri.
 */
public class Colibri extends Ave {

    private int velocidadAleteo; // La velocidad a la que bate las alas el colibri
    private String tipoAlimentacion; // El tipo de alimentacion del colibri

    // Constructor sin parametros
    public Colibri() {
        super();
        Random random = new Random();
        this.velocidadAleteo = random.nextInt(101); // Asigna una velocidad aleatoria entre 0 y 100
        this.tipoAlimentacion = "nectar"; // Establece el tipo de alimentación como néctar
    }

    /**
     * Metodo para simular el vuelo estacionario del colibri.
     */
    public void volarEstacionario() {
        System.out.println(nombre + " el colibrí está volando estacionario, batiendo sus alas a una velocidad de " + velocidadAleteo + " veces por segundo.");
    }

    /**
     * Metodo para simular la búsqueda de nectar por parte del colibri.
     */
    public void buscarNectar() {
        System.out.println(nombre + " el colibrí está buscando flores para alimentarse de néctar.");
    }

    /**
     * Metodo para simular el vuelo del colibri.
     */
    @Override
    public void volar() {
        System.out.println(nombre + " el colibrí está volando con rapidez.");
    }

    /**
     * Metodo para simular la emision de sonidos por parte del colibri.
     */
    @Override
    public void emitirSonido() {
        System.out.println(nombre + " el colibrí está emitiendo sonidos melodiosos.");
    }
    
    /**
     * Metodo para simular la puesta de huevos del colibri.
     */
    @Override
    public void ponerHuevos() {
		System.out.println(nombre+" está poniendo un huevo.");
	}

    /**
     * Metodo para visualizar la informacion del colibri.
     */
    @Override
    public void verAnimal() {
        super.verAnimal(); // Llama al metodo verAnimal de Ave
        try {
            volarEstacionario();
            Thread.sleep(500); // Espera medio segundo despues de volar estacionario
            buscarNectar();
            Thread.sleep(500); // Espera medio segundo despues de buscar nectar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
