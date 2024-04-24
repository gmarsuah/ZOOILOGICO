package Zoo;
import java.util.Random;
import java.util.function.ToIntBiFunction;

/**
 * The type Insecto.
 */
public class Insecto extends Animal{
    /**
     * The Numero de patas.
     */
    int numeroDePatas;
    /**
     * The Tiene alas.
     */
    Boolean tieneAlas;
    /**
     * The Tipo alimentacion.
     */
    String tipoAlimentacion;
  
  private static final String[] tipos_alimentacion = {"herbívoro", "carnívoro", "nectarívoro", "omnivoro"};

    /**
     * Instantiates a new Insecto.
     */
    public Insecto() {
    super();
    Random random = new Random();
    this.numeroDePatas = random.nextInt(6);
    this.tieneAlas = random.nextBoolean();
    this.tipoAlimentacion = tipos_alimentacion[random.nextInt(tipos_alimentacion.length)];
  }

    /**
     * Volar.
     */
    public void volar() {
    if (this.tieneAlas == true) {
      System.out.println(this.nombre + " está volando.");
    } 
  }

  public void moverse() {
    System.out.println(this.nombre + " se mueve.");
  }

    /**
     * Alimentarse.
     */
    public void alimentarse() {
    System.out.println(this.nombre + " se está alimentando");
  }

  @Override
    public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
            this::comer,
            this::dormir,
            this::moverse,
            this::alimentarse,
            this::moverse,
            this::volar,
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
