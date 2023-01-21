package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;

public class Checks {

    private static int[][] game;
    public Checks(int[][] game){
        this.game = game;
    }

    //Arreglo con la posicion donde cada numero estaba en cada arreglo del juego

    // Arreglo de arreglos int[9][9] aComparar;
    static ArrayList<Integer> uno = new ArrayList<>(9);
    static ArrayList<Integer> dos = new ArrayList<>(9);
    static ArrayList<Integer> tres = new ArrayList<>(9);
    static ArrayList<Integer> cuatro = new ArrayList<>(9);
    static ArrayList<Integer> cinco = new ArrayList<>(9);
    static ArrayList<Integer> seis = new ArrayList<>(9);
    static ArrayList<Integer> siete = new ArrayList<>(9);
    static ArrayList<Integer> ocho = new ArrayList<>(9);
    static ArrayList<Integer> nueve = new ArrayList<>(9);


    private static boolean repetidos(int[][] game){

        //Arreglo a comparar
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        boolean seRepite = true;

        for (int[] u: game) {
            //Ordenar arreglo menor a mayor
            Arrays.sort(u);
            //Verificar si los arreglos son iguales
            //Si no son iguales perder, si son iguales continuar y guardar posicion de los numeros
            if (!(seRepite == Arrays.equals(u, numbers))){
                seRepite = false;
            }
        }
        return seRepite;
    }

    private static boolean orden(int[][] game){

        boolean gana = true;

        outer : for (int[] u: game) {
            for(int i = 0; i < u.length; i++){

                int x;
                x = u[i];
                switch (x){
                    case 1:
                        if (x == uno.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            uno.set(i, x);
                            break ;
                        }
                    case 2:
                        if (x == dos.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            dos.set(i, x);
                            break ;
                        }
                    case 3:
                        if (x == tres.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            tres.set(i, x);
                            break ;
                        }
                    case 4:
                        if (x == cuatro.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            cuatro.set(i, x);
                            break ;
                        }
                    case 5:
                        if (x == cinco.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            cinco.set(i, x);
                            break ;
                        }
                    case 6:
                        if (x == seis.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            seis.set(i, x);
                            break ;
                        }
                    case 7:
                        if (x == siete.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            siete.set(i, x);
                            break ;
                        }
                    case 8:
                        if (x == ocho.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            ocho.set(i, x);
                            break ;
                        }
                    case 9:
                        if (x == nueve.get(i)){
                            gana = false;
                            break outer;
                        }else {
                            nueve.set(i, x);
                            break ;
                        }
                }

            }
        }
        return gana;
    }


    public static boolean winOrLose(){

        boolean wOrL = false;

        if (repetidos(game)){
            if (orden(game)){
                wOrL = true;
            }
        }

        return wOrL;
    }

}
