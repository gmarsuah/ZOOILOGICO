package Zoo;
/**
 * se importa el ramdom
 */
import java.util.Random;
/**
 * se establece las caracteristicas extras
 */
public class Leon extends Mamifero {
    private static final String[] TAMANO_MELENA = {"largo", "corto", "punk"};
    private static final String[] TAMANO_MANADA = {"grande", "pequeño"};
    private String tamañoMelena;
    private String tamañoManada;
/**
 * Se ordena la randomizacion de las caracteristicas extras
 */
    public Leon() {
        super();
        Random random = new Random();
        this.tamañoMelena = TAMANO_MELENA[random.nextInt(TAMANO_MELENA.length)];
        this.tamañoManada = TAMANO_MANADA[random.nextInt(TAMANO_MANADA.length)];
    }
/**
 * acciones del animal
 */
    public void rugir() {
        System.out.println(nombre + " el león ruge");
    }

    public void cazar() {
        System.out.println(nombre + " el león está cazando");
    }
/**
 * Se ordena la randomizacion de los productos
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
                this::rugir,
                this::cazar
        };
/**
 * se ordena el tiempo de aparicion
 */
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
