package org.example;

public class SmartPhone extends SmartDevice {
    String tipoPantalla;
    String sistemaOperativo;
    String tamano;

    public SmartPhone() {
    }

    public SmartPhone(String tipoPantalla, String sistemaOperativo, String tamano) {
        this.tipoPantalla = tipoPantalla;
        this.sistemaOperativo = sistemaOperativo;
        this.tamano = tamano;
    }

    public SmartPhone(String marca, String modelo, String precio, String color, String tipoPantalla, String sistemaOperativo, String tamano) {
        super(marca, modelo, precio, color);
        this.tipoPantalla = tipoPantalla;
        this.sistemaOperativo = sistemaOperativo;
        this.tamano = tamano;
    }

    public String getTipoPantalla() {
        return tipoPantalla;
    }

    public void setTipoPantalla(String tipoPantalla) {
        this.tipoPantalla = tipoPantalla;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tipoPantalla='" + tipoPantalla + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", tamano='" + tamano + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
