package Ejercicios_U3.U3_E10_Contacto;

import java.util.Scanner;

public class PruebaListaContacto {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("De cuantas personas quieres que sea tu lista?");
        int numLista=sc.nextInt();
        sc.nextLine();
        var lc=new ListaContacto(numLista);
        do {
            System.out.println("Dime el nombre");
            String nombre=sc.nextLine();
            System.out.println("Apellidos");
            String apellidos=sc.nextLine();
            System.out.println("Telefono");
            String telefono= sc.nextLine();
            System.out.println("Email");
            String email= sc.nextLine();
            var c1 =new Contacto(nombre,apellidos,email,telefono);
            lc.anadirContacto(c1);
            lc.buscarContactoEmail(email);
            numLista--;

        } while(numLista!=0);


        lc.listarContactos();



    }
}
