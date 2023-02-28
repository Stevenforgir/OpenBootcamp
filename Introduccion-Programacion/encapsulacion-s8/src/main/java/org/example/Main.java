package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Persona persona = new Persona();
        persona.setEdad(34);
        persona.setNombre("Martin Puerta");
        persona.setTelefono(573151445788L);

        System.out.println("La edad de la persona es: " + persona.getEdad());
        System.out.println("El nombre de la persona es: " + persona.getNombre());
        System.out.println("El telefono de la persona es: " + persona.getTelefono());
    }
}

class Persona {
    private Integer edad;
    private String nombre;
    private Long telefono;

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getTelefono() {
        return telefono;
    }

    public void setTelefono(Long telefono) {
        this.telefono = telefono;
    }
}