package minji;

import java.util.Scanner;

public class AddTask {
    public static void execute(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("할 일을 입력해주세요: ");
        String todo = scanner.nextLine();

        Task task = new Task(todo, false);
        ListMemory.save(task);
        System.out.println("저장되었습니다.");
    }
}
