package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba el precio");
        double valor = scanner.nextDouble();
        System.out.println(adicionarIVA(valor));
    }

    private static double adicionarIVA(double valor){
        double iva = 0.17;
        return valor + (valor * iva);
    }
}