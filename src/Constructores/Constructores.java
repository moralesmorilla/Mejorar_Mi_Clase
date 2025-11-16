package Constructores;



//Como usaremos los COnstructores
public class Constructores{
    private String nombre,email;
    private int edad,numero;
    private boolean casado;


        public Constructores(String nombre,String email,int edad,int numero,boolean casado){
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.email = email;
        this.casado = casado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getEdad() {
        return edad;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isCasado() {
        return casado;
    }
}
