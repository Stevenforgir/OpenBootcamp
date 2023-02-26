package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int resultado = suma(10, 20, 30);
        System.out.println("El resultado de la suma es: " + resultado);

        Coche miCoche = new Coche();
        miCoche.addPuerta();
        System.out.println(miCoche.puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

class Coche {
    public int puertas = 0;

    public void addPuerta(){
        this.puertas++;
    }
}