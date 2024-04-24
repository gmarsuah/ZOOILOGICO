package Reptil;
import java.util.Random;

public class Serpiente extends Reptil {
    protected String longitud;
    protected String tipo;

    private static final String[] longitudesPosibles = {"Corta", "Mediana", "Larga"};
    private static final String[] tiposPosibles = {"Constrictora", "Venenosa", "No venenosa"};

    // Constructor sin parámetros
    public Serpiente() {
        super();
        Random random = new Random();
        this.longitud = longitudesPosibles[random.nextInt(longitudesPosibles.length)];
        this.tipo = tiposPosibles[random.nextInt(tiposPosibles.length)];
    }

    // Constructor con parámetros
    public Serpiente(String nombre, int edad, float peso, String tipoPiel, boolean esVeneno, String habitat, String longitud, String tipo) {
        super();
        this.longitud = longitud;
        this.tipo = tipo;
    }

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

    // Métodos único de la serpiente
    public void deslizarse() {
        System.out.println(nombre + " se desliza suavemente por el suelo.");
    }

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