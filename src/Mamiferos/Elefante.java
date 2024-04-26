package Mamiferos;

import java.util.Random;

public class Elefante extends Mamifero{

    protected String tamañoTrompa;
    protected String tamañoOreja;
    private static final String[] tamañosPosibles = {"Pequeña" , "Mediana" , "Grande"};

    /**
     * Constructor sin parametros
     */
    public Elefante(){
        super();
        Random random = new Random();
        this.tamañoTrompa = tamañosPosibles[random.nextInt(tamañosPosibles.length)];
        this.tamañoOreja = tamañosPosibles[random.nextInt(tamañosPosibles.length)];
    }

    /**
     * constructor con parametros
     * @param colorpelo color del pelo del animal
     * @param tipoAlimentacion tipo de alimentacion del animal
     * @param esDomestico si el animal es domestico o no
     * @param tamañoTrompa tamaño de la trompa del elefante
     * @param tamañoOreja tamaño de las orejas del elefante
     */
    public Elefante(String colorpelo, String tipoAlimentacion, boolean esDomestico , String tamañoTrompa , String tamañoOreja){
        super(colorpelo , tipoAlimentacion , esDomestico);
        this.tamañoTrompa = tamañoTrompa;
        this.tamañoOreja = tamañoOreja;
    }


    /**
     * simula el uso de la trompa del elefante
     */
    public void usarTrompa() {
        System.out.println(nombre + "el elefante está usando la trompa");
    }

    /**
     * simula la comunicacion del elefante
     */
    public void comunicar() {
        System.out.println(nombre + "el elefante está comunicandose");
    }

    /**
     * Muestra las actividades del animal de manera aleatoria, ejecutando una de las acciones
     */
    @Override
    public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
                this::comer,
                this::dormir,
                this::moverse,
                this::amamantar,
                this::emitir_sonido,
                this::usarTrompa,
                this::comunicar
        };

        try {
            for (int i = 0; i < 4; i++) {
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
