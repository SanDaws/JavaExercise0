import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio11 {
    private static ArrayList<String> product = new ArrayList<>();
    private static ArrayList<Integer> Cuantity = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    actualizarCantidad();
                    break;
                case 3:
                    ShowInventory();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema de gestión de inventario.");
                    break;
                default:
                    System.out.println("Opción no válida, por favor intente de nuevo.");
            }
        }
    }

    private static void mostrarMenu() {
        System.out.println("""
        --- Sistema de Gestión de Inventario ---
        1. Agregar nuevo producto
        2. Actualizar cantidad de producto
        3. Mostrar inventario
        4. Salir
        Seleccione una opción: """);
    }

    private static void agregarProducto() {
        System.out.print("Ingrese el nombre del producto: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cantidad en stock del producto: ");
        int cantidad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer

        product.add(nombre);
        Cuantity.add(cantidad);
        System.out.println("Producto agregado exitosamente.");
    }

    private static void actualizarCantidad() {
        System.out.print("Ingrese el nombre del producto a actualizar: ");
        String nombre = sc.nextLine();

        int indice = product.indexOf(nombre);
        if (indice != -1) {
            System.out.print("Ingrese la nueva cantidad en stock: ");
            int nuevaCantidad = sc.nextInt();
            sc.nextLine(); // Limpiar el buffer

            Cuantity.set(indice, nuevaCantidad);
            System.out.println("Cantidad actualizada exitosamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    private static void ShowInventory() {
        System.out.println("\n--- Inventario de Productos ---");
        if (product.isEmpty()) {
            System.out.println("No hay productos en el inventario.");
        } else {
            for (int i = 0; i < product.size(); i++) {
                System.out.println("Producto: " + product.get(i) + ", Cantidad en stock: " + Cuantity.get(i));
            }
        }
    }
}


