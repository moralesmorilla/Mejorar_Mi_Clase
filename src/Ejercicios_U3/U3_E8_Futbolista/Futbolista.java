package Ejercicios_U3.U3_E8_Futbolista;

public class Futbolista {
    private String nombre,apellidos;
    private int numGoles;
    private double salario;
    private boolean lesionado;

    public Futbolista(String nombre, String apellidos, double salario) {
        assert salario>=0:"Error:El salario debe ser positivo";
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public void marcaGol(){
        assert !lesionado && numGoles>=0:"Error: No puede estar lesionado,numero de goles mayor que cero";
        numGoles++;
    }
    public void golAnulado(){
        assert numGoles>0: "El valor de los goles debe ser postivo";

                numGoles--;
    }
    public void marcaGol(int numGoles){
        assert !lesionado: "Un jugador lesionado no puede marcar goles";
        assert numGoles<10:"Error:El programa solo permite hasta 9 goles";
        this.numGoles+=numGoles;

    }
    public void golAnulado(int numGoles){
        assert numGoles>0:"Error:El numero de goles debe ser positivo";
        assert numGoles<10:"Error:El programa solo permite hasta 9 goles anulados";
        this.numGoles-=numGoles;

    }
    public void numeroGoles(){
        System.out.println("El jugador "+nombre+" lleva "+numGoles);
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


