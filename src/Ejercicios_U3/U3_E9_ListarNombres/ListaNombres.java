package Ejercicios_U3.U3_E9_ListarNombres;

public class ListaNombres {
    private String [] listaNombres= new String[20];
    private String nombre;
    //Declaramos un constructor vacio, para añaidrlo luego al mian
    //Donde iremos añadiendo los nombres con lso diferentes metodos
    public ListaNombres() {

    }

    public void añadirNombre(String nombre){
        assert nombre!=null && !nombre.isEmpty():"Error: El nombre debe estar relleno";
            for (int i=0;i<listaNombres.length;i++){
                if (i<=19){
                    if (listaNombres[i].isEmpty()){
                        listaNombres[i]=nombre;
                        break;
                    }
                }else {
                    System.out.println("Todos los huecos estan llenis");
                }
            }
        }
    public void borrarNombre(String nombre){
        for (int i=0;i<listaNombres.length;i++){
            if(listaNombres[i].isEmpty()){
                continue;
            }else if (listaNombres[i].equals(nombre)){
                System.out.println("El nombre "+nombre+" estaba en la posicion "+i+" y se ha borrado de la lista");
                listaNombres[i]="";
            }else {
                System.out.println("El nombre "+nombre+" no esta en la lista");
            }
        }
    }

    public void modificarNombre(String nombre,String nuevoNombre){
        for (int i=0;i<listaNombres.length;i++){
            if (listaNombres[i].equals(nombre)){
                listaNombres[i]=nuevoNombre;
            }else {
                System.out.println("El nombre "+nombre+" no esta en la lista por lo que no se puede modificar");
            }
        }
    }
    public void imprimirLista(){
        for (int i = 0; i < listaNombres.length; i++) {
            if (listaNombres[i].isEmpty()){
                continue;
            }else {
                System.out.println(listaNombres[i]);
            }
        }
    }
}

