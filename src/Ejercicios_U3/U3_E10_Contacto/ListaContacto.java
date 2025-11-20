package Ejercicios_U3.U3_E10_Contacto;

import java.util.Arrays;
import java.util.Scanner;

public class ListaContacto {
    Scanner sc = new Scanner(System.in);
    private int numContactos;
    private Contacto[] listaContacto;
    //Constructor
//    public ListaContacto(){
//
//    }

    //Con este metodo creamos la lista con el numero de contacto que queremos
    public ListaContacto(int numContactos) {
        this.numContactos = numContactos;
        this.listaContacto = new Contacto[numContactos];
    }
    //Con este metodo añadimos a la lista de contactos cada contacto que queremos
    public void anadirContacto(Contacto c){

        //Con este metodo buscamos si hay algun hueco libre
        for (int i = 0; i < listaContacto.length; i++) {
            Contacto actual = listaContacto[i];
            if (actual != null && actual.getNombre().equals(c.getNombre()) && actual.getApellidos().equals(c.getApellidos())) {
                    System.out.println("Este contacto ya existe");
                    return;
                }
            }
        //Si hay hueco libre se pasa a este for
        //Rellenando el hueco libre que haya
        for (int i = 0; i < listaContacto.length ; i++) {
            if (listaContacto[i]==null){
                listaContacto[i]=new Contacto(c.getNombre(), c.getApellidos());
                System.out.println("Contacto añadido");
                return;
            }

        }

        System.out.println("La lista esta llena");
    }
    //Crear metodos sobrecargados que nos permitan buscar contacto
    public void buscarContactoEmail(Contacto c){
        for (int i=0;i<listaContacto.length;i++){
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getEmail().equals(c.getEmail())){
                System.out.println(actual);
                return;
            }else{
                System.out.println("Contacto no encontrado");

            }
        }
    }
    public void buscarContactoTelefono(Contacto c){
        for (int i=0;i<listaContacto.length;i++){
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getTelefono().equals(c.getTelefono())){
                System.out.println(actual);
                return;
            }else{
                System.out.println("Contacto no encontrado");

            }
        }
    }
    public void buscarContactoNombreApellido(Contacto c){
        for (int i=0;i<listaContacto.length;i++){
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getNombre().equals(c.getNombre()) && actual.getApellidos().equals(c.getApellidos())){
                System.out.println(actual);
                return;
            }else{
                System.out.println("Contacto no encontrado");

            }
        }
    }

    public void borrarContactoNombreApellido(Contacto c){

    }
    public void borrarContactoTelefono(Contacto c){

    }
    public void borrarContactoEmail(Contacto c){

    }

    public void vaciarLista(Contacto c){
        for (int i = 0; i < listaContacto.length; i++) {
            listaContacto[i]=null;
        }
    }
    public void listarContactos(){
        for (int i=0;i<listaContacto.length;i++) {
            if(listaContacto[i]!=null){
                System.out.println(listaContacto[i]);
            }

        }
    }
}
