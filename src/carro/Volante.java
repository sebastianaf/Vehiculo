package carro;

public class Volante {
    private String marca;
    private int tamanio;
    
    public Volante(String marca, int tamanio){
        this.marca = marca;
        this.tamanio = tamanio;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
     
    
}
