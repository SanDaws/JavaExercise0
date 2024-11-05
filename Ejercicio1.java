
import javax.swing.JOptionPane;
public class Ejercicio1 {
    public static void main(String[] args) {
        int _age=0;
        try {
            _age= Integer.parseInt(JOptionPane.showInputDialog("age?"));
        } catch (NumberFormatException e) {
            System.out.println( "imposible de tratar");
        }
        System.out.println(_age<= 18 ?"acceso denegado":"acceso concedido");
        
    }

}
