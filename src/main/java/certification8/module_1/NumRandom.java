package certification8.module_1;

import java.util.Random;

public class NumRandom {

    /**
     * la libreria Random lo que hace es devolvernos numeros aleatorios
     *
     * Por ejemplo random.nextInt(10);
     *
     * Si preguntan que error da, este codigo hay que ver que se tenga la lib Random importada
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
    }
}
