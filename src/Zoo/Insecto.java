package Zoo;
import java.util.Random;
import java.util.function.ToIntBiFunction;

public class Insecto {
  int numeroDePatas;
  Boolean tieneAlas;
  String tipoAlimentacion;
  
  private static final String[] tipos_alimentacion = {"herbívoro", "carnívoro", "nectarívoro", "omnivoro"};
  
  public Insecto() {
    super();
    this.numeroDePatas = random.nextInt(6);
    this.tieneAlas = random.nextBoolean();
    this.tipoAlimentacion = tipos_alimentacion[random.nextInt(tipos_alimentacion.length)];
  }

  public void volar() {
    if (this.tieneAlas == true) {
      System.out.prinln(this.nombre + " está volando.");
    } 
  }

  public void moverse() {
    System.out.println(this.nombre + " se mueve.");
  }

  public void alimentarse() {
    System.out.println(this.nombre + " se está alimentando");
  }
}
