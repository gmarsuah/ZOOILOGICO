package Ave;

// Importa la clase Random del paquete java.util para generar números aleatorios
import java.util.Random;

/**
 * La clase Loro representa a un tipo de ave conocida por su capacidad para imitar sonidos humanos.
 * Extiende la clase Ave e implementa comportamientos específicos de un loro.
 */
public class Loro extends Ave {
    // Array de colores disponibles para el loro
    private static final String[] color = {"rojo", "azul", "verde", "amarillo", "naranja", "morado"};
    // Atributo que indica si el loro tiene habilidad para hablar
    private boolean habilidadParaHablar;
    // Color del loro
    protected String colores;
    
    /**
     * Constructor que crea un loro con un color aleatorio y asigna una habilidad aleatoria para hablar.
     */
    public Loro() {
        // Llama al constructor de la clase padre (Ave)
        super();
        // Genera un color aleatorio para el loro
        Random random = new Random();
        this.colores = color[random.nextInt(color.length)];
        // Asigna una habilidad aleatoria para hablar al loro
        this.habilidadParaHablar = random.nextBoolean();
    }

    /**
     * Constructor que crea un loro con un color específico y una habilidad para hablar dada.
     * 
     * @param color Color del loro.
     * @param habilidadParaHablar Indica si el loro tiene la habilidad para hablar.
     */
    public Loro(String color, boolean habilidadParaHablar) {
        // Llama al constructor de la clase padre (Ave)
        super();
        // Asigna el color y la habilidad para hablar proporcionados
        this.colores = color;
        this.habilidadParaHablar = habilidadParaHablar;
    }

    /**
     * Método que sobreescribe el método volar de la clase Ave.
     * Imprime un mensaje indicando que el loro está volando haciendo piruetas en el aire.
     */
    @Override
    public void volar() {
        System.out.println(nombre + " está volando haciendo piruetas en el aire.");
    }

    /**
     * Método que permite al loro imitar sonidos humanos si tiene la habilidad para hacerlo.
     * Imprime un mensaje indicando si el loro puede o no imitar sonidos.
     */
    public void imitarSonidos() {
        if (habilidadParaHablar) {
            System.out.println(nombre + " puede imitar una variedad de sonidos y palabras humanas.");
        } else {
            System.out.println(nombre + " no tiene habilidad para imitar sonidos humanos.");
        }
    }
    
    /**
     * Método que sobreescribe el método verAnimal de la clase Ave.
     * Llama al método verAnimal de la clase Ave y luego hace que el loro imite sonidos humanos (si puede) después de un breve período de espera.
     */
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
