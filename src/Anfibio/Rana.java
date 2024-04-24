package Anfibio;

import java.util.Random;

/**
 * Clase {@code Rana} que extiende de {@code Anfibio}. Representa características y comportamientos específicos de las ranas,
 * incluyendo su capacidad de cambiar de color y sus movimientos únicos en el agua y en tierra.
 */
public class Rana extends Anfibio {
    private static final String[] coloresPielPosibles = {"verde", "rojo", "azul"};

    /**
     * Constructor por defecto que inicializa una rana con un color de piel aleatorio de las opciones disponibles.
     */
    public Rana() {
        super();
        Random random = new Random();
        this.colorPiel = coloresPielPosibles[random.nextInt(coloresPielPosibles.length)];
    }

    /**
     * Constructor que inicializa una rana con los parámetros especificados.
     * 
     * @param nombre El nombre de la rana.
     * @param edad La edad de la rana en años.
     * @param peso El peso de la rana en kilogramos.
     * @param puedeRespirarBajoAgua Indica si la rana puede respirar bajo el agua.
     * @param colorPiel El color de la piel de la rana.
     */
    public Rana(String nombre, int edad, float peso, boolean puedeRespirarBajoAgua, String colorPiel) {
        super(nombre, edad, peso, puedeRespirarBajoAgua, colorPiel);
    }

    /**
     * Sobrescribe el método {@code nadar} para mostrar cómo la rana salta en el agua.
     */
    @Override
    public void nadar() {
        System.out.println(nombre + " la rana está dando saltos en el agua.");
    }

    /**
     * Sobrescribe el método {@code moverse} para describir cómo la rana se mueve saltando por la tierra.
     */
    @Override
    public void moverse() {
        System.out.println(nombre + " la rana está saltando por la tierra.");
    }

    /**
     * Método que simula el croar de la rana.
     */
    public void croar() {
        System.out.println(nombre + " está croando.");
    }

    /**
     * Sobrescribe el método {@code verAnimal} para agregar el comportamiento de croar después de ejecutar las acciones
     * definidas en la clase base {@code Anfibio}.
     */
    @Override
    public void verAnimal() {
        super.verAnimal(); // Llama al método verAnimal de Anfibio
        try {
            croar();
            Thread.sleep(500); // Espera medio segundo después de croar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
