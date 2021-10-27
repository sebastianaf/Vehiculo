package carro;

import java.util.ArrayList;


public class Volqueta extends Camion{
    private int tamanioVagon;
    private Boolean automatica;
    private String empresa;

    public Volqueta(int tamanioVagon, Boolean automatica, int capacidad, Boolean todoTerreno, int peso, String marca, String modelo, int velMaxima) {
        super(capacidad, todoTerreno, peso, marca, modelo, velMaxima);
        this.tamanioVagon = tamanioVagon;
        this.automatica = automatica;
    }

    public int getTamanioVagon() {
        return tamanioVagon;
    }

    public void setTamanioVagon(int tamanioVagon) {
        this.tamanioVagon = tamanioVagon;
    }

    public Boolean getAutomatica() {
        return automatica;
    }

    public void setAutomatica(Boolean automatica) {
        this.automatica = automatica;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }  
    
    public static void main(String[] args) {
        Camion miCamion = new Camion(10, true, 4, "Mercedez Benz", "2021-10-20", 150);

        //Objeto camnión
        System.out.println(miCamion.getPeso());
        System.out.println(miCamion.getVelMaxima());
        Volqueta miVolqueta = new Volqueta(10, true, 30, true, 4, "Mercedez Benz", "2017-01-01", 100);

        System.out.println(miVolqueta.getVelMaxima());
        
        //Composición
        System.out.println("Revisión de la volqueta");
        System.out.println("Marca:" + miVolqueta.getVolante().getMarca());
        System.out.println("Tamaño:" + miVolqueta.getVolante().getTamanio());
        
        //Agregación
        Cono conoReflectivo = new Cono("Naranja",false);
        System.out.println("Inspección  1 -  Cono de Volqueta");
        System.err.println(miVolqueta.getConoDeDesvare());
        miVolqueta.setConoDeDesvare(conoReflectivo);
        System.out.println("Inspección  2 -  Cono de Volqueta");
        System.out.println("Color:" + miVolqueta.getConoDeDesvare().getColor());
        System.out.println("Publico:" + miVolqueta.getConoDeDesvare().getPublico());        
        
        
    }
    
}
