package Reptil;
import java.util.Random;

/**
 * Clase Serpiente que se extiende de la clase Reptil
 * @author Jorge A. Herrero Santana
 * @version 24-04-24
 */
public class Serpiente extends Reptil {
	/**
	 * String para longitud protegida para que solo lo use serpiente
	 */
    protected String longitud;
    /**
     * String para tipo protegido para que solo lo use serpiente
     */
    protected String tipo;

    private static final String[] longitudesPosibles = {"Corta", "Mediana", "Larga"};
    private static final String[] tiposPosibles = {"Constrictora", "Venenosa", "No venenosa"};

    /**
     * Constructor de la clase sin parametros
     */
    // Constructor sin parámetros
    public Serpiente() {
        super();
        Random random = new Random();
        this.longitud = longitudesPosibles[random.nextInt(longitudesPosibles.length)];
        this.tipo = tiposPosibles[random.nextInt(tiposPosibles.length)];
    }

    /**
     * Constructor de la clase con paramatros
     * @param nombre del animal
     * @param edad del animal
     * @param peso del animal
     * @param tipoPiel del animal
     * @param esVeneno del animal
     * @param habitat del animal
     * @param longitud del animal
     * @param tipo del animal
     */
    // Constructor con parámetros
    public Serpiente(String nombre, int edad, float peso, String tipoPiel, boolean esVeneno, String habitat, String longitud, String tipo) {
        super();
        this.longitud = longitud;
        this.tipo = tipo;
    }

    /**
     * Metodos especificos de la clase reptil
     */
    // Métodos específicos de los reptiles
    @Override
    public void tomarSol() {
        System.out.println(nombre + " está tomando el sol para termorregularse.");
    }

    @Override
    public void mudarPiel() {
        System.out.println(nombre + " está mudando de piel.");
    }

    @Override
    public void reptar() {
        System.out.println(nombre + " está reptando.");
    }
    /**
     * Metodo unico de serpiente que devuelve un print con su nombre y la accion que realiza
     */
    // Métodos único de la serpiente
    public void deslizarse() {
        System.out.println(nombre + " se desliza suavemente por el suelo.");
    }

    /**
     * Heredacion de los metodos de la clase Animal
     * Try catch del metodo especifico de reptil
     */
    @Override
    public void verAnimal() {
        super.verAnimal();
        try {
            deslizarse();
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}    