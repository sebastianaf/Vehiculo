package carro;

import java.util.Date;

public class Vehiculo {
    
    private String marca;
    private Date modelo;
    private int velMaxima;

    public Vehiculo(String marca, Date modelo, int velMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velMaxima = velMaxima;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Date getModelo() {
        return modelo;
    }

    public void setModelo(Date modelo) {
        this.modelo = modelo;
    }

    public int getVelMaxima() {
        return velMaxima;
    }

    public void setVelMaxima(int velMaxima) {
        this.velMaxima = velMaxima;
    }        
}

