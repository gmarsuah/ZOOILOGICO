package Insecto;

import java.util.Random;

/**
 * Clase de escarabajo
 * Hereda de la clase Insecto
 * @author Jonathan Gutierrez Riego
 * @version 24-04-2024
 */
public class Escarabajo extends Insecto {

  // Atributos
  String[] tiposExoesqueleto = {"quirina", "bonito", "feo", "duro", "blando"};
  String[] habitosAlimenticio = {"detritivoro", "fitofago", "depredador", "fotosintesis"};
  String tipo_exoesqueleto;
  String habito_alimenticio;

  /**
   * Constructor del objeto
   */
  public Escarabajo () {
    super();
    Random random = new Random();
    this.tipo_exoesqueleto = this.tiposExoesqueleto[random.nextInt(tiposExoesqueleto.length)];
    this.habito_alimenticio = this.habitosAlimenticio[random.nextInt(habitosAlimenticio.length)];
  }

  /**
   * Método volar. Solo ocurrirá si el escarabajo tiene alas.
   */
  @Override
  public void volar() {
    if (this.tieneAlas == true) {
      System.out.println(this.nombre + " el escarabajo está volando.");
    } else {
      System.out.println(this.nombre + "el escarabajo intenta volar pero no tiene alas.");
    }
  }

  /**
   * Método de moverse que imprime la acción de movimiento
   */
  @Override
  public void moverse() {
    System.out.println(this.nombre + "el escarbajo se mueve.");
  }

  /**
   * Método de alimentarse que imprime la acción de comer
   */
  @Override
  public void alimentarse() {
    System.out.println(this.nombre + " el escarabajo se está alimentando.");
  }

  /**
   * Método de enterrarse que imprime la acción de enterrarse
   */
  public void enterrarse() {
    System.out.println(this.nombre + " el escarabajo se entierra un rato a descansar.");
  }

  /**
   * Método de defedenderse que imprime la acción de defenderse de otro bicho
   */
  public void defenderse() {
    System.out.println(this.nombre + "el escarabajo se da de tortas con otro bicho.");
  }

  /**
   * Método para llamar a las acciones que puede hacer el animal
   */
  @Override
  public void verAnimal() {
    super.verAnimal();
    try {
      this.enterrarse();
      this.defenderse();
      Thread.sleep(500);
    }catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}