package minji;

import java.util.Scanner;

public class Input {

    Scanner scanner = new Scanner(System.in);
    private ListMemory listMemory;

    public Input(ListMemory listMemory){
        this.listMemory = listMemory;
    }

    public void addTodo(){
        System.out.println("할 일을 입력해주세요: ");
        String todo = scanner.nextLine();
        Task task = new Task(todo, false);
        listMemory.save(task);
        System.out.println("저장되었습니다.");
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
            System.out.println("상태를 수정하였습니다.");
        }
    }

    public void deleteTodo(){
        int isEmpty = listMemory.displayTasks();
        if(isEmpty != 0){
            System.out.println("삭제할 일의 번호를 선택해주세요: ");
            int taskNumber = scanner.nextInt();
            listMemory.deleteTask(taskNumber);
            System.out.println("선택한 일을 삭제하였습니다.");
        }
    }
}
