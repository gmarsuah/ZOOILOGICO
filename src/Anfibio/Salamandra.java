package Anfibio;

/**
 * Clase {@code Salamandra} que extiende de {@code Anfibio}. Representa características y comportamientos específicos de las salamandras,
 * como su capacidad para reptar lentamente y regenerar partes de su cuerpo.
 */
public class Salamandra extends Anfibio {
    // Atributos específicos de Salamandra podrían añadirse aquí

    /**
     * Constructor por defecto que inicializa una salamandra con características heredadas y configuraciones predeterminadas.
     */
    public Salamandra() {
        super();
        // La salamandra podría tener configuraciones predeterminadas o valores aleatorios específicos
    }

    /**
     * Constructor que inicializa una salamandra con los parámetros especificados.
     * 
     * @param nombre El nombre de la salamandra.
     * @param edad La edad de la salamandra en años.
     * @param peso El peso de la salamandra en kilogramos.
     * @param puedeRespirarBajoAgua Indica si la salamandra puede respirar bajo el agua.
     * @param colorPiel El color de la piel de la salamandra.
     */
    public Salamandra(String nombre, int edad, float peso, boolean puedeRespirarBajoAgua, String colorPiel) {
        super(nombre, edad, peso, puedeRespirarBajoAgua, colorPiel);
    }

    /**
     * Sobrescribe el método {@code moverse} para describir cómo la salamandra se mueve reptando lentamente.
     */
    @Override
    public void moverse() {
        System.out.println(nombre + " la salamandra está reptando lentamente.");
    }

    /**
     * Método que simula la capacidad de regeneración de la salamandra, como regenerar su cola.
     */
    public void regenerar() {
        System.out.println(nombre + " está regenerando su cola.");
    }

    /**
     * Sobrescribe el método {@code verAnimal} para agregar el comportamiento de regeneración después de ejecutar las acciones
     * definidas en la clase base {@code Anfibio}.
     */
    @Override
    public void verAnimal() {
        super.verAnimal(); // Llama al método verAnimal de Anfibio
        try {
            regenerar();
            Thread.sleep(500); // Espera medio segundo después de regenerar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
