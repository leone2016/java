package pildoras.console;

import javax.swing.*;

public class _24_for_each {
    public static void main(String[] args) {
        String[] paises = new String[8];
/*
        paises[0] = "España";
        paises[1] = "México";
        paises[2] = "Colombia";
        paises[3] = "Perú";
        paises[4] = "Chile";
        paises[5] = "Argentina";
        paises[6] = "Ecuador";
        paises[7] = "Venezuela";*/

       /* for(int i = 0; i < paises.length; i++) {
            System.out.println("País " + (i + 1) + ": " + paises[i]);
        }*/

        for(int i = 0; i < paises.length; i++) {
            paises[i] = JOptionPane.showInputDialog("Introduce país " + (i + 1));
        }

       for(String pais: paises){
           System.out.println("País : " + pais);
       }

       int[] matriz_aleatorios = new int[150];
       for(int i = 0; i < matriz_aleatorios.length; i++){
           matriz_aleatorios[i] = (int)Math.round(Math.random()*100);
       }

        System.out.println("Matriz de números aleatorios");
       for(int numeros: matriz_aleatorios){
           System.out.print(numeros + " ");
       }
    }
}
