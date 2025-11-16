package Ejercicios_U3.U3_E2_Futbolista.es.marca.futbolista;

import Ejercicios_U3.U3_E2_Futbolista.es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolsita {
    static void main(String[] args) {
        var f = new Futbolista("Manuel","Morales Morilla");
        f.marcaGol();
        f.marcaGol(20);
        f.golAnulado();
        f.golAnulado(21);
        f.numeroGoles();
    }
}
