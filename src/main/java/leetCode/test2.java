package leetCode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


public class test2 {

    public static void main(String[] args){

        // Texto
        String sTexto = "palabras o palabra y palabra";
        // Texto que vamos a buscar
        String sTextoBuscado = "palabra";
        // Contador de ocurrencias
        int contador = 0;
        var test  = sTexto.indexOf(sTextoBuscado);
        while (sTexto.indexOf(sTextoBuscado) > -1) {
            var test2 = sTexto.indexOf(sTextoBuscado);
            var test3 =+sTextoBuscado.length();
            var test4 = sTexto.length();
            sTexto = sTexto.substring(sTexto.indexOf(sTextoBuscado) + sTextoBuscado.length(),sTexto.length());
            contador++;
        }

        System.out.println (contador);

    }
}
