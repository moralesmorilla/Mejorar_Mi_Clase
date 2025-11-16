package Ejercicios_U3.U3_E2_Futbolista.futbol.es.marca.futbol.jugadores;

public class Futbolista {
    private String nombre,apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public Futbolista(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public void marcaGol(){
        if (!this.lesionado){
            this.numGoles++;
        }else {
            System.out.println("Un jugador lesionado no puede marcar golegit add .");
        }

    }
    public void marcaGol(int numGoles){
        if (!this.lesionado){
            this.numGoles+=numGoles;
        }
    }
    public void golAnulado(){
        if (numGoles>0)
        this.numGoles--;
    }
    public void golAnulado(int numGoles){
        if (numGoles>0)
            this.numGoles-=numGoles;}
    }
    public void salario(double salario) {

}



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumGoles() {
        return numGoles;
    }

    public void setNumGoles(int numGoles) {
        this.numGoles = numGoles;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isLesionado() {
        return lesionado;
    }

    public void setLesionado(boolean lesionado) {
        this.lesionado = lesionado;
    }
}
