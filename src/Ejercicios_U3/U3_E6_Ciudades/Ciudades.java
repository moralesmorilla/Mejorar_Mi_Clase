package Ejercicios_U3.U3_E6_Ciudades;


import java.util.Arrays;
import java.util.Scanner;

public class Ciudades {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nameCity;
        final int numCity=4;
        String [] citys = new String[numCity];

        for (int i=0;i<citys.length;i++){
            System.out.println("Cual es el nombre de la ciudad??");
            nameCity=sc.nextLine();
            citys[i]=nameCity;
        }
        Arrays.sort(citys);
        System.out.println("Las ciudades elegidas son:");
        for (int i=0;i<citys.length;i++){
            System.out.println((i+1)+":"+citys[i]);
        }

    }
}
