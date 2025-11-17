package Ejercicios_U3.U3_E7_ComparandoBusquedas;

import java.util.Arrays;
import java.util.Scanner;

public class ComaparandoBusquedas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Crear el array de 10000 numeros
        int [] num = new int[10000];
        //Rellenar dichoa array de numeros aleatorios
        //Entre 0 y 999999
        for(int i=0;i<num.length;i++){
            num[i]=(int)(Math.random()*100001);
        }
        //Copiamos el Array
        int [] copia = Arrays.copyOf(num,num.length);
        //Ordenamos el Array
        Arrays.sort(copia);
        //Pedimos al usuario que nos diga un numero entero
        //para buscar en ambos arrays
        System.out.println("Dime un numero entre 0 y 999999");
        int numero=sc.nextInt();
        long antes = System.nanoTime();
        //Buscamos dicho numero primero en el Array de num
        for (int i=0;i<num.length;i++){
            if(numero==num[i]){
                System.out.println("El numero "+num[i]+" esta en la"+"posicion "+i);
                break;
            }
        }
        long despues = System.nanoTime();
        var resultado=despues-antes;
        System.out.println("Ha tardado:"+resultado);
        //Buscamos ahora el numero en el Array copia que esta ordenada
        long antes2 = System.nanoTime();
        for(int i=0;i< copia.length;i++){
            if(numero==copia[i]){
                System.out.println("El numero "+num[i]+" esta en la"+"posicion "+i);
            }
        }

        long despues2 = System.nanoTime();
        var resultado2=despues2-antes2;
        System.out.println("Ha tardado:"+resultado2);

        long inicioBin = System.nanoTime();
        int indice=Arrays.binarySearch(copia,numero);

        long finalBin = System.nanoTime();
        long timepo = finalBin-inicioBin;
        System.out.println(timepo);




    }
}
