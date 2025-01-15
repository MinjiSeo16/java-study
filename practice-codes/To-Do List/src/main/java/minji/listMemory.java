package minji;

import java.util.ArrayList;

public class listMemory {

    static ArrayList<Task> list = new ArrayList<>();

    public static void save(Task task){
        list.add(task);
    }

    public static void delete(int updateNum){
        int id = updateNum - 1;
        Task task = list.get(id);
        list.remove(task);
    }

    public static int view(){
        if(list.isEmpty()){
            System.out.println("등록된 일이 없습니다.");
            return 0;
        }
        else{
            for(int i = 0; i < list.size(); i++){
                Task task = list.get(i);
                System.out.println((i + 1) + " " + task.getTask() + " " + (task.getCheck() ? "(완료)" : "(미완료)"));
            }
            return 1;
        }
    }

    public static void update(int updateNum){
        int id = updateNum - 1;
        Task task = list.get(id);
        task.setCheck(!task.getCheck());
    }
}
