package Ejercicios_U3.U3_E2_4_Futbolista.es.marca.futbolista;

import Ejercicios_U3.U3_E2_4_Futbolista.es.marca.futbol.jugadores.Futbolista;

public class PruebaFutbolsita {
    static void main(String[] args) {
        var f = new Futbolista("Manuel","Morales Morilla",100.00);
        f.marcaGol();
        f.marcaGol(9);
        f.golAnulado();
        f.golAnulado(6);
        f.numeroGoles();
    }
}
