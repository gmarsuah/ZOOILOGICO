package Zoo;

import java.util.Random;

public class Loro extends Ave {
    private String color;
    private boolean habilidadParaHablar;

    public Loro() {
        super();
        Random random = new Random();
        this.color = generarColorAleatorio();
        this.habilidadParaHablar = random.nextBoolean();
    }

    public Loro(String color, boolean habilidadParaHablar) {
        super();
        this.color = color;
        this.habilidadParaHablar = habilidadParaHablar;
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando haciendo piruetas en el aire.");
    }

    public void imitarSonidos() {
        if (habilidadParaHablar) {
            System.out.println(nombre + " puede imitar una variedad de sonidos y palabras humanas.");
        } else {
            System.out.println(nombre + " no tiene habilidad para imitar sonidos humanos.");
        }
    }

    private String generarColorAleatorio() {
        String[] colores = {"rojo", "azul", "verde", "amarillo", "naranja", "morado"};
        Random random = new Random();
        return colores[random.nextInt(colores.length)];
    }

    @Override
    public void verAnimal() {
        super.verAnimal(); // Llama al método verAnimal de Ave
        try {
            imitarSonidos();
            Thread.sleep(500); // Espera medio segundo después de imitar sonidos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
