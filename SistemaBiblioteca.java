import java.util.ArrayList;
import java.util.Scanner;

class Publicacion {
    protected String titulo;
    protected String autor;

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo + ", Autor: " + autor);
    }
}

class Libro extends Publicacion {
    private int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de paginas: " + numPaginas);
    }
}

class Socio {
    private String nombre;
    private String id;

    public Socio(String nombre, String id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + ", ID: " + id);
    }
}

class Biblioteca {
    private ArrayList<Publicacion> publicaciones;
    private ArrayList<Socio> socios;

    public Biblioteca() {
        publicaciones = new ArrayList<>();
        socios = new ArrayList<>();
    }

    public void agregarPublicacion(Publicacion publicacion) {
        publicaciones.add(publicacion);
    }

    public void listarPublicaciones() {
        for (Publicacion publicacion : publicaciones) {
            publicacion.mostrarInfo();
        }
    }

    public void buscarPublicacionPorTitulo(String titulo) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getTitulo().equalsIgnoreCase(titulo)) {
                publicacion.mostrarInfo();
                return;
            }
        }
        System.out.println("Publicacion no encontrada.");
    }

    public void eliminarPublicacionPorTitulo(String titulo) {
        for (Publicacion publicacion : publicaciones) {
            if (publicacion.getTitulo().equalsIgnoreCase(titulo)) {
                publicaciones.remove(publicacion);
                System.out.println("Publicacion eliminada.");
                return;
            }
        }
        System.out.println("Publicacion no encontrada.");
    }

    public void agregarSocio(Socio socio) {
        socios.add(socio);
    }

    public void listarSocios() {
        for (Socio socio : socios) {
            socio.mostrarInfo();
        }
    }

    public void buscarSocioPorId(String id) {
        for (Socio socio : socios) {
            if (socio.getId().equalsIgnoreCase(id)) {
                socio.mostrarInfo();
                return;
            }
        }
        System.out.println("Socio no encontrado.");
    }

    public void eliminarSocioPorId(String id) {
        for (Socio socio : socios) {
            if (socio.getId().equalsIgnoreCase(id)) {
                socios.remove(socio);
                System.out.println("Socio eliminado.");
                return;
            }
        }
        System.out.println("Socio no encontrado.");
    }
}

public class SistemaBiblioteca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcion;

        do {
            System.out.println("\nSistema de Biblioteca");
            System.out.println("1. Agregar Libro");
            System.out.println("2. Listar Publicaciones");
            System.out.println("3. Buscar Publicacion por Titulo");
            System.out.println("4. Eliminar Publicacion por Titulo");
            System.out.println("5. Agregar Socio");
            System.out.println("6. Listar Socios");
            System.out.println("7. Buscar Socio por ID");
            System.out.println("8. Eliminar Socio por ID");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de linea

            switch (opcion) {
                case 1:
                    System.out.print("Titulo del libro: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();
                    System.out.print("Numero de paginas: ");
                    int numPaginas = scanner.nextInt();
                    scanner.nextLine(); // Consumir el salto de linea
                    biblioteca.agregarPublicacion(new Libro(titulo, autor, numPaginas));
                    break;
                case 2:
                    biblioteca.listarPublicaciones();
                    break;
                case 3:
                    System.out.print("Ingrese el titulo de la publicacion a buscar: ");
                    String tituloBuscar = scanner.nextLine();
                    biblioteca.buscarPublicacionPorTitulo(tituloBuscar);
                    break;
                case 4:
                    System.out.print("Ingrese el titulo de la publicacion a eliminar: ");
                    String tituloEliminar = scanner.nextLine();
                    biblioteca.eliminarPublicacionPorTitulo(tituloEliminar);
                    break;
                case 5:
                    System.out.print("Nombre del socio: ");
                    String nombre = scanner.nextLine();
                    System.out.print("ID del socio: ");
                    String id = scanner.nextLine();
                    biblioteca.agregarSocio(new Socio(nombre, id));
                    break;
                case 6:
                    biblioteca.listarSocios();
                    break;
                case 7:
                    System.out.print("Ingrese el ID del socio a buscar: ");
                    String idBuscar = scanner.nextLine();
                    biblioteca.buscarSocioPorId(idBuscar);
                    break;
                case 8:
                    System.out.print("Ingrese el ID del socio a eliminar: ");
                    String idEliminar = scanner.nextLine();
                    biblioteca.eliminarSocioPorId(idEliminar);
                    break;
                case 9:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
