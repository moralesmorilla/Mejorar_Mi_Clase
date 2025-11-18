package Ejercicios_U3.U3_E9_ListarNombres;

import java.util.Scanner;

public class PruebaListasNombres {
    static void main(String[] args) {
        var ln = new ListaNombres();
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU DE OPCIONE");
        System.out.println("---------------------");
        System.out.println("0-Salir");
        System.out.println("1-Añadir Usuario");
        System.out.println("2-Borrar Usuario");
        System.out.println("3-Modificar Usuario");
        System.out.println("4-Imprimir Lista");
        int opcion=sc.nextInt();
        switch (opcion){
            case 0:
                System.out.println("Saliendooooo");
                break;
            case 1:
                System.out.println("Que nombre quieres añadir??");
                ln.añadirNombre(sc.nextLine());
            case 2:
                System.out.println("Que nombre quieres borrar??");
                ln.borrarNombre(sc.nextLine());
            case 3:
                System.out.println("Que nombre quieres modificar");
                String nombreAntiguo=sc.nextLine();
                System.out.println("Que nombre quieres poner");
                String nombreNuevo= sc.nextLine();
                ln.modificarNombre(nombreAntiguo,nombreNuevo);
            case 4:
                ln.imprimirLista();
        }
    }
}
