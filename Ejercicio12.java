import java.util.Scanner;
public class Ejercicio12 {


        private static double[] facturas = new double[3];
        private static String[] servicios = {"Electricidad", "Agua", "Internet"};
        private static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            ingresarMontos();
            double total = calcularTotal();

            System.out.printf("El total a pagar es: %.2f%n", total);

            while (total > 0) {
                total = pagarFactura(total);
                System.out.printf("Total restante: %.2f%n", total);
            }

            System.out.println("¡Todas las facturas han sido pagadas!");
        }

        private static void ingresarMontos() {
            System.out.println("Ingrese el monto de las facturas:");
            for (int i = 0; i < facturas.length; i++) {
                System.out.print("Monto para " + servicios[i] + ": ");
                facturas[i] = scanner.nextDouble();
            }
        }

        private static double calcularTotal() {
            double total = 0;
            for (double factura : facturas) {
                total += factura;
            }
            return total;
        }

        private static double pagarFactura(double total) {
            System.out.println("\nSeleccione la factura que desea pagar:");
            for (int i = 0; i < servicios.length; i++) {
                System.out.printf("%d. %s - Monto: %.2f%n", i + 1, servicios[i], facturas[i]);
            }
            System.out.print("Ingrese el número de la factura: ");
            int opcion = scanner.nextInt() - 1;

            if (opcion >= 0 && opcion < facturas.length) {
                if (facturas[opcion] > 0) {
                    total -= facturas[opcion];
                    System.out.printf("Ha pagado la factura de %s por %.2f%n", servicios[opcion], facturas[opcion]);
                    facturas[opcion] = 0;
                } else {
                    System.out.println("Esta factura ya ha sido pagada.");
                }
            } else {
                System.out.println("Opción no válida, intente nuevamente.");
            }
            return total;
        }
    }


