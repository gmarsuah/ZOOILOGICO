package Anfibio;

import java.util.Random;
import Zoo.Animal;

/**
 * Clase {@code Anfibio} que extiende de {@code Animal}. Representa características generales de los anfibios,
 * incluyendo su habilidad para respirar bajo el agua y el color de su piel.
 */
public class Anfibio extends Animal {
    protected boolean puedeRespirarBajoAgua;
    protected String colorPiel;

    private static final String[] coloresPielPosibles = {"verde", "marrón", "amarillo"};

    /**
     * Constructor por defecto que crea un anfibio con características aleatorias.
     */
    public Anfibio() {
        super();
        Random random = new Random();
        this.puedeRespirarBajoAgua = random.nextBoolean();
        this.colorPiel = coloresPielPosibles[random.nextInt(coloresPielPosibles.length)];
    }

    /**
     * Constructor que inicializa un anfibio con los parámetros especificados.
     * 
     * @param nombre El nombre del anfibio.
     * @param edad La edad del anfibio en años.
     * @param peso El peso del anfibio en kilogramos.
     * @param puedeRespirarBajoAgua Indica si el anfibio puede respirar bajo el agua.
     * @param colorPiel El color de la piel del anfibio.
     */
    public Anfibio(String nombre, int edad, float peso, boolean puedeRespirarBajoAgua, String colorPiel) {
        super(nombre, edad, peso);
        this.puedeRespirarBajoAgua = puedeRespirarBajoAgua;
        this.colorPiel = colorPiel;
    }

    /**
     * Método para simular que el anfibio está nadando.
     */
    public void nadar() {
        System.out.println(nombre + " está nadando.");
    }

    /**
     * Método para simular la metamorfosis del anfibio.
     */
    public void metamorfosis() {
        System.out.println(nombre + " está pasando por una metamorfosis.");
    }

    /**
     * Sobrescribe el método {@code verAnimal} de la clase base para realizar acciones aleatorias,
     * incluyendo comer, dormir, moverse, nadar y pasar por una metamorfosis.
     */
    @Override
    public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
            this::comer,
            this::dormir,
            this::moverse,
            this::nadar,
            this::metamorfosis
        };

        try {
            for (int i = 0; i < 5; i++) {
                int indiceAccion = random.nextInt(acciones.length);
                acciones[indiceAccion].run();

                int tiempoEspera = random.nextInt(2000) + 1000;
                Thread.sleep(tiempoEspera);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
