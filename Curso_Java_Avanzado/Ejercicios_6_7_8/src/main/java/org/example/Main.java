package org.example;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

public class Main {
    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();
        singleton1.setContador(15);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(20);

        System.out.println("Valor: " + singleton1.getContador() + " en memoria: " + singleton1);
        System.out.println("Valor: " + singleton2.getContador() + " en memoria: " + singleton2);
    }
}