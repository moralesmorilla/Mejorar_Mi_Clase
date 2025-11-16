package Ejercicios_U3.U3_E1_Ordenador;

public class Ordenador{
    private String marca,modelo;
    private int anioFabricacion;
    private boolean logico;
    public Ordenador(){

    }

    public Ordenador(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, int anioFabricacion, String modelo) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.modelo = modelo;
    }
    public void imprimeEstado(){
        System.out.println("Marca "+marca);
        System.out.println("Modelo "+modelo);
        System.out.println("Anios de Fabricacion "+anioFabricacion);
        System.out.println("Encendido: "+logico);
        System.out.println("----------------------------");
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isLogico() {
        return logico;
    }

    public void setLogico(boolean logico) {
        this.logico = logico;
    }
}
