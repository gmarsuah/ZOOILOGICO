package Reptil;
import java.util.Random;

public class Cocodrilo extends Reptil {
    private double tamano;
    private double fuerzaMordida;

    // Constructor sin parámetros
    public Cocodrilo() {
        super();
        Random random = new Random();
        this.tamano = random.nextDouble() * 5 + 1; // Tamaño aleatorio entre 1 y 6 metros
        this.fuerzaMordida = random.nextDouble() * 1500 + 1000; // Fuerza de mordida aleatoria entre 1000 y 2500 Newtons
    }

    // Constructor con parámetros
    public Cocodrilo(String nombre, int edad, float peso, String tipoPiel, boolean esVeneno, String habitat, double tamano, double fuerzaMordida) {
        super(nombre, edad, peso, tipoPiel, esVeneno, habitat);
        this.tamano = tamano;
        this.fuerzaMordida = fuerzaMordida;
    }

    // Método para sumergirse bajo el agua
    public void sumergirse() {
        System.out.println(nombre + " el cocodrilo se sumerge bajo el agua para cazar.");
    }

    // Método para cazar
    public void cazar() {
        System.out.println(nombre + " el cocodrilo acecha a su presa en la orilla, esperando el momento adecuado para atacar.");
    }

    // Método para ver información sobre el cocodrilo
    @Override
    public void verAnimal() {
        super.verAnimal();
        System.out.println("Tamaño: " + tamano + " metros");
        System.out.println("Fuerza de mordida: " + fuerzaMordida + " Newtons");
    }
}
