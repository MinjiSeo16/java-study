package minji;

public class ViewTodo {
    public static void execute(){

        System.out.println("할 일 목록 !!");
        System.out.println("-------------");
        ListMemory.displayTasks();
        System.out.println("-------------");
    }
}
