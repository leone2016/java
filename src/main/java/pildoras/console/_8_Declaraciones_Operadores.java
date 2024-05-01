package pildoras.console;

public class _8_Declaraciones_Operadores {

    /**
     * ERRORES de COMPILACION: errores que si no escribes bien el programa no funciona
     * ERRORES de EJECUCION: que todo el codigo esta bien escrito que no se ha saltado nada, pero a la hora de interpretar o compilar
     *
     * @param args
     */
    public static void main(String[] args) {
        final int c = 5;
        final double pulgadas = 2.54;

        double cm = 6;
        double resultado = cm/pulgadas;

//        c = 7;
        System.out.println(c);
        System.out.println("En "+ cm+ " cn hay "+ resultado+" pulgadas");

    }
}
