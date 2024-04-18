package Zoo;

import java.util.Random;



public class Mariposa extends Insecto {
  String[] patroAlas = {"hepicoptero", "arcoiris", "manatial celestias", "tatuajes antiguos", "punto doble alto"};
  String[] etapaDeVida = {"larva", "pupa", "adulta", };
  String patro_alas;
  String etapa_vida;

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

  public void metamorfosis() {
      System.out.println(this.nombre + " está pasando por una metamorfosis.");
  }

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