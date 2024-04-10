//Hecho por Joan, Damián e Ismael.

package Zoo;

import java.util.Random;

public class Ave extends Animal{
	protected String colorPiel;
	protected boolean puedeVolar;
	protected String tamaño;
	
	private static final String[] coloresPlumasPosibles={"marron","azul","negro","blanco","gris","verde"};
	
	private static final String[] tamañoPosible={"pequeño","mediano","grande"};
	
	// Constructor sin parámetros
	public Ave() {
		super();
		Random random=new Random();
		this.puedeVolar=random.nextBoolean();
		this.colorPiel=coloresPlumasPosibles[random.nextInt(coloresPlumasPosibles.length)];
		this.tamaño=tamañoPosible[random.nextInt(coloresPlumasPosibles.length)];
	}
	
	public void volar() {
		System.out.println(nombre+" está volando.");
	}
	
	public void ponerHuevos() {
		System.out.println(nombre+" está poniendo un huevo.");
	}
	
	public void emitirSonido() {
		System.out.println(nombre+" está emitiendo sonidos.");
	}
}
