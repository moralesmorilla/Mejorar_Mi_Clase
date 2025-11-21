package Ejercicios_U3.U3_Ereto;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int max = 100;
        int min = 0;
        boolean encontrado = false;
        String answer = "";
        int randomNumber = 0;
        System.out.println("Piensa un numero");
        System.out.println("------------------");
        do {
            randomNumber=50;
            System.out.println("Tu numero es " + randomNumber + " ?");
            answer = sc.nextLine();
            if (answer.toLowerCase().equals("si")) {
                encontrado = true;
                break;
            } else {
                    System.out.println("Tu numero es mayor que " + randomNumber + " ?");
                    answer = sc.nextLine();
                    if (answer.toLowerCase().equals("si")) {
                        min = randomNumber + 1;
                        randomNumber=randomNumber+randomNumber/2;


                    } else {
                        max = randomNumber - 1;
                        randomNumber=randomNumber-randomNumber/2;
                    }
                if (min>max){
                    System.out.println("Mentiroso");
                    break;
                }
                }
        }
        while (!encontrado);
        System.out.println("Numero adivinado");
    }
}
