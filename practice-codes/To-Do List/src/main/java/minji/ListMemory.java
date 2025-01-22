package minji;

import java.util.ArrayList;
import java.util.List;

public class ListMemory {

    private static final int INDEX_OFFSET = 1;
    private static final String COMPLETED = "(완료)";
    private static final String UNCOMPLETED = "(미완료)";
    private List<Task> tasks = new ArrayList<>();

    public void save(Task task){
        tasks.add(task);
    }

    public void deleteTask(int taskNumber){
        int id = taskNumber - INDEX_OFFSET;
        Task task = tasks.get(id);
        tasks.remove(task);
    }

    public boolean displayTasks(){
        if(tasks.isEmpty()){
            return true;
        }
        else{
            for(int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.println((i + INDEX_OFFSET) + " " + task.getTask() + " " + (task.isCheck() ? COMPLETED : UNCOMPLETED));
            }
            return false;
        }
    }

    public void updateTask(int taskNumber){
        int id = taskNumber - INDEX_OFFSET;
        Task task = tasks.get(id);
        task.setCheck(!task.isCheck());
    }
}
