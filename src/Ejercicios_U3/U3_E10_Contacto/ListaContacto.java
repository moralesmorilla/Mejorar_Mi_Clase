package Ejercicios_U3.U3_E10_Contacto;

public class ListaContacto {
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
                listaContacto[i]=c;
                System.out.println("Contacto añadido");
                return;
            }

        }

        System.out.println("La lista esta llena");
    }
    //Crear metodos sobrecargados que nos permitan buscar contacto
    public Contacto buscarContactoEmail(String email){
        for (int i=0;i<listaContacto.length;i++){
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getEmail().equals(email)){
                System.out.println(actual);
                return actual;
            }
        }
        System.out.println("Contacto no encontrado");
        return null;
    }
    public Contacto buscarContactoTelefono(String telefono){
        for (int i=0;i<listaContacto.length;i++){
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getTelefono().equals(telefono)){
                System.out.println(actual);
                return actual;
            }
        }
        System.out.println("Contacto no encontrado");
        return null;
    }
    public Contacto buscarContactoNombreApellido(String nombre, String apellidos){
        for (int i=0;i<listaContacto.length;i++){
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getNombre().equals(nombre)
                    && actual.getApellidos().equals(apellidos)){
                System.out.println(actual);
                return actual;
            }
        }
        System.out.println("Contacto no encontrado");
        return null;
    }

    public void borrarContactoNombreApellido(String nombre, String apellidos){
        for (int i = 0; i < listaContacto.length; i++) {
            Contacto actual = listaContacto[i];
            if (actual!=null
                    && actual.getNombre().equals(nombre)
                    && actual.getApellidos().equals(apellidos)){
                System.out.println(nombre+" "+apellidos+" "+"han sido borrados");
                listaContacto[i]=null;
                System.out.println("El Usuario con :"+actual.getNombre()+" "+actual.getApellidos()
                        +" ha sido eliminado");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }
    public void borrarContactoTelefono(String telefono){
        for (int i = 0; i < listaContacto.length; i++) {
            Contacto actual = listaContacto[i];
            if (actual!=null && actual.getTelefono().equals(telefono)){
                listaContacto[i]=null;
                System.out.println("El Usuario con telefono: "+actual.getTelefono()+" ha sido eliminado");
                return;
            }
        }
        System.out.println("Usuario no encontrado");
    }
    public void borrarContactoEmail(String email){
        for (int i = 0; i < listaContacto.length; i++) {
            Contacto actual = listaContacto[i];
            if (actual!=null &&
            actual.getEmail().equals(email)){
                System.out.println("El usuario "+actual.getNombre()+
                        "con email: "+actual.getEmail()+" ha sido eliminado");
            }
        }
        System.out.println("Usuario no encontrado");
    }

    public void vaciarLista(){
        for (int i = 0; i < listaContacto.length; i++) {
            listaContacto[i]=null;
        }
    }
    public void listarContactos(){
        for (int i=0;i<listaContacto.length;i++) {
            Contacto actual = listaContacto[i];
            if(listaContacto[i]!=null){

                System.out.println("Usuario "+(i+1));
                System.out.println(actual.getNombre()+" "+actual.getApellidos());
                System.out.println("Telefono: "+actual.getTelefono());
                System.out.println("Email: "+actual.getTelefono());
                System.out.println("---------------------------");
            }

        }
    }
}
