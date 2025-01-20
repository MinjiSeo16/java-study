package minji;

import java.util.ArrayList;

public class ListMemory {

    private ArrayList<Task> tasks = new ArrayList<>();
    private static final int INDEX_OFFSET = 1;
    private static final String COMPLETED = "(완료)";
    private static final String UNCOMPLETED = "(미완료)";
    private Output output = new Output();

    public void save(Task task){
        tasks.add(task);
    }

    public void deleteTask(int taskNumber){
        int id = taskNumber - INDEX_OFFSET;
        Task task = tasks.get(id);
        tasks.remove(task);
    }

    public int displayTasks(){
        if(tasks.isEmpty()){
            output.showEmptyList();
            return 0;
        }
        else{
            for(int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.println((i + INDEX_OFFSET) + " " + task.getTask() + " " + (task.isCheck() ? COMPLETED : UNCOMPLETED));
            }
            return 1;
        }
    }

    public void updateTask(int taskNumber){
        int id = taskNumber - INDEX_OFFSET;
        Task task = tasks.get(id);
        task.setCheck(!task.isCheck());
    }
}
