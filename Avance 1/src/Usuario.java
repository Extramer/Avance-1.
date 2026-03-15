/**
 * Clase que representa a un usuario base dentro del sistema.
 */
public class Usuario {
    protected String nombre;
    protected String correo;
    protected String contraseña;
    protected int edad;
    protected String identificacion;

    /**
     * Constructor por defecto de la clase Usuario.
     */
    public Usuario() {}

    /**
     * Constructor para inicializar un nuevo Usuario con todos sus datos.
     * @param nombre Nombre completo del usuario.
     * @param correo Correo electrónico del usuario.
     * @param contraseña Contraseña para acceder al sistema.
     * @param edad Edad del usuario en años.
     * @param identificacion Número de identificación o cédula.
     */
    public Usuario(String nombre, String correo, String contraseña, int edad, String identificacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.edad = edad;
        this.identificacion = identificacion;
    }

    /**
     * @return El nombre del usuario.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre El nuevo nombre a asignar.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return El correo del usuario.
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo El nuevo correo a asignar.
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return La contraseña del usuario.
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * @param contraseña La nueva contraseña a asignar.
     */
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    /**
     * @return La edad del usuario.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad La nueva edad a asignar.
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * @return La identificación del usuario.
     */
    public String getIdentificacion() {
        return identificacion;
    }

    /**
     * @param identificacion La nueva identificación a asignar.
     */
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    /**
     * @return Representación en formato de texto de los atributos del usuario.
     */
    @Override
    public String toString() {
        return "Usuario{" +
                "Nombre='" + nombre + '\'' +
                ", Correo='" + correo + '\'' +
                ", Contraseña='" + contraseña + '\'' +
                ", Edad=" + edad +
                ", Identificacion='" + identificacion + '\'' +
                '}';
    }
}