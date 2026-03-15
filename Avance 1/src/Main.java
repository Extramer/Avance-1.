import java.util.Scanner;

public class Main {
    static Gestor miGestor = new Gestor(); // La única conexión con la lógica
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("\n1. Registro usuarios\n2. Listar usuarios\n3. Crear subasta\n4. Listar subastas\n5. Crear oferta\n6. Listar ofertas\n7. Salir"); // [cite: 108-114]
            System.out.print("Elige: ");
            opcion = entrada.nextInt();
            entrada.nextLine(); // Limpiar el "enter"

            if (opcion == 1) {
                System.out.print("Nombre: "); String nom = entrada.nextLine();
                System.out.print("ID: "); String id = entrada.nextLine();
                System.out.print("Edad: "); int edad = entrada.nextInt(); entrada.nextLine();
                miGestor.registrarColeccionista(nom, id, edad, "123", "correo@.com", "San Jose");
                System.out.println("Coleccionista guardado!");
            } else if (opcion == 2) {
                System.out.println("Usuarios:");
                for (String linea : miGestor.listarUsuarios()) {
                    System.out.println(linea);
                }
            } else if (opcion == 3) {
                System.out.print("Fecha de vencimiento: "); String fecha = entrada.nextLine();
                System.out.print("Precio mínimo: "); double precio = entrada.nextDouble(); entrada.nextLine();
                System.out.print("Estado: "); String estado = entrada.nextLine();
                miGestor.crearSubasta(fecha, precio, estado);
                System.out.println("Subasta creada!");
            } else if (opcion == 4) {
                System.out.println("Subastas:");
                for (String linea : miGestor.listarSubastas()) {
                    System.out.println(linea);
                }
            } else if (opcion == 5) {
                System.out.print("Nombre oferta: "); String no = entrada.nextLine();
                System.out.print("Monto oferta: "); double mo = entrada.nextDouble(); entrada.nextLine();
                miGestor.crearOferta(no, mo);
                System.out.println("Oferta creada!");
            } else if (opcion == 6) {
                System.out.println("Ofertas:");
                for (String linea : miGestor.listarOfertas()) {
                    System.out.println(linea);
                }
            }
        }
    }
}