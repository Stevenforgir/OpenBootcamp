package org.example;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        int numeroA = 15;
        int divisor = 0;
        int arreglo []= {1,2,3,4,5,6};
        try{
            int resultado = numeroA / divisor;
            System.out.println(resultado);
        } catch (ArithmeticException e){
            System.out.println("Error en la división " + e.getMessage());
        }

        try {
            int verPosicion = arreglo[8];
            System.out.println(verPosicion);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error en el arreglo ya que no existe la posicion " + e.getMessage());
        }
    }
}