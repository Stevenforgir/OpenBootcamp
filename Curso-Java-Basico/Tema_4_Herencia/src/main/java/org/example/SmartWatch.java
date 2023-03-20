package org.example;

public class SmartWatch extends SmartDevice {
    Boolean gps;
    String deportes;
    String duracionBateria;

    public SmartWatch() {
    }

    public SmartWatch(String marca, String modelo, String precio, String color, Boolean gps, String deportes, String duracionBateria) {
        super(marca, modelo, precio, color);
        this.gps = gps;
        this.deportes = deportes;
        this.duracionBateria = duracionBateria;
    }

    public Boolean getGps() {
        return gps;
    }

    public void setGps(Boolean gps) {
        this.gps = gps;
    }

    public String getDeportes() {
        return deportes;
    }

    public void setDeportes(String deportes) {
        this.deportes = deportes;
    }

    public String getDuracionBateria() {
        return duracionBateria;
    }

    public void setDuracionBateria(String duracionBateria) {
        this.duracionBateria = duracionBateria;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "gps=" + gps +
                ", deportes='" + deportes + '\'' +
                ", duracionBateria='" + duracionBateria + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precio='" + precio + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
