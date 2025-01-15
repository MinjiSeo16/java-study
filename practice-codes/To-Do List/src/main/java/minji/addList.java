package minji;

import java.util.Scanner;

public class addList {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("할 일을 입력해주세요: ");
        String toDo = scanner.nextLine();

        Task task = new Task(toDo, false);
        listMemory.save(task);
        System.out.println("저장되었습니다.");
    }
}
