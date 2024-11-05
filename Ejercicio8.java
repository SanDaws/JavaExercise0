import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio8 {

    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    Add();
                    break;
                case 2:
                    Show();
                    break;
                case 3:
                    Search();
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Saliendo del sistema de gestión de estudiantes.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.print("""
                --- Sistema de Gestión de Estudiantes ---
            1. Agregar nuevo estudiante
            2. Mostrar lista de estudiantes
            3. Buscar estudiante por nombre
            4. Salir
             Seleccione una opción: 
                """);
    }

    private static void Add() {
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese el promedio del estudiante: ");
        double promedio = scanner.nextDouble();
        scanner.nextLine();  // Limpiar el buffer

        Estudiante Student = new Estudiante(nombre, promedio);
        estudiantes.add(Student);
        System.out.println("Estudiante agregado exitosamente.");
    }

    private static void Show() {
        System.out.println("\n--- Lista de Estudiantes ---");
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante.Format());
            }
        }
    }
    private static void Search() {
        System.out.print("Ingrese el nombre del estudiante a buscar: ");
        String nombre = scanner.nextLine();

        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("Nombre: " + estudiante.getNombre() + ", Promedio: " + estudiante.getPromedio());
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Estudiante no encontrado.");
        }
    }
}




