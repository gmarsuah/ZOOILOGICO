package Ave;

import java.util.Random;

public class Loro extends Ave {
    // Array de colores disponibles para el loro
    private static final String[] color = {"rojo", "azul", "verde", "amarillo", "naranja", "morado"};
    // Atributo que indica si el loro tiene habilidad para hablar
    private boolean habilidadParaHablar;
    // Color del loro
    protected String colores;
    
    // Constructor sin parámetros
    public Loro() {
        // Llama al constructor de la clase padre (Ave)
        super();
        // Genera un color aleatorio para el loro
        Random random = new Random();
        this.colores = color[random.nextInt(color.length)];
        // Asigna una habilidad aleatoria para hablar al loro
        this.habilidadParaHablar = random.nextBoolean();
    }

    // Constructor con parámetros
    public Loro(String color, boolean habilidadParaHablar) {
        // Llama al constructor de la clase padre (Ave)
        super();
        // Asigna el color y la habilidad para hablar proporcionados
        this.colores = color;
        this.habilidadParaHablar = habilidadParaHablar;
    }

    // Método que sobreescribe el método volar de la clase Ave
    @Override
    public void volar() {
        System.out.println(nombre + " está volando haciendo piruetas en el aire.");
    }

    // Método que permite al loro imitar sonidos
    public void imitarSonidos() {
        if (habilidadParaHablar) {
            System.out.println(nombre + " puede imitar una variedad de sonidos y palabras humanas.");
        } else {
            System.out.println(nombre + " no tiene habilidad para imitar sonidos humanos.");
        }
    }
    
    // Método que sobreescribe el método verAnimal de la clase Ave
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
