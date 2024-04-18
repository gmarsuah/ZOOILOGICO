package Zoo;

import java.util.Random;

public class Escarabajo extends Insecto {
  
  // Atributos
  String[] tiposExoesqueleto = {"quirina", "bonito", "feo", "duro", "blando"};
  String[] habitosAlimenticio = {"detritivoro", "fitofago", "depredador", "fotosintesis"};
  String tipo_exoesqueleto;
  String habito_alimenticio;
  
  public Escarabajo () {
    super();
    Random random = new Random();
    this.tipo_exoesqueleto = this.tiposExoesqueleto[random.nextInt(tiposExoesqueleto.length)];
    this.habito_alimenticio = this.habitosAlimenticio[random.nextInt(habitosAlimenticio.length)];
  }

  @Override
  public void volar() {
    if (this.tieneAlas == true) {
      System.out.println(this.nombre + " el escarabajo está volando.");
    } 
  }

  @Override
  public void moverse() {
    System.out.println(this.nombre + "el escarbajo se mueve.");
  }

  @Override
  public void alimentarse() {
    System.out.println(this.nombre + " el escarabajo se está alimentando.");
  }

  public void enterrarse() {
    System.out.println(this.nombre + " el escarabajo se entierra un rato a descansar.");
  }

  public void defenderse() {
    System.out.println(this.nombre + "el escarabajo se da de tortas con otro bicho.");
  }

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