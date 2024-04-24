package Zoo;

import java.util.Random;


/**
 * The type Mariposa.
 */
public class Mariposa extends Insecto {
    /**
     * The Patro alas.
     */
    String[] patroAlas = {"hepicoptero", "arcoiris", "manatial celestias", "tatuajes antiguos", "punto doble alto"};
    /**
     * The Etapa de vida.
     */
    String[] etapaDeVida = {"larva", "pupa", "adulta", };
    /**
     * The Patro alas.
     */
    String patro_alas;
    /**
     * The Etapa vida.
     */
    String etapa_vida;

    /**
     * Instantiates a new Mariposa.
     */
//contructor sin parametro
    public Mariposa () {
        super();
        Random random = new Random();
        this.patro_alas = this.patroAlas[random.nextInt(patroAlas.length)];
        this.etapa_vida = this.etapaDeVida[random.nextInt(etapaDeVida.length)];
    }
    

  @Override
  public void volar() {
      if (this.tieneAlas == true) {
        System.out.println(this.nombre + " la mariposa está volando.");
      } 
    }

  @Override
  public void moverse() {
      System.out.println(this.nombre + " se esta moviendo");
    }

  // Método único de mariposa

    /**
     * Metamorfosis.
     */
    public void metamorfosis() {
      System.out.println(this.nombre + " está pasando por una metamorfosis.");
  }

    /**
     * Libar nectar.
     */
    public void libarNectar() {
    System.out.println(this.nombre + " la mariposa aterriza en la flor asorbiendo el nectar.");
}



  @Override
  public void verAnimal() {
      super.verAnimal(); 
      try {
          this.metamorfosis();
          this.libarNectar();
          Thread.sleep(500); 
      } catch (InterruptedException e) {
          e.printStackTrace();
      }
  }


}