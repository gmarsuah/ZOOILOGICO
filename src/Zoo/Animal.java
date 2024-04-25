package Zoo;

import java.util.Random;

/**
 * Clase {@code Animal} que representa características y comportamientos comunes a todos los animales en el zoo.
 * Incluye funciones básicas como comer, dormir y moverse.
 */
public class Animal {
    // Variables de instancia que describen los atributos básicos de cualquier animal.
    protected String nombre;
    protected int edad;
    protected float peso;
    private static final String[] nombresPosibles = {
        "Leo", "Max", "Luna", "Bella", "Rocky", "Charlie", "Molly", "Buddy", "Daisy", "Maggie",
        "Oscar", "Rex", "Toby", "Coco", "Ruby", "Sammy", "Sasha", "Teddy", "Willow", "Zoe",
        "Archie", "Bailey", "Bandit", "Bruno", "Cleo", "Ellie", "Finn", "George", "Gizmo", "Harley",
        "Jasper", "Koda", "Lola", "Lucky", "Milo", "Nala", "Oliver", "Penny", "Pepper", "Rosie",
        "Simba", "Sophie", "Stella", "Tucker", "Winston", "Ziggy", "Amber", "Apollo", "Blu", "Boomer",
        "Chase", "Chester", "Chico", "Duke", "Felix", "Freddie", "Ginger", "Hunter", "Ivy", "Jack",
        "Juno", "Kai", "King", "Leia", "Louie", "Mia", "Murphy", "Nova", "Otis", "Piper",
        "Ranger", "Romeo", "Rusty", "Scout", "Shadow", "Sky", "Spike", "Storm", "Tiger", "Zeus"
    };

    /**
     * Constructor que inicializa un animal con un nombre, edad y peso específicos.
     * 
     * @param nombre El nombre del animal.
     * @param edad La edad del animal en años.
     * @param peso El peso del animal en kilogramos.
     */
    public Animal(String nombre, int edad, float peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    /**
     * Constructor por defecto que crea un animal con un nombre aleatorio, edad entre 1 y 15 años,
     * y un peso entre 0.5 y 10.0 kilogramos.
     */
    public Animal() {
        Random random = new Random();
        this.nombre = nombresPosibles[random.nextInt(nombresPosibles.length)];
        this.edad = random.nextInt(15) + 1;  // Edad entre 1 y 15 años
        this.peso = 0.5f + (10 - 0.5f) * random.nextFloat();  // Peso entre 0.5 y 10.0 kilogramos
    }

    /**
     * Simula el comportamiento de comer del animal.
     */
    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    /**
     * Simula el comportamiento de dormir del animal.
     */
    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    /**
     * Simula el comportamiento de movimiento del animal.
     */
    public void moverse() {
        System.out.println(nombre + " se está moviendo.");
    }
    
    /**
     * Muestra las actividades del animal de manera aleatoria, ejecutando una de las acciones básicas: comer, dormir o moverse.
     */
    public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
            this::comer,
            this::dormir,
            this::moverse
        };

        try {
            for (int i = 0; i < 3; i++) {  // Ejecuta 3 acciones aleatorias
                int indiceAccion = random.nextInt(acciones.length);
                acciones[indiceAccion].run();  // Ejecuta la acción seleccionada

                int tiempoEspera = random.nextInt(2000) + 1000;  // Espera entre 1 y 2 segundos
                Thread.sleep(tiempoEspera);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
