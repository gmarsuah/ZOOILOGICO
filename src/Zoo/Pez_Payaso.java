package Zoo;

//
//Cristian Perez.
//

import java.util.Random;
/**
 * Representa un pez payaso que extiende la clase Pez.
 * Esta clase modela las características y comportamientos específicos de un pez payaso.
 * Los peces payaso pueden formar simbiosis con diferentes tipos de anémonas.
 * @author Cristian Perez
 */
    public class Pez_Payaso extends Pez {
    // Atributos específicos de pezGlobo podrían añadirse aquí
    protected String anemona;
    /** Tipos de anémonas con los que puede formar simbiosis un pez payaso */
    private static final String[] tiposAnemonas = {"Heteractis magnifica", "Stichodactyla gigantea","Entacmaea quadricolor", "Stichodactyla haddoni"};

    private Random random = new Random();

    /**
     * Constructor  que asigna una anémona  al pez payaso.
     */
    public Pez_Payaso() {
        super();
        this.anemona = tiposAnemonas[random.nextInt(tiposAnemonas.length)];
        }
      /**
     * Realiza una simbiosis con la anémona actual y luego la desasocia.
     */
    public void formarSimbiosis() {
        System.out.println(nombre + "hizo una simbiosis con este tipo de anemona: " + this.anemona);
        this.anemona = null;
    }
    /**
* Método que muestra las diferentes acciones que puede realizar el PezPayaso de manera aleatoria.
*/
    @Override
    public void verAnimal() {
        Runnable[] acciones = {
                this::comer,
                this::dormir,
                this::moverse,
                this::nadar,
                this::respirarBajoAgua,
                this::ponerHuevos,
                this::formarSimbiosis
        };

        try {
            for (int i = 0; i < 6; i++) {
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
