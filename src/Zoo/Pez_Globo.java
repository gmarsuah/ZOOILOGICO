package Zoo;

import java.util.Random;

/**
* Haendel González
* Creamos una nueva clase para la categoría peces llamada Pez_Globo junto con su atributo específico Púas.
* Puas Si dispone o no de púas el pez.
*/
public class Pez_Globo extends Pez {		
	//Clase del animal
    protected Boolean Puas;

/**
* Definimos que parametros/atributos que va a necesitar el pez globo para su creación.
*
* @param nombre        El nombre del pez globo.
* @param edad          La edad del pez globo.
* @param peso          El peso del pez globo.
* @param tamano        El tamaño del pez globo.
* @param colorescamas  Los colores de las escamas del pez globo.
* @param tipoAgua      El tipo de agua en el que vive el pez globo.
*/
    public Pez_Globo(String nombre, int edad, float peso, String tamano, String colorescamas, String tipoAgua) { 
    	//Constructor del animal
        super(nombre, edad, peso, tamano, colorescamas, tipoAgua);
        this.Puas = random.nextBoolean();
    }

/**
* Método que simula la acción de inflarse del pez globo y explica el proceso.
*/
    public void inflarse() {		
    	
        System.out.println(nombre + " va a reventar pa' la ver--.");
        System.out.println(nombre + " esto es un mecanismo de defensa contra los depredadores " +
                "que se basa en el uso de su elástico estómago y su capacidad de ingerir rápidamente " +
                "grandes cantidades de agua, para así doblar varias veces su tamaño");
      
    }
  //Método único del animal
/**
* Método que muestra las diferentes acciones que puede llegar a realizar nuestro pez globo de manera aleatoria.
*/
    @Override
    public void verAnimal() {		
    	//Método para ver la acción del animal
        Runnable[] acciones = {
                this::comer,
                this::dormir,
                this::moverse,
                this::nadar,
                this::respirarBajoAgua,
                this::ponerHuevos,
                this::inflarse
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
