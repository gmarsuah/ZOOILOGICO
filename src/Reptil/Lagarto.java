package Reptil;

import java.util.Random;

/**
 * Clase que representa un Lagarto, que es un tipo de reptil.
 */
public class Lagarto extends Reptil {
    protected String colorPiel; // Color de la piel del lagarto
    protected String tamano; // Tamaño del lagarto

    private static final String[] coloresPosibles = {"Verde", "Marrón", "Gris"};
    private static final String[] tamanosPosibles = {"Pequeño", "Mediano", "Grande"};

    // Constructor sin parámetros
    /**
     * Constructor sin parámetros que crea un lagarto con valores aleatorios para color de piel y tamaño.
     */
    public Lagarto() {
        super();
        Random random = new Random();
        this.colorPiel = coloresPosibles[random.nextInt(coloresPosibles.length)];
        this.tamano = tamanosPosibles[random.nextInt(tamanosPosibles.length)];
    }

    // Constructor con parámetros
    /**
     * Constructor con parámetros que permite especificar todas las características del lagarto.
     *
     * @param nombre          Nombre del lagarto.
     * @param edad            Edad del lagarto.
     * @param peso            Peso del lagarto.
     * @param tipoPiel        Tipo de piel del lagarto.
     * @param esVeneno        Indica si el lagarto es venenoso o no.
     * @param habitat         Hábitat del lagarto.
     * @param colorPiel       Color de la piel del lagarto.
     * @param tamano          Tamaño del lagarto.
     */
    public Lagarto(String nombre, int edad, float peso, String tipoPiel, boolean esVeneno, String habitat, String colorPiel, String tamano) {
        super(nombre, edad, peso, tipoPiel, esVeneno, habitat);
        this.colorPiel = colorPiel;
        this.tamano = tamano;
    }

    // Método específico del lagarto para regenerar su cola
    /**
     * Método que simula al lagarto regenerando su cola.
     */
    public void regenerarCola() {
        System.out.println(nombre + " regenera su cola.");
    }

    @Override
    public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
                this::comer,
                this::dormir,
                this::moverse,
                this::tomarSol,
                this::mudarPiel,
                this::regenerarCola
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
