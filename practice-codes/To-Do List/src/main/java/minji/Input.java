package minji;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    private ListMemory listMemory;
    private Output output = new Output();

    public Input(ListMemory listMemory){
        this.listMemory = listMemory;
    }

    public void addTodo(){
        System.out.println("할 일을 입력해주세요: ");
        String todo = scanner.nextLine();
        Task task = new Task(todo, false);
        listMemory.save(task);
        output.save();
    }

    public void viewTodo(){
        System.out.println("할 일 목록 !!");
        System.out.println("-------------");
        listMemory.displayTasks();
        System.out.println("-------------");
    }

    public void updateTodo(){
        int isEmpty = listMemory.displayTasks();
        if(isEmpty != 0){
            System.out.println("상태를 수정할 번호를 선택해주세요: ");
            int updateNum = scanner.nextInt();
            listMemory.updateTask(updateNum);
            output.update();
        }
    }

    public void deleteTodo(){
        int isEmpty = listMemory.displayTasks();
        if(isEmpty != 0){
            System.out.println("삭제할 일의 번호를 선택해주세요: ");
            int taskNumber = scanner.nextInt();
            listMemory.deleteTask(taskNumber);
            output.delete();
        }
    }
}
