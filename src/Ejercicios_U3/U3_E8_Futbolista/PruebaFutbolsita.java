package Ejercicios_U3.U3_E8_Futbolista;

//import Ejercicios_U3.U3_E2_4_Futbolista.es.marca.futbol.jugadores.Futbolista;

import java.util.Scanner;

public class PruebaFutbolsita {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Menu de opciones");
        System.out.println("------------------");
        System.out.println("0-Salir");
        System.out.println("1-Mostra Estado");
        System.out.println("2-Marcar Varios Goles");
        System.out.println("3-Anular Varios Goles");
        System.out.println("4-Cambiar nombre y apellidos");
        System.out.println("5-Cambiar Salario");
        System.out.println("6-Se lesiona");
        System.out.println("7-Se recuper");
        int opcion=sc.nextInt();
        var f = new Futbolista("Manuel","Morales Morilla",100.00);
        switch (opcion){
            case 0:
                System.out.println("Saliendo");
                break;
            case 1:
                MenuFutbolista.mostrarEstado(f);
                break;
            case 2:
                MenuFutbolista.marcarVariosGoles(f);
            case 3:
                MenuFutbolista.anularVariosGoles(f);
            case 4:
                MenuFutbolista.cambiarNombreApellido(f);
            case 5:
                MenuFutbolista.cambiarSalario(f);
            case 6:
                MenuFutbolista.lesionado(f);
            case 7:
                MenuFutbolista.recuperado(f);
            default:
                System.out.println("Opcion incorrecta");
        }
    }
}
