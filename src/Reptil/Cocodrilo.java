package Reptil;

import java.util.Random;

/**
 * Clase que representa un Cocodrilo, que es un tipo de reptil.
 */
public class Cocodrilo extends Reptil {
    private double tamaño; // Tamaño del cocodrilo en metros
    private double fuerzaMordida; // Fuerza de mordida del cocodrilo en Newtons

    /**
     * Constructor sin parámetros que crea un cocodrilo con valores aleatorios para tamaño y fuerza de mordida.
     */
    public Cocodrilo() {
        super();
        Random random = new Random();
        this.tamaño = random.nextDouble() * 5 + 1; // Tamaño aleatorio entre 1 y 6 metros
        this.fuerzaMordida = random.nextDouble() * 1500 + 1000; // Fuerza de mordida aleatoria entre 1000 y 2500 Newtons
    }

    /**
     * Constructor con parámetros que permite especificar todas las características del cocodrilo.
     *
     * @param nombre          Nombre del cocodrilo.
     * @param edad            Edad del cocodrilo.
     * @param peso            Peso del cocodrilo.
     * @param tipoPiel        Tipo de piel del cocodrilo.
     * @param esVeneno        Indica si el cocodrilo es venenoso o no.
     * @param habitat         Hábitat del cocodrilo.
     * @param tamaño          Tamaño del cocodrilo en metros.
     * @param fuerzaMordida   Fuerza de mordida del cocodrilo en Newtons.
     */
    public Cocodrilo(String nombre, int edad, float peso, String tipoPiel, boolean esVeneno, String habitat, double tamaño, double fuerzaMordida) {
        super(nombre, edad, peso, tipoPiel, esVeneno, habitat);
        this.tamaño = tamaño;
        this.fuerzaMordida = fuerzaMordida;
    }

    /**
     * Método que simula al cocodrilo sumergiéndose bajo el agua para cazar.
     */
    public void sumergirse() {
        System.out.println(nombre + " el cocodrilo se sumerge bajo el agua para cazar.");
    }

    /**
     * Método que simula al cocodrilo acechando a su presa en la orilla antes de atacar.
     */
    public void cazar() {
        System.out.println(nombre + " el cocodrilo acecha a su presa en la orilla, esperando el momento adecuado para atacar.");
    }

    /**
     * Método que muestra información sobre el cocodrilo, incluyendo su tamaño y fuerza de mordida.
     */
    @Override
    public void verAnimal() {
        super.verAnimal();
        System.out.println("Tamaño: " + tamaño + " metros");
        System.out.println("Fuerza de mordida: " + fuerzaMordida + " Newtons");
    }
}
