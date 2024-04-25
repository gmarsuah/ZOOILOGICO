package Zoo;

//
//Cristian Perez.
//

import java.util.Random;

public class pezPayaso extends Pez {
    // Atributos específicos de pezGlobo podrían añadirse aquí
    protected String anemona;
    private static final String[] tiposAnemonas = {"Heteractis magnifica", "Stichodactyla gigantea","Entacmaea quadricolor", "Stichodactyla haddoni"};

    private Random random = new Random();

    public pezPayaso() {
        super();
        //this.anemona = null;  
        }

    public void formarSimbiosis() {
        this.anemona = tiposAnemonas[random.nextInt(tiposAnemonas.length)];
        System.out.println(nombre + "hizo una simbiosis con este tipo de anemona: " + this.anemona);
        this.anemona = null;
    }

    @Override
    public void verAnimal() {
        Runnable[] acciones = {
                //this::comer,
                //this::dormir,
                //this::moverse,
                //this::nadar,
                //this::respirarBajoAgua,
                //this::ponerHuevos,
                this::formarSimbiosis
        };

        try {
            for (int i = 0; i < 6; i++) {
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
