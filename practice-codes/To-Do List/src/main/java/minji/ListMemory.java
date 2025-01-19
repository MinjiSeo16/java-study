package minji;

import java.util.ArrayList;

public class ListMemory {

    private ArrayList<Task> tasks = new ArrayList<>();
    private static final int INDEX_OFFSET = 1;

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
            System.out.println("등록된 일이 없습니다.");
            return 0;
        }
        else{
            for(int i = 0; i < tasks.size(); i++){
                Task task = tasks.get(i);
                System.out.println((i + INDEX_OFFSET) + " " + task.getTask() + " " + (task.isCheck() ? "(완료)" : "(미완료)"));
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
