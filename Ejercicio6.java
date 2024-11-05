import java.util.Scanner;
public class Ejercicio6 {


    private static int rows = 5;
    private static int columns = 5;
    private static char[][] seatsList = new char[rows][columns];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Start();
        Show();

        boolean continuar = true;
        while (continuar) {
            Reserve();
            Show();
            continuar = continueQ();
        }
        System.out.println("¡Gracias por usar el sistema de reservas del cine!");
    }

    private static void Start() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                seatsList[i][j] = 'O';
            }
        }
    }

    private static void Show() {
        System.out.println("Estado actual de los asientos:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(seatsList[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void Reserve() {
        int fila, columna;
        boolean reservado = false;

        while (!reservado) {
            System.out.print("Ingrese el número de fila (0 a 4): ");
            fila = sc.nextInt();
            System.out.print("Ingrese el número de columna (0 a 4): ");
            columna = sc.nextInt();

            if (LookSeat(fila, columna)) {
                if (seatsList[fila][columna] == 'O') {
                    seatsList[fila][columna] = 'X';
                    System.out.println("Asiento reservado con éxito.");
                    reservado = true;
                } else {
                    System.out.println("El asiento ya está ocupado, por favor elija otro.");
                }
            } else {
                System.out.println("Selección inválida, intente de nuevo.");
            }
        }
    }

    private static boolean LookSeat(int fila, int columna) {
        return fila >= 0 && fila < rows && columna >= 0 && columna < columns;
    }


    private static boolean continueQ() {
        System.out.print("¿Desea reservar otro asiento? (s/n): ");
        char respuesta = sc.next().toLowerCase().charAt(0);
        return respuesta == 's';
    }
}


