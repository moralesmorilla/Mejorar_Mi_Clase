package Ejercicios_U3.U3_E8_Futbolista;

import java.util.Scanner;

public class MenuFutbolista {
    static Scanner sc=new Scanner(System.in);

    public static void mostrarEstado(Futbolista f){
        if(f.isLesionado()){
            System.out.println(f.getNombre()+" "+f.getApellidos()+" esta "+f.isLesionado()+" ha marcado "+f.getNumGoles()+
                    " goles y gana "+f.getSalario()+" euros");
        }else {
            System.out.println(f.getNombre()+" "+f.getApellidos()+" esta lesionado y ha marcado "+f.getNumGoles()+
                    " goles y gana "+f.getSalario()+" euros");
        }

    }

    public static void marcarVariosGoles(Futbolista f){
        System.out.println("Cuantos goles ha marcado");
        f.marcaGol(sc.nextInt());

    }
    public static void anularVariosGoles(Futbolista f){
        System.out.println("Cuantos goles vas anular");
        f.golAnulado(sc.nextInt());
    }
    public static void cambiarNombreApellido(Futbolista f){

        System.out.print("Nombre: ");
        f.setNombre(sc.nextLine());
        System.out.print("Apellido: ");
        f.setApellidos(sc.nextLine());
        System.out.println("Nuevo nombre sera "+f.getNombre()+" "+f.getApellidos());
    }

    public static void cambiarSalario(Futbolista f){
        System.out.println("Caunto salario tiene: ");
        f.setSalario(sc.nextDouble());
    }
    public static void lesionado(Futbolista f){
        f.setLesionado(true);
    }
    public static void recuperado(Futbolista f){
        f.setLesionado(false);
    }
}
