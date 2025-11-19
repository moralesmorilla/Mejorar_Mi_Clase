package Ejercicios_U3.U3_E10_Contacto;

public class Contacto {
    private String nombre,apellidos,email,telefono;

    public Contacto(){

    }

    public Contacto(String nombre, String apellidos) {
        assert nombre!=null && !nombre.isEmpty():"Error:Nombre debe de estar relleno";
        assert apellidos!=null && !apellidos.isEmpty():"Error:Apellido debe de estar relleno";
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public Contacto(String nombre, String apellidos, String email, String telefono) {
        assert nombre!=null && !nombre.isEmpty():"Error:Nombre debe de estar relleno";
        assert apellidos!=null && !apellidos.isEmpty():"Error:Apellido debe de estar relleno";
        assert email!=null && !email.trim().isEmpty():"Error:Emal debe de estar relleno";
        assert telefono!=null :"Error:Debes introducir un numero";
        assert telefono.length()!=9:"Error:El numero debe ser de 9 digitos";
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }
    public void imprimirDatos(){
        System.out.println(nombre+" "+apellidos+" con numero "+telefono+" cuyo email es "+email);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
