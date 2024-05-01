package pildoras.console;

public class _11_Sting {
    /**
     Sting no es un tipo primitivo
     * METODOS
     *      length()
     *      charAt(n): devuelve la posicion de un caracter dentro de una cadena, (empieza a contar desde cero)
     *      subString(x,y): devuelve una subcadena dentro de la cadena, siendo
     *          X el caracter a partir del cual se extraey
     *          Y el Num de caracteres que se quiere extraer
     *      equals(cadena): devuelve true si dos cadenas que se comparan son iguales y false si no lo son,
     *      equalsIgnoreCase(cadena):mismo que equals pero ignora mayus y minus,
     * @param args
     */
    public static void main(String[] args) {
        String mi_nombre = "Leonardo";
        System.out.println("Mi nombre es: "+mi_nombre);
        //length
        System.out.println("Mi nombre tiene "+mi_nombre.length()+ " caracteres");
        System.out.println("la primera letra es:  "+mi_nombre.charAt(0)+ " ");
        // charAt
        int ultimaLetra = mi_nombre.length() - 1;
        System.out.println("la ultima letra es:  "+mi_nombre.charAt(ultimaLetra)+ " ");
        //subString
        String frase = "Hoy es un estupendo dia para aprender a programar en JAVA";
        String frase_resumen = frase.substring(9, 19);
        System.out.println("Frase resumen:"+frase_resumen);
        //equals
        String alum1,alum2;
        alum1="Leonardo";
        alum2="leonardo";
        System.out.println("Es el mismo nombre: (equals) "+alum2.equals(alum1));
        System.out.println("Es el mismo nombre: (equalsIgnoreCase) "+alum2.equalsIgnoreCase(alum1));
    }
}
