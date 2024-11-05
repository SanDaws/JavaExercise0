import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio4 {

    public static ArrayList<Producto> inventory= new ArrayList<Producto>();


    public static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void Show(){
        for (Producto producto: inventory){
            System.out.println(inventory.indexOf(producto) + ":");
            System.out.println(producto.format());
        }
    }
    public static void Create (){
        System.out.println("Enter the new Task name: ");
        String name= sc.next();

        System.out.println("Enter the new Task Description: ");
        int amount=sc.nextInt();
            Producto producto= new Producto(name,amount);

        inventory.add(producto);
    };
    public static void Edit(){
        Show();
        System.out.print("de las tareas anteriores  cual desea editar: ");
        int index=sc.nextInt();
        System.out.println(String.format("previous name: %s",inventory.get(index).Name));
        System.out.print("Enter the new Task name: ");
        String name=sc.nextLine();

        System.out.println(String.format("previous name: %s",inventory.get(index).Amount));
        System.out.println("Enter the new Task Description: ");
        int amount=sc.nextInt();

        inventory.set(index,new Producto(name,amount));
        System.out.println(inventory.get(index).format());
    }


}
