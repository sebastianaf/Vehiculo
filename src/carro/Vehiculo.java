package carro;

import java.util.Date;

public class Vehiculo {
    
    private String marca;
    private String modelo;
    private int velMaxima;
    private Volante volante;
    private Cono conoDeDesvare;
    
    public Vehiculo(String marca, String modelo, int velMaxima) {
        this.volante = new Volante("Aprila",10);
        this.marca = marca;
        this.modelo = modelo;
        this.velMaxima = velMaxima;
    }

    public Volante getVolante() {
        return volante;
    }
    
    

    public Cono getConoDeDesvare() {
        return conoDeDesvare;
    }

    public void setConoDeDesvare(Cono conoDeDesvare) {
        this.conoDeDesvare = conoDeDesvare;
    }
    
    
    
    public String getMarca() {
        return "Sin marca registrada";
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

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }        
}

