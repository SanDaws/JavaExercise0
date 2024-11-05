import java.util.Scanner;
public class Ejericio10 {


    private static final int NUM_CLIENTES = 10;
    private static int[] calificaciones = new int[NUM_CLIENTES];
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Insert();
        double promedio = CalcMedia();
        int clientesMaximaCalificacion = MaxCalification();

        System.out.printf("Promedio de satisfacción: %.2f%n", promedio);
        System.out.println("Número de clientes que dieron la calificación máxima (5): " + clientesMaximaCalificacion);
    }

    private static void Insert() {
        System.out.println("Encuesta de satisfacción (califique del 1 al 5):");
        for (int i = 0; i < NUM_CLIENTES; i++) {
            int calificacion;
            do {
                System.out.print("Calificación del cliente " + (i + 1) + ": ");
                calificacion = sc.nextInt();
                if (calificacion < 1 || calificacion > 5) {
                    System.out.println("Calificación inválida. Debe estar entre 1 y 5.");
                }
            } while (calificacion < 1 || calificacion > 5);
            calificaciones[i] = calificacion;
        }
    }

    private static double CalcMedia() {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / NUM_CLIENTES;
    }
    private static int MaxCalification() {
        int contador = 0;
        for (int calificacion : calificaciones) {
            if (calificacion == 5) {
                contador++;
            }
        }
        return contador;
    }
}


