package org.example;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Reverse
        System.out.println( reverseString ("Hola Mundo") + "\n");

        //1.
        arregloUnidimensional();

        //2.
        arregloBidimensional();

        //3.
        eliminarDatosVector();

        //4.
        /*
        No sería escalable el vector ya que no es dinamico, entonces si se definió con un
        tamaño inferior al que se usará futuramente, arrojara error
        */

        //5.
        crearLinkedList();

        //6.
        punto6();

        //7.
        punto7();

        //8.
        try{
            punto8("pom.xml", "pom-copia.xml");
        } catch (IOException e){
            System.out.println("Excepcion en punto 8: " + e.getMessage());
        }

        /* 9.El programa lee una lista de nombres y edades de un archivo de texto,
        los guarda en un HashMap, y luego filtra las personas mayores de 18 años en un ArrayList. Finalmente,
        imprime los nombres de las personas mayores de 18 años utilizando PrintStream. */
        punto9();


    }

    public static String reverseString(String str) {
        System.out.println("Punto 0");
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }

    public static void arregloUnidimensional(){
        //Arreglo unidimencional
        System.out.println("Punto 1");
        String[] miArray = {"Hola", "mundo", "en", "Java"};

        for (int i = 0; i < miArray.length; i++) {
            System.out.println(miArray[i]);
        }
        System.out.println("");
    }

    public static void arregloBidimensional(){
        System.out.println("Punto 2");
        int[][] miArray = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

        // Recorriendo el array y mostrando su posición y valor
        for (int i = 0; i < miArray.length; i++) {
            for (int j = 0; j < miArray[i].length; j++) {
                System.out.println("Valor en [" + i + "][" + j + "]: " + miArray[i][j]);
            }
        }
        System.out.println("");
    }

    public static void eliminarDatosVector(){
        System.out.println("Punto 3");
        Vector<Integer> miVector = new Vector<Integer>();
        miVector.add(10);
        miVector.add(20);
        miVector.add(30);
        miVector.add(40);
        miVector.add(50);

        miVector.remove(2);
        miVector.remove(2);

        for (int i = 0; i < miVector.size(); i++) {
            System.out.println(miVector.get(i));
        }
        System.out.println("");
    }


    public static void crearLinkedList(){
        System.out.println("Punto 5");
        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("manzana");
        miArrayList.add("naranja");
        miArrayList.add("banana");
        miArrayList.add("pera");

        LinkedList<String> miLinkedList = new LinkedList<String>(miArrayList);

        // Mostrando el ArrayList
        System.out.println("ArrayList:");
        for (String elemento : miArrayList) {
            System.out.println(elemento);
        }

        // Mostrando el LinkedList
        System.out.println("\nLinkedList:");
        for (String elemento : miLinkedList) {
            System.out.println(elemento);
        }
        System.out.println("");
    }

    public static void punto6(){
        System.out.println("Punto 6");
        ArrayList<Integer> miArrayList = new ArrayList<Integer>();

        // Rellenando el ArrayList
        for (int i = 1; i <= 10; i++) {
            miArrayList.add(i);
        }

        // Eliminando los pares
        for (int i = miArrayList.size() - 1; i >= 0; i--) {
            if (miArrayList.get(i) % 2 == 0) {
                miArrayList.remove(i);
            }
        }

        System.out.println("ArrayList final:");
        for (int elemento : miArrayList) {
            System.out.println(elemento);
        }
        System.out.println("");
    }

    public static void punto7(){
        System.out.println("punto 7");
        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
        System.out.println("");
    }

    public static void DividePorCero() throws ArithmeticException {
        int resultado = 10 / 0;
    }

    public static void punto8(String fileIn, String fileOut) throws IOException {
        System.out.println("punto 8 ver archivo");
        InputStream inputStream = null;
        PrintStream printStream = null;
        try {
            inputStream = new FileInputStream(fileIn);
            printStream = new PrintStream(new FileOutputStream(fileOut));
            byte[] buffer = new byte[1024];
            int length;
            while ((length = inputStream.read(buffer)) > 0) {
                printStream.write(buffer, 0, length);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (printStream != null) {
                printStream.close();
            }
        }
    }

    public static void punto9(){
        System.out.println("punto 9 ver archivo mayores_de_18");
        InputStream inputStream = null;
        Scanner scanner = null;
        PrintStream printStream = null;
        try {
            // Leer archivo de entrada
            inputStream = new FileInputStream("nombres_edades.txt");
            scanner = new Scanner(inputStream);

            // Crear HashMap para almacenar nombres y edades
            Map<String, Integer> personas = new HashMap<String, Integer>();
            while (scanner.hasNextLine()) {
                String[] linea = scanner.nextLine().split(",");
                personas.put(linea[0], Integer.parseInt(linea[1]));
            }

            // Filtrar personas mayores de 18 años en un ArrayList
            List<String> mayoresDe18 = new ArrayList<String>();
            for (String nombre : personas.keySet()) {
                if (personas.get(nombre) > 18) {
                    mayoresDe18.add(nombre);
                }
            }

            // Imprimir los nombres de las personas mayores de 18 años
            printStream = new PrintStream(new FileOutputStream("mayores_de_18.txt"));
            for (String nombre : mayoresDe18) {
                printStream.println(nombre);
            }
        } catch (FileNotFoundException e) {
            System.err.println("El archivo no fue encontrado");
        } catch (IOException e) {
            System.err.println("Error al leer el archivo");
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.err.println("Error al cerrar el InputStream");
                }
            }
            if (scanner != null) {
                scanner.close();
            }
            if (printStream != null) {
                printStream.close();
            }
        }
    }
}