package Zoo;

import java.util.Random;

public class Murcielago extends Mamifero {
    private static final String[] coloresposibles = {"marron", "negro", "blanco"};
    private static final String[] alimentacionPosible = {"herbívoro", "carnívoro", "omnívoro"};

    public Murcielago() {
        super();
        Random random = new Random();
        this.colorpelo = coloresposibles[random.nextInt(coloresposibles.length)];
        this.esDomestico = random.nextBoolean();
        this.tipoAlimentacion = alimentacionPosible[random.nextInt(alimentacionPosible.length)];
    }

    public Murcielago(String colorpelo, String tipoAlimentacion, boolean esDomestico, int envergaduraAlas) {
        this.colorpelo = colorpelo;
        this.tipoAlimentacion = tipoAlimentacion;
        this.esDomestico = esDomestico;
        this.envergaduraAlas = random.nextInt();
    }
    @override
    public void amamantar() {
        System.out.println(nombre + "está amamantando");
    }
    @override
    public void emitir_sonido() {
        System.out.println(nombre + " está emitiendo sonidos");
    }
    public void volar() {
        System.out.println("El murciélago" + nombre + "está volando gracias a que las alas de los murciélagos contienen más de dos docenas de articulaciones cada una, y están recubiertas por el patagio. Tienen una extraordinaria capacidad de control sobre sus alas durante el vuelo. El éxito de su eficiencia radica en la membrana flexible de piel que forma sus alas y en sus múltiples articulaciones.")
    }

    public void usarEcolocalizacion() {"\n" +
            "El murciélago" + nombre + "está usando la eco localización para navegar y encontrar comida en la oscuridad. Para eco localizar, los murciélagos emiten ondas sonoras por sus boca o nariz. Cuando las ondas sonoras impactan en un objeto, producen ecos. El eco rebota del objeto y vuelve a las orejas del murciélago"

    }

    @Override
    public void verAnimal() {
        Random random = new Random();
        Runnable[] acciones = {
<<<<<<< HEAD
                this::emitir_sonido,
=======
                this::volar,
>>>>>>> 1c731fb538119204509fffa502bd4c706b5d56d6
                this::usarEcolocalizacion
        };

        try {
            for (int i = 0; i < 1; i++) {
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

