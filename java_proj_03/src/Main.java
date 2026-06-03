import model.*;
import service.BibliotecaService;
import util.Consola;

public class Main {

    public static void main(String[] args) {

        BibliotecaService biblioteca =
                new BibliotecaService();

        int opcion;

        do {

            System.out.println("\n===== BIBLIOTECA =====");

            System.out.println("1. Registrar alumno");
            System.out.println("2. Registrar MATERIAL");
            System.out.println("3. Mostrar materiales");
            System.out.println("4. Salir");

            opcion = Consola.leerEntero("Opción: ");

            switch (opcion) {

                case 1:

                    String matricula = Consola.leerTexto("Matrícula: ");
                    String nombre = Consola.leerTexto("Nombre: ");
                    String carrera = Consola.leerTexto("Carrera: ");
                    int cuatri = Consola.leerEntero("Cuatrimestre: ");
                    String correo = Consola.leerTexto("Correo: ");

                    biblioteca.agregarAlumno(new Alumno(matricula, nombre, carrera, cuatri, correo));

                    break;

                case 2:

                    String codigo =
                            Consola.leerTexto("Código: ");

                    String titulo =
                            Consola.leerTexto("Título: ");

                    String autor =
                            Consola.leerTexto("Autor: ");
                    
                    int tipo = Consola.leerEntero("Tipo: [1]Libro, [2]Revista, [3]Periodico, [4]Tésis -->");

                    switch (tipo) {
                        case 1:
                            
                             String isbn = Consola.leerTexto("ISBN: "); 
                             String editorial = Consola.leerTexto("Editorial: ");
                             int pag = Consola.leerEntero("Páginas: ");
                             MaterialBibliografico libro = new Libro(codigo, titulo, true, autor, isbn, editorial, pag);
                             biblioteca.agregarMaterial(libro);
                            break;
                        
                        case 2:
                            String edicion = Consola.leerTexto("Edicion: "); 
                            int mes = Consola.leerEntero("Mes de Publicación: ");
                            String categoria = Consola.leerTexto("Categoria: ");       
                            MaterialBibliografico revista = new Revista(codigo, titulo, true, edicion, mes ,categoria );
                            biblioteca.agregarMaterial(revista);
                        break;
                        default:
                            break;
                    }

                    

                    break;

                case 3:

                    biblioteca.mostrarMateriales();

                    break;
            }

        } while (opcion != 4);
    }
}