    import java.util.Scanner;
public class Ejercicio9 {

        private static final int NUM_EMPLOYEE = 5;
        private static String[] employee = new String[NUM_EMPLOYEE];
        private static int[] calification = new int[NUM_EMPLOYEE];
        private static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
            CreateEmployee();
            Calificate();
            mostrarResultados();
        }
        private static void CreateEmployee() {
            System.out.println("Ingrese los nombres de los empleados:");
            for (int i = 0; i < NUM_EMPLOYEE; i++) {
                System.out.print("Nombre del empleado " + (i + 1) + ": ");
                employee[i] = sc.nextLine();
            }
        }

        private static void Calificate() {
            System.out.println("\nAsignar calificaciones de desempeño (1 a 10) a los empleados:");
            for (int i = 0; i < NUM_EMPLOYEE; i++) {
                int calification;
                do {
                    System.out.print("Calificación para " + employee[i] + ": ");
                    calification = sc.nextInt();
                    if (calification < 1 || calification > 10) {
                        System.out.println("Calificación inválida. Debe estar entre 1 y 10.");
                    }
                } while (calification < 1 || calification > 10);
                Ejercicio9.calification[i] = calification;
            }
        }
        private static void mostrarResultados() {
            int indiceMax = 0;
            int indiceMin = 0;

            for (int i = 1; i < NUM_EMPLOYEE; i++) {
                if (calification[i] > calification[indiceMax]) {
                    indiceMax = i;
                }
                if (calification[i] < calification[indiceMin]) {
                    indiceMin = i;
                }
            }

            System.out.println("\n--- Resultados de Evaluación de Desempeño ---");
            System.out.println("Empleado con la calificación más alta: " + employee[indiceMax] + " (Calificación: " + calification[indiceMax] + ")");
            System.out.println("Empleado con la calificación más baja: " + employee[indiceMin] + " (Calificación: " + calification[indiceMin] + ")");
        }
    }


