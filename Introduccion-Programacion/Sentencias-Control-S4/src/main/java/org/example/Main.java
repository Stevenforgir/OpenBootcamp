package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //---Parte 1
        int numeroIf = 0;
        if(numeroIf < 0){
            System.out.println("El numero es negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es cero");
        } else {
            System.out.println("El numero es positivo");
        }

        //---Parte 2
        int numeroWhile = 0;
        while (numeroWhile < 3){
            System.out.println("Esta es la ejecucion numero: " + numeroWhile + " del while");
            numeroWhile ++;
        }

        //--Parte 3
        numeroWhile = 0;
        do{
            System.out.println("Esta es la ejecucion numero: " + numeroWhile + " del do-while");
            numeroWhile =3;
        } while (numeroWhile < 3);

        //--Parte 4
        for (int numeroFor =0 ; numeroFor <= 3 ; numeroFor ++) {
            System.out.println("Esta es la ejecicion numero: " + numeroFor + " del for");
        }

        //--Parte 5
        String estacion = "verano";
        switch(estacion.toLowerCase()){
            case "verano":
                System.out.println("La estacion actual es: " + "verano");
                break;
            case "primavera":
                System.out.println("La estacion actual es: " + "primavera");
                break;
            case "otono":
                System.out.println("La estacion actual es: " + "otono");
                break;
            case "invierno":
                System.out.println("La estacion actual es: " + "invierno");
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}