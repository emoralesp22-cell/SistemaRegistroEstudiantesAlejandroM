import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GestorEstudiantes gestor = new GestorEstudiantes();

        int opcion;

        do {
            System.out.println("\n1. Agregar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    ESTUDIANTE nuevo = new ESTUDIANTE(id, nombre, edad);
                    gestor.agregarEstudiante(nuevo);
                    break;

                case 2:
                    gestor.listarEstudiantes();
                    break;

                case 3:
                    System.out.print("Ingrese ID a buscar: ");
                    int buscar = sc.nextInt();

                    ESTUDIANTE e = gestor.buscarEstudiante(buscar);

                    if (e != null) {
                        System.out.println(e);
                    } else {
                        System.out.println("No encontrado");
                    }
                    break;
            }

        } while (opcion != 0);
    }
}