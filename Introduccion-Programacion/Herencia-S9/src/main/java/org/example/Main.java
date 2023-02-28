package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setEdad(34);
        cliente.setNombre("Martin Puerta");
        cliente.setTelefono(573151445788L);
        cliente.setCredito("credito 1");

        System.out.println("La edad del cliente es: " + cliente.getEdad());
        System.out.println("El nombre del cliente es: " + cliente.getNombre());
        System.out.println("El telefono del cliente es: " + cliente.getTelefono());
        System.out.println("El credito del cliente es: "+ cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.setEdad(30);
        trabajador.setNombre("Pedro Gonzalez");
        trabajador.setTelefono(573231542356L);
        trabajador.setSalario("5.000 euros");

        System.out.println("La edad del trabajador es: " + trabajador.getEdad());
        System.out.println("El nombre del trabajador es: " + trabajador.getNombre());
        System.out.println("El telefono del trabajador es: " + trabajador.getTelefono());
        System.out.println("El salario del trabajador es: "+ trabajador.getSalario());

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

class Cliente extends Persona {
    private String credito;

    public String getCredito() {
        return credito;
    }

    public void setCredito(String credito) {
        this.credito = credito;
    }

}

class Trabajador extends Persona {
    private String salario;

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

}