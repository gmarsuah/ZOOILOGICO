// Codigo hecho por: Jorge Herrero, Ruben Chedas y Alejandro Ares
package Reptil;

import Zoo.Animal;

import java.util.Random;
/**
 * Clase reptil que extiende de animal y da los parametros y metodos a las clases hijas (serpiente...)
 */
public class Reptil extends Animal {
    // Variables de instancia específicas de los reptiles
	/**
	 * String para el tipo de piel
	 */
    protected String tipoPiel;
    /**
	 * Boolean para saber si es venenosa o no
	 */
    protected boolean esVeneno;
    /**
	 * String para identificar el tipo de habitat
	 */
    protected String habitat; 

    // Array de tipos de piel posibles
    private static final String[] tiposPielPosibles = {"escamosa", "coriácea", "rugosa"};

    // Genera un hábitat aleatorio para el reptil
    private String generarHabitatAleatorio() {
        String[] habitatsPosibles = {"desierto", "selva", "pantano", "montaña"};
        Random random = new Random();
        return habitatsPosibles[random.nextInt(habitatsPosibles.length)];
    }
    /**
     * Constructor sin parametros de reptil
     */
    // Constructor sin parámetros
    public Reptil() {
        super(); // Llama al constructor de la clase padre (Animal)
        Random random = new Random();
        // Asigna un tipo de piel aleatorio al reptil
        this.tipoPiel = tiposPielPosibles[random.nextInt(tiposPielPosibles.length)];
       
        this.esVeneno = random.nextBoolean();
        // Genera un hábitat aleatorio para el reptil
        this.habitat = generarHabitatAleatorio();
    }
    /**
     * Constructor de la clase con paramatros
     * @param nombre del animal
     * @param edad del animal
     * @param peso del animal
     * @param tipoPiel del animal
     * @param esVeneno del animal
     * @param habitat del animal
     */
    // Constructor con parámetros
    public Reptil(String nombre, int edad, float peso, String tipoPiel, boolean esVeneno, String habitat) {
        super(nombre, edad, peso); // Llama al constructor de la clase padre (Animal) con los parámetros correspondientes
        this.tipoPiel = tipoPiel; 
        this.esVeneno = esVeneno; 
        this.habitat = habitat; 
    }
    /**
     * Metodo tomar sol que devuelve un print con el nombre y la acción del animal
     */
    // Métodos específicos de los reptiles
    public void tomarSol() {
        System.out.println(nombre + " está tomando el sol para termorregularse.");
    }
    /**
     * Metodo mudar piel que devuelve un print con el nombre y la acción del animal
     */
    public void mudarPiel() {
        System.out.println(nombre + " está mudando de piel.");
    }
    /**
     * Metodo reptar que devuelve un print con el nombre y la acción del animal
     */
    public void reptar() {
        System.out.println(nombre + " está reptando.");
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
                this::reptar
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
