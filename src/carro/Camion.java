package carro;

public class Camion extends Vehiculo {

    private int capacidad;
    private Boolean todoTerreno;
    private int peso;

    public Camion(int capacidad, Boolean todoTerreno, int peso, String marca, String modelo, int velMaxima) {
        super(marca, modelo, velMaxima);
        this.capacidad = capacidad;
        this.todoTerreno = todoTerreno;
        this.peso = peso;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Boolean getTodoTerreno() {
        return todoTerreno;
    }

    public void setTodoTerreno(Boolean todoTerreno) {
        this.todoTerreno = todoTerreno;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
