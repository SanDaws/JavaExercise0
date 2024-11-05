import java.util.Scanner;

public class Task {
    private enum TaskState{
        ToDo,InProgress,Done,Delay
    }

    public String Name;
    public String Description;
    public TaskState TaskStatus;


    public Task(String Name,String descripcion){
        this.Name=Name;
        this.Description=descripcion;
        TaskStatus=TaskState.ToDo;
    }
    public String format(){
        String formated= String.format("""
                Name:%s
                Descripton: %s
                Status: %s""" ,Name,Description,TaskStatus);
        return formated;
    }

    public void ChangeStatus(){
        Scanner sc= new Scanner(System.in);
        System.out.println("""
                1: to Do
                2: in progress
                3: delay
                4: done""");
        int option= sc.nextInt();
        switch (option){
            case 1:
                TaskStatus=TaskState.ToDo;
            case 2:
                TaskStatus=TaskState.InProgress;
            case 3:
                TaskStatus=TaskState.Delay;
            case 4:
                TaskStatus=TaskState.Done;
            default:
                System.out.print("imposible");
                ChangeStatus();
        }

    }

}
