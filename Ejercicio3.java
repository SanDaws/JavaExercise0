import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio3 {


    private static ArrayList<Task> taskList = new ArrayList<Task>(10);
    private static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
    Menu();
        
    }
    public static void Menu(){

        String Menuformat= """
                menu:
                0: ver
                1: agregar
                2: editar
                3: eliminar
                4: Cambiar estado
               
                """;
        System.out.println(Menuformat);
        int option= sc.nextInt();
        switch (option){
            case 0:
                Show();
            case 1:
                Create();
            case 2:
                Edit();
            case 3:
                Delete();
            case 4:
                Changephase();
            default:
                System.out.println("error");
                Menu();
        }
    }


    public static void Show(){
        for (Task task: taskList){
            System.out.println(taskList.indexOf(task) + ":");
            System.out.println(task.format());
        }
        Menu();
   }
   public static void Create (){
       System.out.println("Enter the new Task name: ");
       String name= sc.nextLine();

       System.out.println("Enter the new Task Description: ");
       String description=sc.nextLine();

       taskList.add(new Task(name,description));

       Menu();
   }
   public static void Edit(){
       Show();
        System.out.print("de las tareas anteriores  cual desea editar: ");
       int index=sc.nextInt();
       System.out.println(String.format("previous name: %s",taskList.get(index).Name));
       System.out.print("Enter the new Task name: ");
       String name=sc.nextLine();

       System.out.println(String.format("previous name: %s",taskList.get(index).Description));
       System.out.println("Enter the new Task Description: ");
       String description=sc.nextLine();

       taskList.set(index,new Task(name,description));
       System.out.println(taskList.get(index).format());
       Menu();
   }


   public static void Changephase(){
       Show();
       System.out.print("de las tareas anteriores  cual desea editar: ");
       int index=sc.nextInt();
       taskList.get(index).ChangeStatus();
       Menu();
   }
    private static void Delete() {
        Show();
        System.out.print("de las tareas anteriores  cual desea eliminar: ");
        int index=sc.nextInt();
        taskList.remove(index);

    }
}
