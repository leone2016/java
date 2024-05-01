package pildoras.console;

public class _9_Calculos_MATH {

    /**
     * CLASES EN JAVA
     *
     * PROPIAS: son las que creamos nosotros
     * PREDETERMINADAS: String, Array, MAth, thread
     *      * para consultar todos las clases buscar en el navegador API JAVA
     */
    public static void main(String[] args) {

        //Raiz cuadrada
        double raiz = Math.sqrt(9);
        // REDONDEA
        int resultado =(int) Math.round(raiz);
        // Eleva numero a la potencia
        double expo=3;
        double base=5;
        int res = (int)Math.pow(base,expo);
        System.out.println(raiz);
        System.out.println("El resultado de "+base+" elevador a "+expo+ " es "+res);
        //

    }
}
