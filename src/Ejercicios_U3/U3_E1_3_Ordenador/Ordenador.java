package Ejercicios_U3.U3_E1_3_Ordenador;

public class Ordenador{
    private String marca,modelo;
    private int anioFabricacion;
    private boolean logico;
    public Ordenador(){
        assert marca!=null && !marca.isEmpty():"Error: La marca debe estar rellena";
        assert modelo!=null && !modelo.isEmpty():"Error: El modelo debe estar relleno";
    }

    public Ordenador(String marca, String modelo) {
        assert anioFabricacion>1990 && anioFabricacion>=0  :"Error: el anio de fabricacion debe ser mayor que 1990 y mayor que 0";
        assert marca!=null && !marca.isEmpty():"Error: La marca debe estar rellena";
        assert modelo!=null && !modelo.isEmpty():"Error: El modelo debe estar relleno";
        this.marca = marca;
        this.modelo = modelo;
    }

    public Ordenador(String marca, int anioFabricacion, String modelo) {
        assert anioFabricacion>1990 || anioFabricacion>=0  :"Error: el anio de fabricacion debe ser mayor que 1990";
        assert marca!=null && !marca.isEmpty():"Error: La marca debe estar rellena";
        assert modelo!=null && !modelo.isEmpty():"Error: El modelo debe estar relleno";
        this.anioFabricacion = anioFabricacion;
        this.marca = marca;
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
