
import java.util.Scanner;


public class Ejercicio2 {
    private static  int Capacity=100;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do { 
            System.out.print("cantidad de boletas a reservar: ");
            int cuantity=0;
        try {
            cuantity= Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println( "imposible de tratar");
            continue;
        }
        if (cuantity<0 || cuantity> Capacity) {
            throw  new IllegalArgumentException("Out of range exception");
        }
        Capacity-=cuantity;
        System.out.println(String.format("quedan %d entradas", Capacity));
        
        } while (Capacity>0);

    }
}
