package Ave;

import java.util.Random;

/**
 * La clase Aguila representa a un tipo de ave, especificamente un aguila
 * Esta clase extiende la clase abstracta Ave e implementa comportamientos
 * especificos de un aguila, como volar, poner huevos, emitir sonidos y cazar
 */
public class Aguila extends Ave {
	private static final String[] tipo = {"aguila real" , "aguila calva" , "aguila imperial"}; // Tipos de aguila posibles
	protected String tipoAguila; // Tipo de aguila
	
	/**
     * Constructor sin parametros que inicializa un aguila con un nombre aleatorio y un tipo aleatorio
     */
	public Aguila() {
		super();
		Random random = new Random();
		this.tipoAguila = tipo[random.nextInt(tipo.length)];
	}
	
	/**
     * Metodo que indica que el aguila esta volando
     */
	@Override
	public void volar() {
		System.out.println(nombre+" está volando.");
	}
	
	/**
     * Metodo que indica que el aguila esta poniendo un huevo
     */
	@Override
	public void ponerHuevos() {
		System.out.println(nombre+" está poniendo un huevo.");
	}
	
	/**
     * Metodo que indica que el aguila esta emitiendo sonidos
     */
	@Override
	public void emitirSonido() {
		System.out.println(nombre+" está emitiendo sonidos.");
	}
	
	/**
     * Metodo unico de un aguila que indica que esta cazando
     */
	public void cazar() {
		System.out.println(nombre+" el "+tipoAguila+" esta cazando a su presa");
	}
	
	/**
     * Metodo que muestra informacion sobre el aguila(nombre, tipo y lo que esta haciendo)
     * Se llama al metodo verAnimal de la clase Ave y se agrega el comportamiento de cazar
     */
	@Override
    public void verAnimal() {
        super.verAnimal(); // Llama al metodo verAnimal de Ave y agrega el comportamiento de cazar
        try {
            cazar();
            Thread.sleep(500); // Espera medio segundo después de croar
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
