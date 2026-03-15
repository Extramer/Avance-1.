public class Moderador extends Usuario {
    public Moderador() {}
    public Moderador(String nombre, String correo, String contraseña, int edad, String identificacion) {
        super(nombre, correo, contraseña, edad, identificacion);
    }
}

class Coleccionista extends Usuario {
    private int puntuacion;
    private String direccion;

    public Coleccionista() {}
    public Coleccionista(String nombre, String correo, String contraseña, int edad, String identificacion, int puntuacion, String direccion) {
        super(nombre, correo, contraseña, edad, identificacion);
        this.puntuacion = puntuacion;
        this.direccion = direccion;
    }
}

