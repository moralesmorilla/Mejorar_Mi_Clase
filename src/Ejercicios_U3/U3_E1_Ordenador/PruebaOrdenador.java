package Ejercicios_U3.U3_E1_Ordenador;

public class PruebaOrdenador {
    static void main(String[] args) {
        var o1 = new Ordenador();
        var o2 = new Ordenador("Manuel","HP");
        var o3 = new Ordenador("Bochan",2010,"AMD");
        o1.imprimeEstado();
        o2.imprimeEstado();
        o3.imprimeEstado();
    }
}
