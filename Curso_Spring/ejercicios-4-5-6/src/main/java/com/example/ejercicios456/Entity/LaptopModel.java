package com.example.ejercicios456.Entity;

import javax.persistence.*;

@Entity
@Table(name = "laptops")
public class LaptopModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;

    public LaptopModel() {
    }

    public LaptopModel(Long id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
