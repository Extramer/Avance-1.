import java.util.ArrayList;

public class Gestor {
    private ArrayList<Subasta> subastas;
    private ArrayList<Oferta> ofertas;
    private ArrayList<Usuario> usuarios;

    public Gestor() {
        this.subastas = new ArrayList<>();
        this.ofertas = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void registrarColeccionista(String nombre, String identificacion, int edad, String contraseña, String correo, String direccion) {
        Coleccionista coleccionista = new Coleccionista(nombre, correo, contraseña, edad, identificacion, 0, direccion);
        usuarios.add(coleccionista);
    }

    public ArrayList<String> listarUsuarios() {
        ArrayList<String> lista = new ArrayList<>();
        for (Usuario usuario : usuarios) {
            lista.add(usuario.toString());
        }
        return lista;
    }

    public void crearSubasta(String fechaVencimiento, double precioMinimo, String estado) {
        subastas.add(new Subasta(fechaVencimiento, precioMinimo, estado));
    }

    public ArrayList<String> listarSubastas() {
        ArrayList<String> lista = new ArrayList<>();
        for (Subasta subasta : subastas) {
            lista.add(subasta.toString());
        }
        return lista;
    }

    public void crearOferta(String nombreOferta, double montoOferta) {
        ofertas.add(new Oferta(nombreOferta, montoOferta));
    }

    public ArrayList<String> listarOfertas() {
        ArrayList<String> lista = new ArrayList<>();
        for (Oferta oferta : ofertas) {
            lista.add(oferta.toString());
        }
        return lista;
    }
}

