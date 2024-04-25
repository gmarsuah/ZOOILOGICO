//Hecho por Joan, Damián e Ismael.

package Ave;

import java.util.Random;

import Zoo.Animal;

/**
 * La clase Ave representa a un tipo genérico de ave en un zoológico.
 * Proporciona atributos y comportamientos comunes a las aves, como volar, poner huevos y emitir sonidos.
 * Esta clase también implementa un método para mostrar diferentes acciones aleatorias que puede realizar un ave.
 * Hecho por Joan, Damián e Ismael.
 */
public class Ave extends Animal{
	 /** Color de las plumas o piel del ave */
	protected String colorPiel;
	/** Indica si el ave puede volar o no */
	protected boolean puedeVolar;
	/** Tamaño del ave */
	protected String tamano;
	/** Posibles colores de plumas para el ave */
	private static final String[] coloresPlumasPosibles={"marron","azul","negro","blanco","gris","verde"};
	/** Posibles tamaños para el ave */
	private static final String[] tamanoPosible={"pequeño","mediano","grande"};
	
	/**
     * Constructor sin parámetros que inicializa un ave con características aleatorias.
     */
	public Ave() {
		super();
		Random random=new Random();
		this.puedeVolar=random.nextBoolean();
		this.colorPiel=coloresPlumasPosibles[random.nextInt(coloresPlumasPosibles.length)];
		this.tamano=tamanoPosible[random.nextInt(tamanoPosible.length)];
	}
	
	/**
     * Método que indica que el ave está volando.
     */
	public void volar() {
		System.out.println(nombre+" está volando.");
	}
	
	/**
     * Método que indica que el ave está poniendo un huevo.
     */
	public void ponerHuevos() {
		System.out.println(nombre+" está poniendo un huevo.");
	}
	
	/**
     * Método que indica que el ave está emitiendo sonidos.
     */
	public void emitirSonido() {
		System.out.println(nombre+" está emitiendo sonidos.");
	}
	
	/**
     * Método que muestra acciones aleatorias que puede realizar un ave, como comer, dormir, moverse, volar, poner huevos o emitir sonidos.
     * Estas acciones se ejecutan de manera aleatoria y se repiten varias veces.
     */
	@Override
	public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
            this::comer,
            this::dormir,
            this::moverse,
            this::volar,
            this::ponerHuevos,
            this::emitirSonido

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
