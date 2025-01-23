package minji;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MemoryStore {

    private static final int INDEX_OFFSET = 1;
    private static final String COMPLETED = "(완료)";
    private static final String UNCOMPLETED = "(미완료)";
    private Map<String, List<Task>> tasks = new HashMap<>();

    public void register(String name){
        tasks.put(name, new ArrayList<>());
    }

    public boolean existName(String name){
        if(tasks.containsKey(name)){
            return true;
        }
        return false;
    }

    public void save(String name, Task task){
        tasks.get(name).add(task);
    }

    public void deleteTask(String name, int taskNumber){
        int id = taskNumber - INDEX_OFFSET;
        List<Task> task = tasks.get(name);
        if(!task.isEmpty()){
            task.remove(id);
        }
    }

    public boolean displayTasks(String name){
        if(tasks.get(name).isEmpty()){
            return true;
        }
        else{
            for(int i = 0; i < tasks.get(name).size(); i++){
                Task task = tasks.get(name).get(i);
                System.out.println((i + INDEX_OFFSET) + " " + task.getTask() + " " + (task.isCheck() ? COMPLETED : UNCOMPLETED));
            }
            return false;
        }
    }

    public void updateTask(String name, int taskNumber){
        int id = taskNumber - INDEX_OFFSET;
        Task task = tasks.get(name).get(id);
        task.setCheck(!task.isCheck());
    }
}
