package Zoo;

import java.util.Random;

/**
* Gonzalo Afonso.
* Clase del tiburón
* Especies de tiburones disponibles y atributo que indica la longitud del tiburón.
*/
public class Pez_Tiburon extends Pez {
	//Clase para identificar tiburones
    protected String[] Especie = {"Tiburón Blanco", "Tiburón Martillo", "Tiburón Tigre", "Tiburón Ballena", "Tiburón Zorro"};
    protected String Longitud;

/**
* Constructor para el tiburón.
* 
* @param nombre El nombre del tiburón.
* @param edad La edad del tiburón.
* @param peso El peso del tiburón.
* @param tamano El tamaño del tiburón.
* @param colorescamas Los colores de las escamas del tiburón.
* @param tipoAgua El tipo de agua en el que vive el tiburón.
* @param Especie La especie del tiburón.
* @param Longitud La longitud del tiburón.
*/
    public Pez_Tiburon(String nombre, int edad, float peso, String tamano, String colorescamas, String tipoAgua, String Especie, String Longitud) {
    	//Constructor para el tiburón
        super(nombre, edad, peso, tamano, colorescamas, tipoAgua);
        this.Especie[0] = Especie;
        this.Longitud = (Longitud + "m");

        if (Especie.equals("Tiburón Blanco")) {
            this.Longitud = "4.5-6.4";
        } else if (Especie.equals("Tiburón Martillo")) {
            this.Longitud = "2.0-5.0";
        } else if (Especie.equals("Tiburón Tigre")) {
            this.Longitud = "3.25-4.25";
        } else if (Especie.equals("Tiburón Ballena")) {
            this.Longitud = "12";
        } else {
            this.Longitud = "3.2-4.5";
        }
    }

/**
* Método de caza del tiburón.
*/
    public void cazar() {
    	//Método de caza del tiburón
        System.out.print("Abren la boca");
        System.out.print("Muerden o engullen a sus presas");
        System.out.print("Tragan");
        System.out.print("Repiten");
    }

/**
* Método que muestra las diferentes acciones que puede realizar el tiburón de manera aleatoria.
*/
    @Override
    public void verAnimal() {
    	//Método que muestra las  acciones del tiburón
        Runnable[] acciones = {
            this::comer,
            this::dormir,
            this::moverse,
            this::nadar,
            this::respirarBajoAgua,
            this::ponerHuevos,
            this::cazar
        };

        try {
            for (int i = 0; i < 7; i++) {
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