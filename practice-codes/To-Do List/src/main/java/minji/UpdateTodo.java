package minji;

import java.util.Scanner;

public class UpdateTodo {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);

        int isEmpty = ListMemory.displayTasks();
        if(isEmpty != 0){
            System.out.println("상태를 수정할 번호를 선택해주세요: ");
            int updateNum = scanner.nextInt();
            ListMemory.updateTask(updateNum);
            System.out.println("상태를 수정하였습니다.");
        }
    }
}
