package Ejercicios_U3.Ejercicios_U3_E5_Alumnos_Matriculados;

import java.util.Arrays;
import java.util.Scanner;

public class Alumnos_Matriculados {
    static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Cuantos alumnos hay matriculados en la clase:");
        int alum=sc.nextInt();
        int [] alumnos = new int[alum];
        for (int i=0;i<alumnos.length;i++){
            alumnos[i]=(int) (Math.random()*101);
            System.out.println(alumnos[i]);

        }
        Arrays.sort(alumnos);
        System.out.println("La nota mas baja de la clase es "+alumnos[0]);
        System.out.println("La nota mas baja de la clase es "+alumnos[alum-1]);


    }
}
