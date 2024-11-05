import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio7 {


    private static ArrayList<String> reservations = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("""
             Bienvenido al sistema de reservas del restaurante.
             1. Agregar una reserva
             2. Cancelar una reserva
             3. Mostrar reservas confirmadas
             4. Salir
           Seleccione una opción: """);
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addReservation();
                    break;
                case 2:
                    cancelReservation();
                    break;
                case 3:
                    showReservations();
                    break;
                case 4:
                    continueProgram = false;
                    System.out.println("¡Gracias por usar el sistema de reservas del restaurante!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione nuevamente.");
            }
        }
    }


    private static void addReservation() {
        System.out.print("Ingrese el nombre para la reserva: ");
        String name = scanner.nextLine();
        reservations.add(name);
        System.out.println("Reserva agregada con éxito para " + name + ".");
    }

    private static void cancelReservation() {
        System.out.print("Ingrese el nombre de la reserva que desea cancelar: ");
        String name = scanner.nextLine();

        if (reservations.remove(name)) {
            System.out.println("Reserva cancelada con éxito para " + name + ".");
        } else {
            System.out.println("No se encontró una reserva con ese nombre.");
        }
    }
    private static void showReservations() {
        System.out.println("Reservas confirmadas:");
        if (reservations.isEmpty()) {
            System.out.println("No hay reservas.");
        } else {
            for (String reservation : reservations) {
                System.out.println("- " + reservation);
            }
        }
    }
}




