package minji;

import java.util.ArrayList;

public class ListMemory {

    static ArrayList<Task> tasks = new ArrayList<>();

    public static void save(Task task){
        tasks.add(task);
    }

    public static void deleteTask(int taskNumber){
        int id = taskNumber - 1;
        Task task = tasks.get(id);
        tasks.remove(task);
    }

    public static int displayTasks(){
        if(tasks.isEmpty()){
            System.out.println("등록된 일이 없습니다.");
            return 0;
        }
        else{
            for(int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.println((i + 1) + " " + task.getTask() + " " + (task.isCheck() ? "(완료)" : "(미완료)"));
            }
            return 1;
        }
    }

    public static void updateTask(int taskNumber){
        int id = taskNumber - 1;
        Task task = tasks.get(id);
        task.setCheck(!task.isCheck());
    }
}
